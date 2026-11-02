import java.util.Scanner;

public class Ejercicio010 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int vExcelente = 0;
            int vBueno = 0;
            int vRegular = 0;
            int vMalo = 0;

            for (int i = 1; i <= 30; i = i + 1) {
                System.out.print("Estudiante " + i + " - Ingrese opción (1=Excelente, 2=Bueno, 3=Regular, 4=Malo): ");
                int opcion = scanner.nextInt();

                if (opcion == 1) {
                    vExcelente = vExcelente + 1;
                } else if (opcion == 2) {
                    vBueno = vBueno + 1;
                } else if (opcion == 3) {
                    vRegular = vRegular + 1;
                } else if (opcion == 4) {
                    vMalo = vMalo + 1;
                }
            }

            System.out.println("Excelente: " + vExcelente);
            System.out.println("Bueno: " + vBueno);
            System.out.println("Regular: " + vRegular);
            System.out.println("Malo: " + vMalo);

            // Determinando la opción más votada
            String masVotada = "Excelente";
            int maxVotos = vExcelente;

            if (vBueno > maxVotos) {
                maxVotos = vBueno;
                masVotada = "Bueno";
            }
            if (vRegular > maxVotos) {
                maxVotos = vRegular;
                masVotada = "Regular";
            }
            if (vMalo > maxVotos) {
                maxVotos = vMalo;
                masVotada = "Malo";
            }

            System.out.println("Opción más votada: " + masVotada);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio010