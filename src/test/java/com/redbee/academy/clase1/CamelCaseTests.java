package com.redbee.academy.clase1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CamelCaseTests {

    @Test
    @DisplayName("Test contar palabras del texto hoyVoyAlCine")
    void testContarPalabras() {
        Integer resultado = CamelCase.resolver("hoyVoyAlCine");

        Assertions.assertEquals(4, resultado);
    }

    @Test
    @DisplayName("Test contar palabras del texto anitaLavaLaTina")
    void testContarPalabras2() {
        Integer resultado = CamelCase.resolver("anitaLavaLaTina");

        Assertions.assertEquals(4, resultado);
    }

    @Test
    @DisplayName("Test contar palabras del texto elBarEsImanOZonaMiserable")
    void testContarPalabras3() {
        Integer resultado = CamelCase.resolver("elBarEsImanOZonaMiserable");

        Assertions.assertEquals(7, resultado);
    }
    @Test
    @DisplayName("Test contar palabras del texto elÑandu")
    void testContarPalabras4() {
        Integer resultado = CamelCase.resolver("elÑandu");

        Assertions.assertEquals(2, resultado);
    }
}
