
package clasearreglos;

import java.util.Scanner;

/**
 *
 * @author Danny Nicolás Gutiérrez Mejía
 */
public class ClaseArreglos {
/*Escribe un programa que lea 5 números por teclado y que los almacene en un array. Rota los
elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la
2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente,
muestra el contenido del array.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerosTecladoArray[] = new int[5];
        for (int i = 0; i < numerosTecladoArray.length; i++) {
            System.out.println("Posicion: " + i + "=");
            numerosTecladoArray[i] = sc.nextInt();
        }
        //Estamos guardando el valor del arreglo en la posición 4 en una nueva variable
        int ultimo = numerosTecladoArray[4];
        //Estamos recorriendo el bucle de adelante hacia atras
        for (int k = 4; k > 0; k--) {
            numerosTecladoArray[k] = numerosTecladoArray[k - 1];//aqui lo que estamos haciendo es guardar el valor anterior en la nueva posición de k
        }
        numerosTecladoArray[0] = ultimo;/*necesario colocarlo afuera del ciclo for, porque si se coloca adentro
         el valor de la posición 0 se borra porque el ciclo va de mayor a menor*/
        for (int j = 0; j < numerosTecladoArray.length; j++) {
            System.out.println("Posicion del arreglo " + j + " es: " + numerosTecladoArray[j]);
        }
    }

}
