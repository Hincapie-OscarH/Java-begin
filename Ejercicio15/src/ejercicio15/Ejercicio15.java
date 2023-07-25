/*
 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente
 */
package ejercicio15;


public class Ejercicio15 {

    public static void main(String[] args) {
        rellenarv();
    }
    
    public static void rellenarv(){
        int [] n = new int[100];
        for (int i = 0; i < 100; i++) {
            n[i] = (i+1);
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.print(n[i]+" ");
        }
    }

    
}
