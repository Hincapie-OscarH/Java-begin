/*
9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
   es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
   que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
   investigar la función Substring y equals() de Java.
 */
package ejercicio9;

import java.util.Scanner;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra:");
        String palabra = sc.nextLine();
        
        if (palabra.charAt(0) == 'A' || palabra.charAt(0) == 'a') {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        sc.close();
    }
    
}
