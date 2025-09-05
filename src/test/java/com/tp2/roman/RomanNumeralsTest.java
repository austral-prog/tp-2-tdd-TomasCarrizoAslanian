package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    private final RomanNumerals conversor = new RomanNumerals();

    @Test
    void convertir1_aI() {
        assertEquals("I", conversor.convertir(1));
    }

    @Test
    void convertir5_aV() {
        assertEquals("V", conversor.convertir(5));
    }

    @Test
    void convertir10_aX() {
        assertEquals("X", conversor.convertir(10));
    }

    @Test
    void convertir4_aIV() {
        assertEquals("IV", conversor.convertir(4));
    }

    @Test
    void convertir9_aIX() {
        assertEquals("IX", conversor.convertir(9));
    }

    @Test
    void convertir40_aXL() {
        assertEquals("XL", conversor.convertir(40));
    }

    @Test
    void convertir50_aL() {
        assertEquals("L", conversor.convertir(50));
    }

    @Test
    void convertir90_aXC() {
        assertEquals("XC", conversor.convertir(90));
    }

    @Test
    void convertir100_aC() {
        assertEquals("C", conversor.convertir(100));
    }

    @Test
    void convertir400_aCD() {
        assertEquals("CD", conversor.convertir(400));
    }

    @Test
    void convertir500_aD() {
        assertEquals("D", conversor.convertir(500));
    }

    @Test
    void convertir900_aCM() {
        assertEquals("CM", conversor.convertir(900));
    }

    @Test
    void convertir1000_aM() {
        assertEquals("M", conversor.convertir(1000));
    }

    @Test
    void convertir1994_aMCMXCIV() {
        assertEquals("MCMXCIV", conversor.convertir(1994));
    }

    @Test
    void convertir2023_aMMXXIII() {
        assertEquals("MMXXIII", conversor.convertir(2023));
    }
}
