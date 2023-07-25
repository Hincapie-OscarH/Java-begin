/*
21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
    que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
    menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
    columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
    Ejemplo:
    Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
    4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package ejercicio21;


public class Ejercicio21 {


    public static void main(String[] args) {
        int[][] m1 = {{1,26,36,47,5,6,72,81,95,10},
                          {11,12,13,21,41,22,67,20,10,61},
                          {56,78,87,90,9,90,17,12,87,67},
                          {41,87,24,56,97,74,87,42,64,35},
                          {32,76,79,1,36,5,67,96,12,11},
                          {99,13,54,88,89,90,75,12,41,76},
                          {67,78,87,45,14,22,26,42,56,78},
                          {98,45,34,23,32,56,74,16,19,18},
                          {24,67,97,46,87,13,67,89,93,24},
                          {21,68,78,98,90,67,12,41,65,12}};
        int[][] m2 = {{36,5,67},{89,90,75},{14,22,26}};
        int filaInicio = -1;
        int columnaInicio = -1;
        imprimirm1(m1);
        System.out.println("");
        imprimirm2(m2);
        System.out.println("");
        encontrar(m1,m2,filaInicio,columnaInicio);
    }
    
    public static void imprimirm1(int matriz1[][]){
        System.out.println("Matriz 1");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4s",matriz1[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void imprimirm2(int matriz2[][]){
        System.out.println("Matriz 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4s",matriz2[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void encontrar(int matriz1[][], int matriz2[][], int filaInicio, int columnaInicio){
        boolean encontrado = false;
        for (int i = 0; i <= matriz1.length - matriz2.length; ++i) {
            for (int j = 0; j <= matriz1[0].length - matriz2[0].length; ++j) {
                if (matriz1[i][j] == matriz2[0][0] && mIguales(matriz1, matriz2, i, j)) {
                    encontrado = true;
                    filaInicio = i;
                    columnaInicio = j;
                    break;
                }
            }

            if (encontrado) {
                break;
            }
        }

        if (encontrado) {
            System.out.println("La submatriz P se encuentra en la matriz M.");
            System.out.println("Fila de inicio: " + filaInicio);
            System.out.println("Columna de inicio: " + columnaInicio);
        } else {
            System.out.println("La submatriz P no se encuentra en la matriz M.");
        }
    }
    
    public static boolean mIguales(int[][] m, int[][] mb, int filaInicio, int columnaInicio) {
        for (int i = 0; i < mb.length; ++i) {
            for (int j = 0; j < mb[0].length; ++j) {
                if (m[filaInicio + i][columnaInicio + j] != mb[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
