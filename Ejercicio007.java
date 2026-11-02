import java.util.Scanner;

public class Ejercicio007 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número N: ");
            int N = scanner.nextInt();
            int suma = 0;

            for (int i = 1; i <= N; i = i + 1) {
                System.out.print(i);
                suma = suma + i;
            }
            System.out.println(); // Salto de línea

            System.out.println("Cantidad: " + N);
            System.out.println("Suma: " + suma);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio007