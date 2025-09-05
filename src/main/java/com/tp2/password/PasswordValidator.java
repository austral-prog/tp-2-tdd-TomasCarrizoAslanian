package com.tp2.password;

public class PasswordValidator {

    public boolean esValida(String contraseña) {
        if (contraseña == null || contraseña.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        String especiales = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            else if (Character.isLowerCase(c)) tieneMinuscula = true;
            else if (Character.isDigit(c)) tieneNumero = true;
            else if (especiales.indexOf(c) >= 0) tieneEspecial = true;
        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial;
    }
}
