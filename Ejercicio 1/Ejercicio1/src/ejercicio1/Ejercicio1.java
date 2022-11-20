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
        int CantidadNumeros = 0;
        int S = 5;
        String Numero;
        System.out.println("Por favor Ingresa la cantidad de numeros a ingresar en la lista: \n");
        CantidadNumeros = sc.nextInt();
        //Creamos Lista max en base al numero ingresado por el usuario
        List<String> lista = new ArrayList<>(CantidadNumeros);
        //For para ingresar la cantidad de numeros 
        for (int i = 0, n = 1; i < CantidadNumeros; i++, n++) {

            try {
                System.out.println("Por favor Ingresa El numero (" + n + ") de tu lista\n");
                Numero = sc.next();
                //Valida si es numero 
                boolean Valida_Numero = Numero.matches("[+-]?\\d*(\\.\\d+)?");
                if (Valida_Numero == false || Integer.parseInt(Numero) >= 100) {
                    throw new NumberFormatException();
                }
                //Ingresa Numero a la lista
                Integer.parseInt(Numero);
                lista.add(Numero);

            } catch (NumberFormatException nfe) {
                //Reinicio de Variables For
                i--;
                n--;
                System.out.println("Por favor Ingresa un Numero Entero Valido y que sea Menor a 100\n");

            }

        }
        //Separamos los numeros y si encuentra el numero de la variable 'S' lo elimina
        char[] nums = null;
        for (int i = 0; i < CantidadNumeros; i++) {
            nums = lista.get(i).toCharArray();
            for (char c : nums) {
                System.out.print(c + "asdasdasd \n");
            }
        }
        //Reordena la Lista para ser mostrada
        
        
    }

}

