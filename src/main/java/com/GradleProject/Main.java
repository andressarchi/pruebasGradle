package com.GradleProject;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto JSON
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", "John Doe");
        jsonObject.put("edad", 30);
        jsonObject.put("ciudad", "Bogotá");

        // Mostrar el objeto JSON en la consola
        System.out.println(jsonObject.toString(4)); // Formato bonito
    }
}
