/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejo-pc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Inicializacion de variables/Objetos
        System.out.println("Hola! , Este Programa Eliminara todo numero '5' encontrado y ordenara en orden contrario al INPUT ingresado \n");
        Scanner sc = new Scanner(System.in);
        String CantidadNumerosLista;
        int S = 5;
        String NumeroString;

        while (true == true) {
            System.out.println("Por favor Ingresa la cantidad de numeros a ingresar en la lista: \n");
            CantidadNumerosLista = sc.next();
            if (validarNumero(CantidadNumerosLista) == false) {
                System.out.println("Por favor Ingresa un Numero Entero Valido , Sin Letras o formato punto decimal\n");
            }
            if (validarNumero(CantidadNumerosLista) == true) {
                break;
            }
        }

        //Creamos Lista max en base al numero ingresado por el usuario
        List<String> listaInput = new ArrayList<>(Integer.parseInt(CantidadNumerosLista));
        List<String> listaOutput = new ArrayList<>(Integer.parseInt(CantidadNumerosLista));
        //For para ingresar la cantidad de numeros 
        for (int i = 0, n = 1; i < Integer.parseInt(CantidadNumerosLista); i++, n++) {
            try {
                System.out.println("Por favor Ingresa El numero (" + n + ") de tu lista\n");
                NumeroString = sc.next();
                //Valida si es numero     
                if (validarNumero(NumeroString) == false || Integer.parseInt(NumeroString) >= 100) {
                    throw new NumberFormatException();
                }
                //Ingresa Numero a la lista
                Integer.parseInt(NumeroString);
                listaInput.add(NumeroString);

            } catch (NumberFormatException nfe) {
                //Reinicio de Variables For
                i--;
                n--;
                System.out.println("Por favor Ingresa un Numero Entero Valido que sea Menor a 100\n");

            }

        }
        //Separamos los numeros y si encuentra el numero de la variable 'S' lo elimina
        char[] nums;
        int CantidadDeDigitos;
        boolean IngresoDato;
        for (int i = 0; i < Integer.parseInt(CantidadNumerosLista); i++) {
            IngresoDato = false;
            //Valida si contiene el valor de Y si es asi lo separa y elimina
            for (int y = S; y < 10; y++) {
                if (listaInput.get(i).contains(String.valueOf(y))) {
                    nums = listaInput.get(i).toCharArray();
                    for (char c : nums) {
                        if (Character.getNumericValue(c) >= S) {
                        } else {
                            listaOutput.add(String.valueOf(c));
                        }
                    }
                    IngresoDato = true;
                    break;
                }
            }
            //Si no ha ingresado el dato lo inserta
            if (IngresoDato == false) {
                listaOutput.add(listaInput.get(i));
            }
        }
        //Invierte la lista Muestra la Lista
        for (int i = 0, j = listaOutput.size() - 1; i < j; i++) {
            listaOutput.add(i, listaOutput.remove(j));
        }
        System.out.println("Output -> " + listaOutput.toString());
        //Fin del Codigo
    }

    public static boolean validarNumero(String a) {
        boolean Valida_Numero = a.matches("[+-]?\\d*(\\.\\d+)?");
        return Valida_Numero;
    }

}
