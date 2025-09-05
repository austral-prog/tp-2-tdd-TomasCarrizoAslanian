package com.tp2.stringcalculator;

public class StringCalculator {

    public int sumar(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }

        String[] partes = numeros.split("[,\n]");
        int suma = 0;
        StringBuilder negativos = new StringBuilder();

        for (String p : partes) {
            if (p.isBlank()) continue;
            int n = Integer.parseInt(p.trim());
            if (n < 0) {
                negativos.append(n).append(" ");
            }
            suma += n;
        }

        if (negativos.length() > 0) {
            throw new IllegalArgumentException("Números negativos no permitidos: " + negativos.toString().trim());
        }

        return suma;
    }



}
