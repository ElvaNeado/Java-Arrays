
package clasearreglos;

import java.util.Scanner;

/**
 *
 * @author Danny Nicolás Gutiérrez Mejía
 */
/*4.c.14.Realizar un programa que lea por teclado un array de 10 elementos numéricos enteros y una posición
(entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
*/
public class Arreglos7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaramos el arreglo de tamaño 10
        int[] numeros = new int[10];
        System.out.println("Por favor, digite 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        // 2. Pedir la posición que se desea eliminar
        System.out.print("Digite la posición (entre 0 y 9) del elemento a eliminar: ");
        int posicion = sc.nextInt();

        // Validamos que la posición exista en el arreglo
        if (posicion >= 0 && posicion < 10) {

            // 3. Desplazar los elementos hacia la izquierda para "tapar" el hueco.
            // Empezamos exactamente en la posición que queremos eliminar,
            // y traemos el número de la siguiente casilla (i + 1) hacia atrás (i).
            // El ciclo llega hasta el 8 (i < 9) para evitar un error al intentar leer la posición 10.
            for (int i = posicion; i < 9; i++) {
                numeros[i] = numeros[i + 1];
            }

            // (Opcional) El último número queda duplicado tras el desplazamiento, 
            // así que por limpieza lo volvemos 0, aunque no es estrictamente necesario.
            numeros[9] = 0;

            // 4. Imprimir el arreglo resultante. 
            // Imprimimos solo 9 elementos porque lógicamente eliminamos uno.
            System.out.print("\nArreglo resultante sin huecos: ");
            for (int i = 0; i < 9; i++) {
                System.out.print(numeros[i] + " ");
            }
        } else {
            System.out.println("Error: La posición ingresada no es válida.");
        }

    }
}

