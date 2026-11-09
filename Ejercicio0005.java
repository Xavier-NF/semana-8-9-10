import java.util.Scanner;
 
public class Ejercicio0005 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double saldo = 5000;
            int opcion;
            double monto;
 
            do {
                System.out.println("===== CAJERO AUTOMÁTICO =====");
                System.out.println("1) Consultar saldo");
                System.out.println("2) Retirar dinero");
                System.out.println("3) Depositar dinero");
                System.out.println("4) Salir");
                System.out.print("Elija una opción: ");
                opcion = entrada.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.printf("Su saldo actual es: S/ %.2f%n", saldo);
                        break;
                    case 2:
                        System.out.print("Monto a retirar: S/ ");
                        monto = entrada.nextDouble();
                        if (monto <= 0) {
                            System.out.println("El monto debe ser mayor a 0.");
                        } else if (monto > saldo) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo -= monto;
                            System.out.printf("Retiro exitoso. Nuevo saldo: S/ %.2f%n", saldo);
                        }
                        break;
                    case 3:
                        System.out.print("Monto a depositar: S/ ");
                        monto = entrada.nextDouble();
                        if (monto <= 0) {
                            System.out.println("El monto debe ser mayor a 0.");
                        } else {
                            saldo += monto;
                            System.out.printf("Depósito exitoso. Nuevo saldo: S/ %.2f%n", saldo);
                        }
                        break;
                    case 4:
                        System.out.println("Gracias por usar el cajero. ¡Adiós!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                System.out.println();
            } while (opcion != 4);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0005