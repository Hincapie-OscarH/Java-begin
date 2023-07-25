/*
19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
    una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
    de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio19;

import java.util.Scanner;
public class Ejercicio19 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        llenar(matriz);
        traspuesta(matriz);
    }
    
    public static void llenar(int matriz[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
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
    
    public static void traspuesta(int matriz[][]){
        int[][] matrizT = new int[3][3];
        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizT[i][j]+" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -matrizT[i][j]){
                    a++;
                }
            }
        }
        
        if(a == 9){
            System.out.println("La matriz es anti simétrica");
        }else {
            System.out.println("La matriz no es anti simétrica");
        }
        
    }
    
}
