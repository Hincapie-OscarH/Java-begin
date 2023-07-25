/*
18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
    obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio18;

;

public class Ejercicio18 {


    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        llenar(matriz);
        traspuesta(matriz);
    }
    
    public static void llenar(int matriz[][]){
        System.out.println("Matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void traspuesta(int matriz[][]){
        int[][] matrizT = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizT[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
