import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número de 3 o mas cifras: ");
            int numero = scanner.nextInt();
            
            int cantidadDigitos = 0;
            int temp = numero;
            
            while (temp > 0) {
                temp /= 10;
                cantidadDigitos++;
            }
            
            System.out.println("Cantidad de dígitos: " + cantidadDigitos);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio06