/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Arrays;


/**
 *
 * @author Alejo-pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Inicializacion de Variables
        int S = 5;
        int[] Input = {-6, -5, 0, 5, 6};

        //Llamado de la funcion
        try {
            int[] Output = FuncionCuadratica(Input, S);
            //Creamos un objeto Array para imprimir en una sola linea el Ouput
            Integer Array[] = new Integer[Output.length];
            for (int i = 0; i < Array.length; i++) {
                Array[i] = Output[i];
            }
            System.out.println(Arrays.asList(Array));
        } catch (Exception e) {
            System.out.println("Error");
        }

//Fin Codigo
    }

    public static int[] FuncionCuadratica(int[] lista, int S) {
        //Inicializacion de Variables

        int copy;
        double NumeroCuadrado;
        int ContadorLongitudArray = 0;

        double NumeroLista;
        String SS = String.valueOf(S) + String.valueOf(S);
        //Comprobar que la lista este ascedentemente ordenada
        try {
            if (lista.length == 0) {
                System.out.println("El array esta vacio Se da por terminado el programa , por favor ingresa datos al array");
            }
            for (int i = 0; i < lista.length - 1; i++) {
                if (lista[i] > lista[i + 1]) {

                    throw new Exception("El array recibido no esta ordenado ascedentemente por favor organizar");
                }

            }

            for (int i = 0; i < lista.length; i++) {
                NumeroLista = lista[i];
                NumeroCuadrado = Math.pow(NumeroLista, 2);
                //Si el numero es menor a SS lo elimina
                if (NumeroCuadrado < Integer.parseInt(SS)) {
                    ContadorLongitudArray++;
                }

            }

            //Inicializacion Array Output
            int[] NumerosCuadradosEnteros = new int[ContadorLongitudArray];
            //For para llenar numeros al cuadrado            
            for (int i = 0; i < lista.length; i++) {
                NumeroLista = lista[i];
                NumeroCuadrado = Math.pow(NumeroLista, 2);
                //Si el numero es menor a SS lo elimina
                if (NumeroCuadrado < Integer.parseInt(SS)) {
                    NumerosCuadradosEnteros[i] = (int) NumeroCuadrado;
                    ContadorLongitudArray++;
                }

            }
            //Contruir Array de salida Ordenado Ascendentemente
            for (int i = 0; i < NumerosCuadradosEnteros.length; i++) {
                //Clasico Metodo de la burbuja para ordenar
                for (int y = 0; y < NumerosCuadradosEnteros.length - 1; y++) {
                    if (NumerosCuadradosEnteros[y] > NumerosCuadradosEnteros[y + 1]) {
                        copy = NumerosCuadradosEnteros[y];
                        NumerosCuadradosEnteros[y] = NumerosCuadradosEnteros[y + 1];
                        NumerosCuadradosEnteros[y + 1] = copy;
                    }
                }

            }

            return NumerosCuadradosEnteros;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return null;

    }

}
    

