package com.GradleProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testJsonCreation() {
        // Crear un objeto JSON
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", "John Doe");
        jsonObject.put("edad", 30);
        jsonObject.put("ciudad", "Bogotá");

        // Validar los valores
        assertEquals("John Doe", jsonObject.getString("nombre"));
        assertEquals(30, jsonObject.getInt("edad"));
        assertEquals("Bogotá", jsonObject.getString("ciudad"));
    }
}