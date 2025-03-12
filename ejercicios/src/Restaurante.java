import java.util.Scanner;

public class Restaurante {
    public void calcularCuenta() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int opcion;
        
        do {
            System.out.println("\n--- MENU DEL RESTAURANTE ---");
            System.out.println("1. Pastas  - $5.00");
            System.out.println("2. Picada - $8.00");
            System.out.println("3. Ensalada Cesar - $4.50");
            System.out.println("4. Refresco - $2.00");
            System.out.println("0. Terminar pedido");
            System.out.print("Seleccione un producto: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    total += 5.00;
                    System.out.println("Pastas agregadas al pedido.");
                    break;
                case 2:
                    total += 8.00;
                    System.out.println("Picada agregada al pedido.");
                    break;
                case 3:
                    total += 4.50;
                    System.out.println("Ensalada Cesar agregada al pedido.");
                    break;
                case 4:
                    total += 2.00;
                    System.out.println("Refresco agregado al pedido.");
                    break;
                case 0:
                    System.out.println("Finalizando pedido...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 0); 

        System.out.println("\nMetodos de pago:");
        System.out.println("1. Efectivo (10% de descuento)");
        System.out.println("2. Tarjeta de credito (5% de descuento)");
        System.out.println("3. Cheque (sin descuento)");
        System.out.print("Seleccione su metodo de pago: ");
        int pago = scanner.nextInt();
        
        if (pago == 1) {
            total *= 0.90; 
        } else if (pago == 2) {
            total *= 0.95; 
        }

        System.out.println("\nTotal a pagar: $" + total);
        System.out.println("Gracias por su compra!");
    }
}