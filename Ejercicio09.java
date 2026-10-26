import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 1000;
            
            while (saldo > 0) {
                System.out.println("Saldo actual: S/" + saldo);
                System.out.print("Retiro (ingrese 0 para salir): ");
                double retiro = scanner.nextDouble();
                
                if (retiro == 0) {
                    break;
                }
                
                if (retiro > saldo) {
                    System.out.println("Error: El retiro es mayor al saldo.");
                } else {
                    saldo -= retiro;
                    System.out.println("Saldo restante: S/" + saldo + "\n");
                }
            }
        }
        System.out.println("Operación finalizada.");
    } // Fin del método main
} // Fin de la clase Ejercicio09