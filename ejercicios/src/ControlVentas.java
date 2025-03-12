import java.util.Scanner;

public class ControlVentas {
    public void registrarVentas() {
        Scanner scanner = new Scanner(System.in);
        String productosVendidos = "";
        double totalVentas = 0;
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no valida. Ingrese un precio valido.");
                scanner.next(); 
            }
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad vendida: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no valida. Ingrese una cantidad valida.");
                scanner.next(); 
            }
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            double subtotal = precio * cantidad;
            totalVentas += subtotal;
            productosVendidos += producto + " - Cantidad: " + cantidad + " - Total: $" + subtotal + "\n";

            System.out.print("Desea registrar otra venta? (si/no): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("\n*** Resumen de Ventas ***");
        System.out.println(productosVendidos);
        System.out.println("Total de ventas: $" + totalVentas);
    }
}
