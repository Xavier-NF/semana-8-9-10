import java.util.Scanner;

public class Ejercicio006 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int edadMayor = -1;
            int edadMenor = 200;
            int mayoresEdad = 0;
            int menoresEdad = 0;

            for (int i = 1; i <= 15; i = i + 1) {
                System.out.print("Ingrese la edad de la persona " + i + ": ");
                int edad = scanner.nextInt();

                if (edad > edadMayor) {
                    edadMayor = edad;
                }
                if (edad < edadMenor) {
                    edadMenor = edad;
                }
                if (edad >= 18) {
                    mayoresEdad = mayoresEdad + 1;
                } else {
                    menoresEdad = menoresEdad + 1;
                }
            }

            System.out.println("Edad mayor: " + edadMayor);
            System.out.println("Edad menor: " + edadMenor);
            System.out.println("Mayores de edad: " + mayoresEdad);
            System.out.println("Menores de edad: " + menoresEdad);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio006