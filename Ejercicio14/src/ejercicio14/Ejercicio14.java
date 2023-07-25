/*
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
 */
package ejercicio14;

import java.util.Scanner;
public class Ejercicio14 {

    static Scanner entrada = new Scanner(System.in);
    public static final String LIBRAS = "libras";
    public static final String DOLARES = "dolares";
    public static final String YENES = "yenes"; 
    
    public static void main(String[] args) {
        double euros = introducirEuros();
        String moneda = introducirMoneda();
        double cambio = cambiarMoneda(moneda, euros);
        imprimir(cambio, moneda);
    }
    
    public static double introducirEuros() {
        System.out.print("Introduce una cantidad de euros a convertir: ");
        double euros = entrada.nextDouble();
        entrada.nextLine();
        return euros;
    }
    
    public static String introducirMoneda() {
        String moneda;
        System.out.println("Introduce el tipo de moneda: ");
        System.out.println("1. Libras");
        System.out.println("2. Dólares");
        System.out.println("3. Yenes");
        moneda = entrada.nextLine();
        switch (moneda.toLowerCase()) {
            case LIBRAS:
            case DOLARES:
            case YENES:
                moneda = moneda.toLowerCase();
                break;
            default:
                moneda = null;
                System.out.println("Error, las opciones válidas son: " + LIBRAS + ", " + DOLARES + ", " + YENES);
        }
        if (moneda == null) {
            moneda = introducirMoneda();
        }
        System.out.println("La moneda introducida es: " + moneda);
        return moneda;
    }
    
    public static double cambiarMoneda(String moneda, double euros) {
        double cambio = 0.0;
        switch (moneda) {
            case LIBRAS:
                cambio = euros * 0.86;
                break;
            case DOLARES:
                cambio = euros * 1.28611;
                break;
            case YENES:
                cambio = euros * 129.852;
                break;
        }
        return cambio;
    }
    
    public static void imprimir(double cambio, String moneda) {
        System.out.println("El resultado de la conversión es " + String.format("%.2f", cambio)+" "+moneda);
    }
}
