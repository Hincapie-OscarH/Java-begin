/*
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9.
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        llenar(matriz);
        magica(matriz);
    }
    
    public static void llenar(int matriz[][]){
        int a = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Escriba el valor de la posición "+(a));
                matriz[i][j] = sc.nextInt();
                a++;
            }
        }
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void magica(int matriz[][]){
        int fila = 0;
        int columna = 0;
        int c1 = 0;
        int c2 = 0;
        int [] vector1 = new int [3];
        int [] vector2 = new int [3];
        int condicionFila = 0;
        int condicionColum = 0;
        int sumFila = 0;
        int sumFilaX = 0;
        int sumColumna = 0;
        int sumColumnaX = 0;
        int suma = 0;
        int suma1 = 0;
        int condicionDiagonal = 0;
        int comparacion = 0;
        int comparacion1 = 0;
        int comparacion2 = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumFila = matriz[fila][j];
			sumFilaX = matriz[fila][j] + sumFilaX;
            }
            vector1[i] = sumFilaX;
            sumFila = 0;
            sumFilaX = 0;
            fila++;
        }
        System.out.println("");
        
        //  Suma de filas en pantalla
	for (int i = 0; i < 3; i++) {
            System.out.println("Sumatoria fila "+(c1+1)+": "+vector1[i]);
            c1 = c1++;
        }
        
        System.out.println("");
        
        //  suma de las Columnas
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumColumna = matriz[i][columna];
                sumColumnaX = matriz[i][columna] + sumColumnaX;
            }
            vector2[j] = sumColumnaX;
            sumColumna = 0;
            sumColumnaX = 0;
            columna++;
        }
        
        //  suma de las columnas es pantalla
        for (int i = 0; i < 3; i++) {
            System.out.println("Sumatoria columna "+(c2+1)+": "+vector2[i]);
            c2++;
        }
        
        //  sumatoria diagonal principal    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){
                    suma = matriz[i][j] + suma;
                }
            }
            suma1 = matriz[i][3-i-1] + suma1;
        }
        System.out.println("");
        System.out.println("La suma de la diagonal principal es: "+suma);
        System.out.println("La suma de la diagonal secundaria es: "+suma1);

	//  igualdad sumatoria filas
        for (int i = 0; i < 3; i++) {
            comparacion = vector1[i];
            for (int j = 0; j < 3; j++) {
                comparacion1 = vector2[j];
            }
            if(comparacion != comparacion1){
                condicionFila = 0;
            }else{
                condicionFila = 1;
            }
        }
        //  igualdad sumatoria columnas
        for (int i = 0; i < 3; i++) {
            comparacion2 = vector2[i];
            for (int j = 0; j < 3; j++) {
                comparacion1 = vector2[j];
            }
            if(comparacion != comparacion1){
                condicionColum = 0;
            }else{
                condicionColum = 1;
            }
        }
        
        //  igualdad Diagonales
        if(suma != suma1){
            condicionDiagonal = 0;
        }else{
            condicionDiagonal = 1;
        }
        System.out.println("");
        //  Respuesta en pantalla
        if(condicionFila == 1 && condicionColum == 1 && condicionDiagonal == 1) {
            System.out.println("La Matriz es mágica.");
        }else{
            System.out.println("La matriz no es mágica.");
        } 

    }
    
}
