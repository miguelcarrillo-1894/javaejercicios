import java.util.Scanner;

public class Tienda {
    public void calcularCompra() {
        Scanner scanner = new Scanner(System.in);

        double precioA = 5.0;  
        double precioV = 20.0; 
        double precioE = 100.0; 

        System.out.print("Ingrese el tipo de producto (A = Alimentos, V = Vestimenta, E = Electronicos): ");
        char tipoProducto = scanner.next().charAt(0);

        if (!(tipoProducto == 'A' || tipoProducto == 'V' || tipoProducto == 'E' ||
              tipoProducto == 'a' || tipoProducto == 'v' || tipoProducto == 'e')) {
            System.out.println("Error: Tipo de producto invalido.");
            return;
        }

        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser un numero positivo.");
            return;
        }

        double precioBase = 0;
        double descuento = 0;

        if (tipoProducto == 'A' || tipoProducto == 'a') {
            precioBase = precioA;
            descuento = 0.10;
        } else if (tipoProducto == 'V' || tipoProducto == 'v') {
            precioBase = precioV;
            descuento = 0.05;
        } else if (tipoProducto == 'E' || tipoProducto == 'e') {
            precioBase = precioE;
            descuento = 0.00;
        }

        double costoSinDescuento = cantidad * precioBase;
        double montoDescuento = costoSinDescuento * descuento;
        double costoFinal = costoSinDescuento - montoDescuento;

        System.out.println("\n--- RESUMEN DE COMPRA ---");
        System.out.println("Producto: " + tipoProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioBase);
        System.out.println("Subtotal: $" + costoSinDescuento);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Costo total con descuento: $" + costoFinal);
    }
}