import java.util.Scanner;
 
public class Ejercicio0004 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int cantidad = 0;
            int suma = 0;
            int nota;
            String continuar;
 
            do {
                // Ciclo interno: valida que la nota esté entre 0 y 20
                do {
                    System.out.print("Nota: ");
                    nota = entrada.nextInt();
 
                    if (nota < 0 || nota > 20) {
                        System.out.println("La nota debe estar entre 0 y 20.");
                    }
                } while (nota < 0 || nota > 20);
 
                suma += nota;
                cantidad++;
 
                System.out.print("¿Continuar? (S/N): ");
                continuar = entrada.next();
            } while (continuar.equalsIgnoreCase("S"));
 
            double promedio = (double) suma / cantidad;
 
            System.out.println();
            System.out.println("Cantidad de notas: " + cantidad);
            System.out.println("Suma total: " + suma);
            System.out.printf("Promedio: %.2f%n", promedio);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0004