import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese N: ");
            int N = scanner.nextInt();
            
            int contadorPares = 0;
            int i = 1;
            
            while (i <= N) {
                if (i % 2 == 0) {
                    contadorPares++;
                }
                i++;
            }
            
            System.out.println("Cantidad de pares: " + contadorPares);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio03