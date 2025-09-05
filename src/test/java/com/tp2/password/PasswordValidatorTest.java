package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private final PasswordValidator validador = new PasswordValidator();

    @Test
    void contraseñaCorta_esInvalida() {
        assertFalse(validador.esValida("Ab1!a"));
        assertFalse(validador.esValida("Abcdef1"));
    }
    @Test
    void contraseñaConOchoCaracteres_puedeSerValidaSiCumpleTodo() {
        assertTrue(validador.esValida("Abcde1!f")); // 8 y cumple todo
    }
    @Test
    void contraseñaSinMayuscula_esInvalida() {
        assertFalse(validador.esValida("abcdefg1!"));
    }
    @Test
    void contraseñaSinMinuscula_esInvalida() {
        assertFalse(validador.esValida("ABCDEFG1!"));
    }
    @Test
    void contraseñaSinNumero_esInvalida() {
        assertFalse(validador.esValida("Abcdefgh!"));
    }
    @Test
    void contraseñaSinCaracterEspecial_esInvalida() {
        assertFalse(validador.esValida("Abcdefg1"));
    }
    @Test
    void contraseñaCumpleTodosLosRequisitos_esValida() {
        assertTrue(validador.esValida("Abcdefg1!"));
        assertTrue(validador.esValida("Str0ng_Passw0rd!"));
    }
}
