/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
   en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
   Java.
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner; 
public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String a = leer.nextLine();
        System.out.println("La frase en mayúsculas es: "+a.toUpperCase(Locale.ITALY));
        System.out.println("La frase en minúsculas es: "+a.toLowerCase());
                ;
    }
    
}
