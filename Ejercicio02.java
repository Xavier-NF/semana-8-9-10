import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            int i = 1;
            while (i <= 12) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }
        }
    } // Fin del método main
} // Fin de la clase Ejercicio02