import java.util.Scanner;

public class Ejercicio003 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double sumaNotas = 0;
            double notaMayor = -1;
            double notaMenor = 999;

            for (int i = 1; i <= 10; i = i + 1) {
                System.out.print("Ingrese la nota del estudiante " + i + ": ");
                double nota = scanner.nextDouble();

                sumaNotas = sumaNotas + nota;

                if (nota > notaMayor) {
                    notaMayor = nota;
                }
                if (nota < notaMenor) {
                    notaMenor = nota;
                }
            }

            double promedio = sumaNotas / 10;
            System.out.println("Promedio: " + promedio);
            System.out.println("Mayor nota: " + notaMayor);
            System.out.println("Menor nota: " + notaMenor);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio003