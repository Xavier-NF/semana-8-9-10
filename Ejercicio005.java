import java.util.Scanner;

public class Ejercicio005 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero positivo: ");
            int N = scanner.nextInt();
            long factorial = 1;

            for (int i = 1; i <= N; i = i + 1) {
                factorial = factorial * i;
            }

            System.out.println(N + "! = " + factorial);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio005