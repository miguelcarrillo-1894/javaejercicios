import java.util.Scanner;

public class SensorTemperatura {
    public void verificarTemperatura() {
        Scanner scanner = new Scanner(System.in);
        int tempMinima = 18;
        int tempMaxima = 25;

        // Pedir la temperatura al usuario
        System.out.print("Ingrese la temperatura actual en °C: ");
        double temperatura = scanner.nextDouble();

        // Verificar si la temperatura está en el rango adecuado
        if (temperatura >= tempMinima && temperatura <= tempMaxima) {
            System.out.println(" La temperatura es adecuada.");
        } else {
            System.out.println("️ Advertencia: La temperatura está fuera del rango deseado.");
        }
    }
}