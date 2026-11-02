import java.util.Scanner;

public class Ejercicio008 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double ventaTotal = 0;
            double mayorVenta = -1;
            int diaMayorVenta = 0;

            for (int i = 1; i <= 7; i = i + 1) {
                System.out.print("Ingrese la venta del Día " + i + ": ");
                double venta = scanner.nextDouble();

                ventaTotal = ventaTotal + venta;

                if (venta > mayorVenta) {
                    mayorVenta = venta;
                    diaMayorVenta = i;
                }
            }

            double promedio = ventaTotal / 7;
            System.out.println("Venta total: S/ " + ventaTotal);
            System.out.println("Promedio: S/ " + String.format("%.2f", promedio));
            System.out.println("Mayor venta: Día " + diaMayorVenta);
        }
    } // Fin del método main
} // Fin de la clase Ejercicio008