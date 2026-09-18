
package clasearreglos;
import java.util.Scanner;
/**
 *
 * @author Danny
 */
/*Pedir 5 enteros por teclado (se supone que se introducen ordenados de forma creciente). Los números
los guardaremos en un array de tamaño 6. Imprimir el array. Pedir un nuevo número (que debe estar
entre los números antes introducidos) e insertarlo en el lugar adecuado para que el array continúe
ordenado. Imprimir el nuevo array resultante.
*/
public class Arreglos6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        System.out.println("Por favor, digite 5 números enteros en orden creciente:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();//Ciclo para pedir los números
        }
        System.out.print("Arreglo inicial: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.print("\nDigite un nuevo número para insertar: ");
        int numeroNuevo = sc.nextInt();
        int posicion = 0;
        while (posicion < 5 && numeroNuevo > numeros[posicion]) {//para ubicar el nuevo número en la posición correcta
            posicion++;
        }
        for (int i = 4; i >= posicion; i--) {//Hace espacio para el número nuevo
            numeros[i + 1] = numeros[i];
        }
        numeros[posicion] = numeroNuevo;
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
