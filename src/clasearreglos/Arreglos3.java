
package clasearreglos;

import java.util.Scanner;

/**
 *
 * @author Danny Nicolás Gutiérrez Mejía
 */
/*Pedir por teclado las notas de 8 estudiantes y guardarlas en un array de notas. Las notas serán números
decimales. Tras leer las notas en un bucle inicial, procesar en otro bucle la información y mostrar por
pantalla:
1. la nota más alta
2. la nota más baja
3. la nota media de todas las notas
4. el número de aprobados
5. el número de suspensos*/
public class Arreglos3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notasEstudiantes[] = new double[8];
        for (int i = 0; i < notasEstudiantes.length; i++) {
            System.out.println("Ingrese notas del estudiante: ");
            notasEstudiantes[i] = sc.nextDouble();
        }
        for (int k = 0; k < notasEstudiantes.length; k++) {
            System.out.println("Notas[" + k + "]=" + notasEstudiantes[k]);
        }
        double notaMasAlta = notasEstudiantes[0];
        double notaMasBaja = notasEstudiantes[0];
        double suma=0;
        double media=0;
        int aprobados=0;
        int suspendidos=0;
        for (int i = 0; i < notasEstudiantes.length; i++) {
            if (notasEstudiantes[i] < notaMasBaja) {
               notaMasBaja=notasEstudiantes[i];//Aqui actualizamos la nota para que no se quede siempre en la primera
            }
            if(notasEstudiantes[i]>notaMasAlta){
                notaMasAlta=notasEstudiantes[i];
                
            }
            if (notasEstudiantes[i]>5){
                aprobados=aprobados+1;
            }
            else if (notasEstudiantes[i]<=5){
                suspendidos=suspendidos+1;
            }
            suma=suma+notasEstudiantes[i];
            media=suma/notasEstudiantes.length;
        }
        System.out.println("La nota mas baja es: " + notaMasBaja);
        System.out.println("La nota mas alta es: "+ notaMasAlta);
        System.out.println("La media de todas las notas fue: "+media);
        System.out.println("El numero de estudiantes que aprobó fue: "+aprobados);
        System.out.println("El numero de estudiantes que desaprobó fue: "+suspendidos);
    }

}
