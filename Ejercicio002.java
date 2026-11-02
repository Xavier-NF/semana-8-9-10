import java.util.Scanner;

public class Ejercicio002 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número para la tabla: ");
            int num = scanner.nextInt();
            int sumaTotal = 0;

            for (int i = 1; i <= 15; i = i + 1) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
                sumaTotal = sumaTotal + resultado;
            }

            System.out.println("Suma total = " + sumaTotal);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio002