import java.util.Scanner;
 
public class Ejercicio0006 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese números (0 para terminar):");
 
            int numero;
            int pares = 0;
            int impares = 0;
 
            do {
                System.out.print("Número: ");
                numero = entrada.nextInt();
 
                if (numero != 0) {
                    if (numero % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                }
            } while (numero != 0);
 
            System.out.println("Pares: " + pares);
            System.out.println("Impares: " + impares);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0006