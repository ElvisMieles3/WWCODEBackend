package com.certificacion.backend.utils;

public class EndPoints {

    private static final String CONSULTAR_USUARIO = "/api/users/2";

    public static String obtener(String servicio) {

        switch (servicio) {
            case "consultar usuario":
                return CONSULTAR_USUARIO;
            case "":
                return null;
            default:
                return null;

        }
    }


}
