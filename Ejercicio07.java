import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 1;
            int mayor = 0;
            int menor = 0;
            
            System.out.println("Ingrese 10 números:");
            while (i <= 10) {
                System.out.print("Número " + i + ": ");
                int num = scanner.nextInt();
                
                if (i == 1) {
                    mayor = num;
                    menor = num;
                } else {
                    if (num > mayor) {
                        mayor = num;
                    }
                    if (num < menor) {
                        menor = num;
                    }
                }
                i++;
            }
            
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio07