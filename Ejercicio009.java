import java.util.Scanner;

public class Ejercicio009 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número N: ");
            int N = scanner.nextInt();

            for (int i = 1; i <= N; i = i + 1) {
                for (int j = 1; j <= i; j = j + 1) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    } // Fin del método main
} // Fin de la clase Ejercicio009