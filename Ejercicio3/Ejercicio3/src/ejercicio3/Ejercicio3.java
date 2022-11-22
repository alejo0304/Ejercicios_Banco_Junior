/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Alejo-pc
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array
        int[] Monedas={1, 5, 1, 1, 1, 10, 15, 20, 100};
        //Llamadod de funcion
        System.out.println(ValorMinimo(Monedas));

                
                
                
    }
  
    public static int ValorMinimo(int[] Array) {
        //Organizamos el Array con el fin de que no encuentre un numero mayor antes que uno menor
         Arrays.sort(Array);
         //Inicializamos aux en 1 para que sea el primer valor a sumar y comparar el cual comenzara la sucesion
        int aux =1;
        //Se dice que en una sucesion de fibonacci todo numero puede ser encotrado sumando cualquiera de los anteriores
        //Utilizamos esta logica para saber en que momento un numero del array rompe la sucesion de fibonacci condicionada que utilizamos, de esa manera ,unicamente nos enfocamos en encontrar el minimo numero que no se puede generar
        //Se dice que la sucesion condicionada rompe, cuando encuentra que "aux" es mayor o igual al siguiente numero del array
        //En donde "aux" es la suma de la sucesion fibonacci de los numeros INPUT del array
        //Es decir una vez esta suma es superada por el siguiente numero del array la sucesion se rompe
        //Tambien se puede entender median el triangulo de Pascal
        //Cuando encuentra que el siguiente numero del array es mayor que la suma total fibonacci de "aux", rompe, pues ya no encontrara un valor que sume para todo el rango desde la suma fibonacci "aux" hasta el nuevo numero del array por lo que el siguiente numero menor que no se encuentra para el cambio sera el siguiente numero de la sucesion aux
        for (int i=0; i< Array.length && Array[i]<=aux; i++){
            aux += Array[i];
        }
        
       
        return aux;
    }
}
