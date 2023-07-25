/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
   dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

import java.util.Scanner; 
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el 1er número");
        int a = leer.nextInt();
        System.out.println("Escriba el 2do número");
        int b = leer.nextInt();
        int c = a+b;
        System.out.println("La suma es: "+c);
        
    }
    
}
