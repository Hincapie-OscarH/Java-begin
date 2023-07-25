/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:
    MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
    pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
    programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
    seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
    del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio11;

import java.util.Scanner;
public class Ejercicio11 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        char confirmacion;
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        do {
            System.out.println("\nMENU");
            System.out.println("1. Sumar"); 
            System.out.println("2. Restar"); 
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir"); 
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
        
            opcion = input.nextInt();
            
            switch (opcion) { 
                case 1: System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break; 
                case 2: System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;   
                case 3: System.out.println("El resultado de la multiplicaciónes: " + (num1 * num2)); 
                    break;    
                case 4: if (num2 == 0) { 
                    System.out.println("Error: No se puede dividir entre cero.");
                }else { 
                    System.out.println("El resultado de la división es: " + (num1 / num2));
                } 
                    break; 
                case 5:  System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = input.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);   
                }                    
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese una opción del 1 al 5.");
                    break; 
            } 
        } while (true);
    }
}
        