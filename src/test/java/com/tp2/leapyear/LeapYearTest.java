package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void añoNoDivisiblePor4_noEsBisiesto() {
        assertFalse(LeapYear.esBisiesto(2001));
    }

    @Test
    void añoDivisiblePor4_esBisiesto() {
        assertTrue(LeapYear.esBisiesto(2004));
    }

    @Test
    void añoDivisiblePor100_noEsBisiesto() {
        assertFalse(LeapYear.esBisiesto(1900));
    }

    @Test
    void añoDivisiblePor400_esBisiesto() {
        assertTrue(LeapYear.esBisiesto(2000));
    }
}
