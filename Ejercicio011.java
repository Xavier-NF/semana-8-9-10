import java.util.Scanner;

public class Ejercicio011 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double planillaTotal = 0;
            double sueldoMayor = -1;
            double sueldoMenor = 999999.0;
            int contadorAltos = 0;

            for (int i = 1; i <= 25; i = i + 1) {
                System.out.print("Ingrese el sueldo del trabajador " + i + ": ");
                double sueldo = scanner.nextDouble();

                planillaTotal = planillaTotal + sueldo;

                if (sueldo > sueldoMayor) {
                    sueldoMayor = sueldo;
                }
                if (sueldo < sueldoMenor) {
                    sueldoMenor = sueldo;
                }
                if (sueldo > 2500) {
                    contadorAltos = contadorAltos + 1;
                }
            }

            double promedio = planillaTotal / 25;

            System.out.println("Planilla total: S/ " + planillaTotal);
            System.out.println("Promedio: S/ " + promedio);
            System.out.println("Mayor sueldo: S/ " + sueldoMayor);
            System.out.println("Menor sueldo: S/ " + sueldoMenor);
            System.out.println("Trabajadores con sueldo > S/2500: " + contadorAltos);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio011