import java.util.Scanner;

class CajeroAutomatico {
    private double saldo;
    private Scanner scanner;

    public CajeroAutomatico() {
        this.saldo = 1000.0; 
        this.scanner = new Scanner(System.in); 
    }

    public void realizarRetiros() {
        int opcion;
        
        do {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Consultar saldo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a retirar: ");
                    double monto = scanner.nextDouble();
                    scanner.nextLine(); 

                    if (monto > saldo) {
                        System.out.println(" Error: Fondos insuficientes.");
                    } else if (monto <= 0) {
                        System.out.println(" Error: El monto debe ser mayor que 0.");
                    } else {
                        saldo -= monto;
                        System.out.println(" Retiro exitoso. Saldo restante: $" + saldo);
                    }
                    break;
                    
                case 2:
                    System.out.println(" Saldo actual: $" + saldo);
                    break;
                    
                case 0:
                    System.out.println(" Gracias por usar el cajero automatico.");
                    break;
                    
                default:
                    System.out.println("️ Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 0);
    }
}