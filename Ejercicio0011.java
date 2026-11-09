import java.util.Scanner;
 
public class Ejercicio0011 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int edad;
            int personas = 0;
            int suma = 0;
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int mayoresDeEdad = 0;
            String continuar;
 
            do {
                // Valida que la edad sea razonable
                do {
                    System.out.print("Ingrese la edad: ");
                    edad = entrada.nextInt();
 
                    if (edad < 0 || edad > 120) {
                        System.out.println("Edad no válida (0 a 120).");
                    }
                } while (edad < 0 || edad > 120);
 
                personas++;
                suma += edad;
 
                if (edad > mayor) {
                    mayor = edad;
                }
                if (edad < menor) {
                    menor = edad;
                }
                if (edad >= 18) {
                    mayoresDeEdad++;
                }
 
                System.out.print("¿Registrar otra persona? (S/N): ");
                continuar = entrada.next();
            } while (continuar.equalsIgnoreCase("S"));
 
            System.out.println();
            System.out.println("===== RESULTADOS DE LA ENCUESTA =====");
            System.out.println("Personas encuestadas: " + personas);
            System.out.printf("Promedio de edad: %.2f%n", (double) suma / personas);
            System.out.println("Edad mayor: " + mayor);
            System.out.println("Edad menor: " + menor);
            System.out.println("Mayores de edad (18 o más): " + mayoresDeEdad);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0011