/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
   doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
   Math.sqrt().
 */
package ejercicio5;

import java.util.Scanner; 
public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un número enetero");
        int a = leer.nextInt();
        System.out.println("El doble del número es: "+a*2);
        System.out.println("El triple del número es: "+a*3);
        System.out.println("La raíz cuadrada del número es: "+Math.sqrt(a));
    }
    
}
