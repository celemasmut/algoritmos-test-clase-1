package com.redbee.academy.clase1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PotenciaTests {

    @Test
    @DisplayName("Test 2 elevado a la 2")
    void testPotencia() {
        Integer resultado = Potencia.resolver(2, 2);

        Assertions.assertEquals(4, resultado);
    }

    @Test
    @DisplayName("Test 2 elevado a la 3")
    void testPotencia2() {
        Integer resultado = Potencia.resolver(2, 3);

        Assertions.assertEquals(8, resultado);
    }

    @Test
    @DisplayName("Test 3 elevado a la 3")
    void testPotencia3() {
        Integer resultado = Potencia.resolver(3, 3);

        Assertions.assertEquals(27, resultado);
    }

    @Test
    @DisplayName("Test 4 elevado a la 2")
    void testPotencia4() {
        Integer resultado = Potencia.resolver(4, 2);

        Assertions.assertEquals(16, resultado);
    }

    @Test
    @DisplayName("Test 4 elevado a la 0")
    void testPotencia5() {
        Integer resultado = Potencia.resolver(4, 0);

        Assertions.assertEquals(1, resultado);
    }


    @Test
    @DisplayName("Test -4 elevado a la 2")
    void testPotencia6() {
        Integer resultado = Potencia.resolver(-4, 2);

        Assertions.assertEquals(16, resultado);
    }
}
