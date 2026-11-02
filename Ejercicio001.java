import java.util.Scanner;

public class Ejercicio001 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero positivo N: ");
            int N = scanner.nextInt();
            int suma = 0;

            for (int i = 1; i <= N; i = i + 1) {
                suma = suma + i;
            }

            System.out.println("La suma de los números es: " + suma);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio001