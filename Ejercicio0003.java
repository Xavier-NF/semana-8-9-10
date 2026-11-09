import java.util.Scanner;
 
public class Ejercicio0003 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Número: ");
            int numero = entrada.nextInt();
 
            int i = 1;
            do {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            } while (i <= 12);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0003