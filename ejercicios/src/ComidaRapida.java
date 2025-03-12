import java.util.Scanner;

public class ComidaRapida {
    public void realizarPedido() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int opcion;

        do {
            System.out.println("\n*** MENU DE COMIDAS RAPIDAS ***");
            System.out.println("1. Hamburguesa - $5.00");
            System.out.println("2. Pizza - $8.00");
            System.out.println("3. Hot Dog - $4.00");
            System.out.println("4. Papas Fritas - $3.00");
            System.out.println("5. Refresco - $2.00");
            System.out.println("0. Finalizar pedido");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    total += 5.00;
                    System.out.println("Hamburguesa agregada al pedido.");
                    break;
                case 2:
                    total += 8.00;
                    System.out.println("Pizza agregada al pedido.");
                    break;
                case 3:
                    total += 4.00;
                    System.out.println("Hot Dog agregado al pedido.");
                    break;
                case 4:
                    total += 3.00;
                    System.out.println("Papas Fritas agregadas al pedido.");
                    break;
                case 5:
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

        System.out.println("\nTotal a pagar: $" + total);
        System.out.println("Gracias por su compra!");
    }
}