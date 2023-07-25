/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio17;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio17 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Defina el tamaño del vector");
        int n1 = sc.nextInt();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int[] vector = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("Escriba el valor de la posición "+i);
            vector[i] = sc.nextInt();
        }
        
        String[] strArray = new String[vector.length];
        
        for (int i = 0; i < vector.length; i++) {
            strArray[i] = String.valueOf(vector[i]);
        }
 
        System.out.println(Arrays.toString(strArray));
        
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].length() == 1){
                c1++;
            }else if(strArray[i].length() == 2){
                c2++;
            }else if(strArray[i].length() == 3){
                c3++;
            }else if(strArray[i].length() == 4){
                c4++;
            }else {
                c5++;
            }
        }
        
        System.out.println("La cantidad de números de 1 cifra es: "+c1);
        System.out.println("La cantidad de números de 1 cifra es: "+c2);
        System.out.println("La cantidad de números de 1 cifra es: "+c3);
        System.out.println("La cantidad de números de 1 cifra es: "+c4);
        System.out.println("La cantidad de números de 1 cifra es: "+c5);
 
        
    }
    
}
