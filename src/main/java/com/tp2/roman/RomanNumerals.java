package com.tp2.roman;

public class RomanNumerals {

    private static final int[] VALORES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SIMBOLOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String convertir(int numero) {
        if (numero < 1 || numero > 3999) {
            throw new IllegalArgumentException("Número fuera de rango (1-3999): " + numero);
        }

        StringBuilder resultado = new StringBuilder();
        int restante = numero;

        for (int i = 0; i < VALORES.length; i++) {
            while (restante >= VALORES[i]) {
                resultado.append(SIMBOLOS[i]);
                restante -= VALORES[i];
            }
        }

        return resultado.toString();
    }
}
