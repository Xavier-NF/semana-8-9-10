import java.util.Scanner;
 
public class Ejercicio0002 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            final String CLAVE_CORRECTA = "Java2026";
            String clave;
 
            do {
                System.out.print("Ingrese contraseña: ");
                clave = entrada.next();
 
                if (!clave.equals(CLAVE_CORRECTA)) {
                    System.out.println("Contraseña incorrecta");
                }
            } while (!clave.equals(CLAVE_CORRECTA));
 
            System.out.println("Acceso permitido");
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0002

