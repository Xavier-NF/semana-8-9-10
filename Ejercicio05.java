import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            long factorial = 1;
            int i = 1;
            
            while (i <= numero) {
                factorial *= i;
                i++;
            }
            
            System.out.println("Factorial = " + factorial);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio05