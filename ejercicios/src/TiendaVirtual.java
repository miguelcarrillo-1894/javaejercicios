import java.util.Scanner;

public class TiendaVirtual {
    public void realizarCompra() {
        Scanner scanner = new Scanner(System.in);
        String productos = ""; 
        double total = 0; 
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            total += precio;
            productos += producto + " - $" + precio + "\n";

            System.out.print("Desea agregar otro producto? (si/no): ");
            respuesta = scanner.nextLine();

        } while (respuesta.length() == 2 && respuesta.charAt(0) == 's' && respuesta.charAt(1) == 'i');

        System.out.println("\nResumen de la Compra:");
        if (productos.length() == 0) {
            System.out.println("No compro nada.");
        } else {
            System.out.println(productos);
            System.out.println("Total a pagar: $" + total);
        }
    }
}