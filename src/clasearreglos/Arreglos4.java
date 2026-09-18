
package clasearreglos;

import java.util.Scanner;

/**
 *
 * @author Danny
 */
/*4.a.13.Escribir un programa en el que se pidan al usuario por teclado los valores de dos arrays de números
enteros llamados arr1 y arr2, y luego se construya un nuevo array resultado de “concatenar” los arrays
arr1 y arr2, es decir, poner los elementos de arr2 a continuación de los de arr1. Finalmente, se escriban
en pantalla todos los elementos del nuevo array.
*/
public class Arreglos4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Arreglo 1: ");
        int tamañoArreglo1 = sc.nextInt();
        int arreglo1[] = new int[tamañoArreglo1];
        System.out.println("Ingrese el tamaño del Arreglo 2: ");
        int tamañoArreglo2 = sc.nextInt();
        int arreglo2[] = new int[tamañoArreglo2];
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Agregue un numero entero");
            arreglo1[i] = sc.nextInt();
        }
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("Agregue un numero entero");
            arreglo2[i] = sc.nextInt();
        }
        int arreglo3[] = new int[arreglo1.length + arreglo2.length];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i]=arreglo1[i];//Estamos guardando dentro del arreglo 3 los espacios del arreglo 1
        }
        for (int i=0;i<arreglo2.length;i++){
            arreglo3[arreglo1.length+i]=arreglo2[i];
            
        }
        for (int i=0;i<arreglo3.length;i++)
        System.out.println("Su nuevo arreglo es: "+arreglo3[i]);
    }


       
        
    
}
