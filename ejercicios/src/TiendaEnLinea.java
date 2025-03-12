import java.util.Scanner;

class TiendaEnLinea {
    public void realizarCompra() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String respuesta = "Si";

        while (respuesta == "Si" || respuesta == "SI" || respuesta == "si") {
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad que desea comprar: ");
            int cantidad = scanner.nextInt();

            if (precio < 0 || cantidad <= 0) {
                System.out.println("Error: El precio y la cantidad deben ser valores positivos.");
            } else {
                double subtotal = precio * cantidad;
                total += subtotal;
                System.out.println("Subtotal actual: $" + total);
            }

            System.out.print("Desea agregar otro producto? (Si/No): ");
            respuesta = scanner.next();
        }

        System.out.println("Compra finalizada. Total a pagar: $" + total);
    }
}