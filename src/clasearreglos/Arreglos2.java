
package clasearreglos;

import java.util.Scanner;

/**
 *
 * @author Danny Nicolás Gutiérrez Mejía
 */
/*Escribir un programa que sea capaz de calcular la letra de un NIF a partir del número del DNI. El
programa debe pedir al usuario el DNI de 8 dígitos y posteriormente calculará la letra del NIF (se
pueden añadir métodos para aislar las tareas, si se conoce el trabajo con métodos). Al finalizar el
programa se debe presentar el NIF completo con el formato: ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F.*/
public class Arreglos2 {
    public static void main(String[] args) {
        int dni= numeroDNI();//Le estamos entregando a la nueva variable el metodo de abajo
         String nifCompleto = NIF(dni);/*// 'NIF()' es la función que calcula todo.
         Le pasamos 'dni' entre paréntesis porque la función exige ese dato para poder trabajar.*/
         System.out.println("El nif suyo es: "+nifCompleto);
        
    }
    /*Pedimos el numero DNI en un metodo fuera de la main para trabajar con la variable
    cuando sea que la necesitemos*/
    public static int numeroDNI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de DNI de 8 digitos");
        int numeroDNI= sc.nextInt();
        return numeroDNI;
    }
    public static String NIF(int numeroDNI){// ponemos el int numero DNI entre parentesis para poderlo usar
        String NIF = "";//creamos la variable NIF sin llenarla aún
        int posicion = numeroDNI % 23;/*Hacemos la operación para hallar el residuo y lo guardamos en una variable para 
        despues poder usarla*/
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J",
            "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        NIF=numeroDNI+"-"+letras[posicion];//Al usar "" convertimos todas las variables a string//
        return NIF;
    }
}



