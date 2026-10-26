import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroSecreto = 50;
            int intentos = 0;
            
            while (true) {
                System.out.print("Ingrese un número: ");
                int intento = scanner.nextInt();
                intentos++;
                
                if (intento < numeroSecreto) {
                    System.out.println("El número es mayor");
                } else if (intento > numeroSecreto) {
                    System.out.println("El número es menor");
                } else {
                    System.out.println("¡Correcto!");
                    System.out.println("Intentos realizados: " + intentos);
                    break;
                }
            }
        }
    } // Fin del método main
} // Fin de la clase Ejercicio10