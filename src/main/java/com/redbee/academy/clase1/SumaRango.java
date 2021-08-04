package com.redbee.academy.clase1;

public class SumaRango {

    /**
     * Generar un algoritmo que sume todos los valores en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolver(Integer num1, Integer num2) {
        // TODO: implementar
        Integer resutado = 0;
        if(num1 < num2) {
            for (int i = 0; i <= num2; i++) {
                resutado += num1 + i;
            }
        }else{
            resutado=0;
        }
        return resutado;
    }

    /**
     * Generar un algoritmo que sume todos los valores enteros PARES que se encuentren en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolverPares(Integer num1, Integer num2) {
        // TODO: implementar
        Integer pares=0;
        if(num1 < num2){
            for(int i = num1 ; i <= num2 ; i++){
                if(esPar(i)){
                    pares+=i;
                }
            }
        }else{
            pares=0;
        }
        return pares;
    }
    private static boolean esPar(Integer num){
        return (num % 2 == 0)?true:false;
    }

    /**
     * Generar un algoritmo que sume todos los valores enteros IMPARES que se encuentren en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolverImpares(Integer num1, Integer num2) {
        // TODO: implementar
        Integer impares=0;
        if(num1 < num2){
            for(int i = num1 ; i <= num2 ; i++){
                if(!esPar(i)){
                    impares+=i;
                }
            }
        }else{
            impares=0;
        }
        return impares;

    }
}
