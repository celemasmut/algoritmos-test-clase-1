package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        // TODO: implementa

        return (num1*num2)/mcd(num1,num2);
    }

    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        // TODO: implementar
        int maximo = Math.max(num1, num2);
        int minimo = Math.min(num1, num2);

        int resultado = 0;
        do {
            resultado = minimo;
            minimo = maximo % minimo;
            maximo = resultado;

        } while (minimo != 0);

        return resultado;
    }
}
