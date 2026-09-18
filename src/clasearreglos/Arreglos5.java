
package clasearreglos;

import java.util.Scanner;

/**
 *
 * @author Danny Nicolás Gutiérrez Mejía
 */
/*Hacer un programa que muestre un menú de este tipo:

"1.- Introducir nota"
"2.- Mostrar nota media"
"3.- Mostrar notas extremas"
"4.- Mostrar notas"
"0.- Salir"
De modo que si se opta por:
✤ la opción 1 pide por teclado una nueva nota, y se guarda en un array
✤ la opción 2 muestra la nota media de todas las introducidas hasta ese momento
✤ la opción 3 muestra la menor y la mayor de todas las notas introducidas hasta ese momento
✤ la opción 4 muestra todas las notas introducidas hasta ese momento
✤ la opción 0 acaba el programa
*/
public class Arreglos5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[100];
        int opcion;
        int contador = 0;
        double suma = 0;
        double media = 0;

        do {
            System.out.println("Ingrese 1 para introducir una nota");
            System.out.println("Ingrese 2 para mostrar la nota media");
            System.out.println("Ingrese 3 para mostrar notas extremas");
            System.out.println("Ingrese 4 para mostrar notas");
            System.out.println("Ingrese 0 para salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la nota del estudiante: ");
                    notas[contador] = sc.nextDouble();//Aca guardamos las notas en una variable tipo acumulativa
                    contador++;
                    break;
                case 2:
                    if (contador == 0) {/*Esto lo hacemos por si el usuario no ha ingresado ningun numero
                        el programa no vaya a dar error tratando de dividir por 0*/
                        System.out.println("No se han ingresado ninguna nota todavía para generar la media");
                    } else {//Importante poner este else para cerrar el if//
                    }
                    for (int i = 0; i < contador; i++) {/*Hacemos la suma nota por nota y usamos contador
                       para que lo haga hasta el maximo de notas digitadas*/
                        suma = suma + notas[i];
                    }
                    media = suma / contador;
                    System.out.println("La media de las notas es: " + media);
                    break;
                case 3:
                    if (contador == 0) {
                        System.out.println("No ha ingresado notas para comparar ");
                    } else {
                    }
                    double mayor = 0;
                    double menor = notas[0];//El menor debe iniciar siempre con la primer nota digitada.
                    for (int i = 0; i < contador; i++) {/*Usamos la variable contador y no notas.length
                        porque son la cantidad de notas que fueron digitadas hasta el momento*/
                        if (mayor < notas[i]) {
                            mayor = notas[i];
                        }
                        if (menor > notas[i]) {
                            menor = notas[i];/*Escribimos menor=notas en la posicion i para guardar el nuevo menor
                            recordar que siempre se lee de izquierda a derecha
                            o sea, la variable de la izquierda se guarda en la derehca
                             */
                        }
                    }
                    System.out.println("La nota mayor extrema es: " + mayor + " La nota menor extrema es: " + menor);
                    break;
                case 4:
                    if (contador == 0) {
                        System.out.println("No hay notas registradas para mostrar.");
                    } else {
                    }
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Las notas ingresedas hasta el momento son " + (i + 1) + ": " + notas[i]);
                    }

            }
        } while (opcion != 0);
    }
}
