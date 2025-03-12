import java.util.Scanner;

public class Factura {
    public void calcularFactura() {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        
        System.out.print("Ingrese el tipo de cliente (A, B, C, ): ");
        char tipoCliente = scanner.next().charAt(0);
        
        scanner.nextLine();
        
        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();
        
        System.out.print("Ingrese el precio unitario del producto: ");
        double precioUnitario = scanner.nextDouble();
        
        System.out.print("Es estudiante? (si/no): ");
        String esEstudiante = scanner.next();
        
        
        double subtotal = cantidad * precioUnitario;
        double impuesto = esEstudiante.equalsIgnoreCase("si") ? subtotal * 0.05 : subtotal * 0.13;
        double total = subtotal + impuesto;

       
        System.out.println("\n********* FACTURA *********");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("***************************");
    }
}