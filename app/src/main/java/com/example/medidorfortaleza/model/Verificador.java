package com.example.medidorfortaleza.model;
// <>
public class Verificador {
    private int largoString;

    public boolean checkSize(String pass) {
        return pass.length() < 5;
    }

    public boolean checkCaps(String pass) {
        return pass.toLowerCase().equals(pass);
    }

    public String checkColor(String pass) {
        if (checkSize(pass)) {
            return "red";
        }
        else {
            if (checkCaps(pass)) {
                return "yellow";
            } else {
                return "green";
            }
        }
    }
}
