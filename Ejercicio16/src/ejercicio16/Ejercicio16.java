/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 */
package ejercicio16;

import java.util.Scanner;
import java.util.Random;
public class Ejercicio16 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Defina el tamaño del vector");
        int n1 = sc.nextInt();
        int[] vector = new int[n1];
        llenaVector(vector);
        System.out.println("");
        buscar(vector);
    }
    
    public static int[] llenaVector(int[] vector){ 
	System.out.println("LLenando vector...");
	for(int i=0;i<vector.length;i++){
            vector[i] = new Random().nextInt(40);
            //vector[i] = sc.nextInt();
	}
	return vector;
    }
    
    public static void buscar(int[] vector){
        System.out.println("Digite el número a buscar");
        int n = sc.nextInt();
	for(int i=0;i<vector.length;i++){
            if ( n == vector[i]){
                System.out.println("Se encuentra en la posición "+i);
            }
        }  
    }

}