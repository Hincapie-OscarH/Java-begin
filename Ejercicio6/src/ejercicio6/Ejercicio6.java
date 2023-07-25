/*
6. Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio6;

import java.util.Scanner; 
public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un número enetero");
        int a = leer.nextInt();
        if (esPar(a)) {
            System.out.println("Sí es par");
        } else {
            System.out.println("No es par");
        }
    }
    
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
}
