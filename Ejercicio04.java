import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double sumaNotas = 0;
            int i = 1;
            
            while (i <= 5) {
                System.out.print("Nota " + i + ": ");
                double nota = scanner.nextDouble();
                sumaNotas += nota;
                i++;
            }
            
            double promedio = sumaNotas / 5;
            System.out.println("Promedio: " + promedio);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio04