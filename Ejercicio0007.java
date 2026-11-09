import java.util.Scanner;
 
public class Ejercicio0007 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Base: ");
            long base = entrada.nextLong();
 
            int exponente;
            // Valida que el exponente sea positivo
            do {
                System.out.print("Exponente: ");
                exponente = entrada.nextInt();
 
                if (exponente <= 0) {
                    System.out.println("El exponente debe ser positivo.");
                }
            } while (exponente <= 0);
 
            long resultado = 1;
            int contador = 0;
            do {
                resultado *= base;
                contador++;
            } while (contador < exponente);
 
            System.out.println("Resultado: " + resultado);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0007