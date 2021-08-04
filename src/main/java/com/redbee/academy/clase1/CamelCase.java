package com.redbee.academy.clase1;

public class CamelCase {


    /**
     * Generar un algoritmo que cuente la cantidad de palabras que hay en un texto teniendo en cuenta que está escrito
     * en notación camelCase.
     * <p>
     * Por ejemplo:
     * hoyVoyAlCine tiene 4 palabras:
     * - hoy
     * - Voy
     * - Al
     * - Cine
     *
     * @param texto
     * @return
     */
    public static Integer resolver(String texto) {
        //TODO: implementar

        Integer cantidadDePalabras=1;
        char[] palabras = texto.toCharArray();
        for(int i =0; i<texto.length();i++){
            if(((palabras[i] >= 65) && (palabras[i]<= 90)) || palabras[i] == 209){
                cantidadDePalabras++;
            }
        }
        return cantidadDePalabras;
    }
}
