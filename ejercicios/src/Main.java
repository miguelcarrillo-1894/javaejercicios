import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n*** MENÚ DE EJERCICIOS ***");
            System.out.println("1. Simulación de Factura");
            System.out.println("2. Simulación de Ascensor");
            System.out.println("3. Ascensor con límite de peso");
            System.out.println("4. Sensor de Temperatura");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    Factura factura = new Factura();
                    factura.calcularFactura();
                    break;
                case 2:
                    Ascensor ascensor = new Ascensor();
                    ascensor.moverAscensor();
                    break;
                case 3:
                    AscensorConPeso ascensorPeso = new AscensorConPeso();
                    ascensorPeso.moverAscensor();
                    break;
                case 4:
                    SensorTemperatura sensor = new SensorTemperatura();
                    sensor.verificarTemperatura();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}