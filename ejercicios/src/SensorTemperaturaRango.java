import java.util.Scanner;

public class SensorTemperaturaRango {
    public void verificarTemperatura() {
        Scanner scanner = new Scanner(System.in);
        int temperatura = 0;

        System.out.print("Ingrese la temperatura actual (gradosC): ");
        temperatura = scanner.nextInt();

        while (temperatura < 18 || temperatura > 25) {
            System.out.println(" Alerta: Temperatura fuera del rango aceptable (18gradosC - 25gradosC). Intente nuevamente.");
            System.out.print("Ingrese la temperatura actual (gradosC): ");
            temperatura = scanner.nextInt();
        }

        System.out.println(" Temperatura dentro del rango aceptable.");
    }
}