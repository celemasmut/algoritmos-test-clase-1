package com.redbee.academy.clase1;

public class Potencia {

    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        // TODO: implementar

        Integer resultado = 1;

        int cont=0;
        while (cont < potencia){
            resultado = resultado *base;
            cont++;

        }

        return resultado;
    }
}
