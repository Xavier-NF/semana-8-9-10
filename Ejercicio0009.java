import java.util.Scanner;
 
public class Ejercicio0009 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            final int NUMERO_SECRETO = 25;
            int intento;
            int intentos = 0;
 
            do {
                System.out.print("Adivine el número: ");
                intento = entrada.nextInt();
                intentos++;
 
                if (intento > NUMERO_SECRETO) {
                    System.out.println("Muy alto");
                } else if (intento < NUMERO_SECRETO) {
                    System.out.println("Muy bajo");
                }
            } while (intento != NUMERO_SECRETO);
 
            System.out.println("¡Correcto!");
            System.out.println("Intentos realizados: " + intentos);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0009