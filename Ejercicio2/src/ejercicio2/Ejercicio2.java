/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
   pantalla.
 */
package ejercicio2;

import java.util.Scanner; 
public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el nombre");
        String a = leer.nextLine();
        System.out.println("El nombre  es: "+a);
        
    }
    
}
