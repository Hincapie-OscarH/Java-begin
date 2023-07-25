/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
   Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejrcicio4;

import java.util.Scanner; 
public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una cantidad de grados centigrados");
        int c = leer.nextInt();
        double f = 32 + (9 * c / 5);
        System.out.println("La equivalencia en grados Fahrenheit es: "+f);
    }
    
}
