package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private final StringCalculator calculadora = new StringCalculator();

    @Test
    void cadenaVacia_devuelveCero() {
        assertEquals(0, calculadora.sumar(""));
    }
    @Test
    void unSoloNumero_devuelveEseNumero() {
        assertEquals(5, calculadora.sumar("5"));
        assertEquals(42, calculadora.sumar("42"));
    }
    @Test
    void dosNumerosSeparadosPorComa_devuelveSuma() {
        assertEquals(3, calculadora.sumar("1,2"));
    }
    @Test
    void multiplesNumeros_devuelveSuma() {
        assertEquals(6, calculadora.sumar("1,2,3"));
        assertEquals(10, calculadora.sumar("1,2,3,4"));
    }
    @Test
    void numerosNegativos_lanzanExcepcion() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.sumar("1,-2,3")
        );
        assertTrue(ex.getMessage().contains("-2"));
    }


}