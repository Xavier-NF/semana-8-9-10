import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese N: ");
            int N = scanner.nextInt();
            
            int suma = 0;
            int i = 1;
            
            while (i <= N) {
                suma += i;
                i++;
            }
            
            System.out.println("Resultado: " + suma);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio1