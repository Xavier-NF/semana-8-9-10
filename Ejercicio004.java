import java.util.Scanner;

public class Ejercicio004 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cantPares = 0;
            int cantImpares = 0;
            int sumaPares = 0;

            for (int i = 1; i <= 20; i = i + 1) {
                System.out.print("Ingrese el número " + i + ": ");
                int numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    cantPares = cantPares + 1;
                    sumaPares = sumaPares + numero;
                } else {
                    cantImpares = cantImpares + 1;
                }
            }

            System.out.println("Pares: " + cantPares);
            System.out.println("Impares: " + cantImpares);
            System.out.println("Suma de pares: " + sumaPares);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio004