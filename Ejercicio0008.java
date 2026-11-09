import java.util.Scanner;
 
public class Ejercicio0008 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int opcion;
            double temperatura;
 
            do {
                System.out.println("===== CONVERSIÓN DE TEMPERATURAS =====");
                System.out.println("1) Celsius a Fahrenheit");
                System.out.println("2) Fahrenheit a Celsius");
                System.out.println("3) Salir");
                System.out.print("Elija una opción: ");
                opcion = entrada.nextInt();
 
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese grados Celsius: ");
                        temperatura = entrada.nextDouble();
                        System.out.printf("%.2f °C = %.2f °F%n",
                                temperatura, (temperatura * 9 / 5) + 32);
                    }
                    case 2 -> {
                        System.out.print("Ingrese grados Fahrenheit: ");
                        temperatura = entrada.nextDouble();
                        System.out.printf("%.2f °F = %.2f °C%n",
                                temperatura, (temperatura - 32) * 5 / 9);
                    }
                    case 3 -> System.out.println("Adiós!");
                    default -> System.out.println("Opción no válida.");
                }
                System.out.println();
            } while (opcion != 3);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0008