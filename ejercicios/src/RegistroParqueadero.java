import java.util.Scanner;

public class RegistroParqueadero {
    public void registrarVehiculos() {
        Scanner scanner = new Scanner(System.in);
        String registro = ""; 

        System.out.print("Ingrese el numero de vehiculos a registrar: ");
        int cantidadVehiculos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehiculo " + i + ": ");
            String placa = scanner.nextLine();

           
            registro += "Vehiculo " + i + " - Placa: " + placa + "\n";
        }

        System.out.println("\nResumen de Vehiculos Registrados:");
        System.out.println(registro.isEmpty() ? "No hay vehiculos registrados." : registro);
    }
}