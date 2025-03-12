import java.util.Scanner;

public class RegistroVentas {
    public void registrarVentas() {
        Scanner scanner = new Scanner(System.in);
        String ventas = ""; 
        String producto;
        double precio, total = 0;
        boolean continuar = true;

        System.out.println("Registro de Ventas - Ingrese los productos vendidos:");

        while (continuar) {
            System.out.print("Ingrese el nombre del producto (o 'salir' para finalizar): ");
            producto = scanner.nextLine();

            if (producto.compareTo("salir") == 0) { 
                continuar = false;
            } else {
                System.out.print("Ingrese el precio del producto: ");
                precio = scanner.nextDouble();
                scanner.nextLine(); 

                ventas += "Producto: " + producto + " - Precio: $" + precio + "\n";
                total += precio;
            }
        }

        System.out.println("\nResumen de Ventas:");
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            System.out.println(ventas);
            System.out.println("Monto total de ventas: $" + total);
        }
    }
}