/*
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el
    límite inicial.
 */
package ejercicio10;

import java.util.Scanner;
public class Ejercicio10 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el límite positivo: "); 
        int limite = sc.nextInt();
        
        int suma = 0;
        int numero;  
        int contador = 0;
        
        while (suma <= limite) {
            contador++; 
            System.out.print("Introduce el número " + contador + ": ");  
            numero = sc.nextInt();
            suma += numero;  
        }
        
        System.out.println("La suma de los números introducidos superó ellímite inicial de " + limite); 
        System.out.println("La suma total es " + suma);
    }
    
}
