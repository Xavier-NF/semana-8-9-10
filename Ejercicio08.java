import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese cantidad de términos: ");
            int terminos = scanner.nextInt();
            
            int a = 0, b = 1;
            int i = 1;
            String secuencia = "";
            
            while (i <= terminos) {
                secuencia += a + " ";
                int siguiente = a + b;
                a = b;
                b = siguiente;
                i++;
            }
            
            System.out.println(secuencia.trim());
        }
    } // Fin del método main
} // Fin de la clase Ejercicio08