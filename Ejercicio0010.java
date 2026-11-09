import java.util.Scanner;
 
public class Ejercicio0010 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String nombre;
            double precio;
            int cantidad;
            String continuar;
 
            double montoTotal = 0;
            int totalProductos = 0;   // unidades vendidas
            int registros = 0;        // productos registrados
 
            do {
                System.out.print("Nombre del producto: ");
                nombre = entrada.nextLine();
 
                System.out.print("Precio: S/ ");
                precio = entrada.nextDouble();
 
                System.out.print("Cantidad: ");
                cantidad = entrada.nextInt();
                entrada.nextLine(); // limpia el salto de línea pendiente
 
                montoTotal += precio * cantidad;
                totalProductos += cantidad;
                registros++;
 
                System.out.printf("Venta registrada: %s -> S/ %.2f%n", nombre, precio * cantidad);
                System.out.print("¿Registrar otro producto? (S/N): ");
                continuar = entrada.nextLine();
                System.out.println();
            } while (continuar.equalsIgnoreCase("S"));
 
            System.out.println("===== RESUMEN DE VENTAS =====");
            System.out.printf("Monto total vendido: S/ %.2f%n", montoTotal);
            System.out.println("Cantidad total de productos vendidos: " + totalProductos);
            System.out.printf("Promedio de venta por producto: S/ %.2f%n", montoTotal / registros);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio0010