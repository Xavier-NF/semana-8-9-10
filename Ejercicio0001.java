import java.util.Scanner;
 
public class Ejercicio0001 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int suma = 0;
 
            do {
                System.out.print("Ingrese número: ");
                numero = entrada.nextInt();
 
                if (numero >= 0) {
                    suma += numero;
                }
            } while (numero >= 0);
 
            System.out.println("Suma total: " + suma);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio01SumaPositivos