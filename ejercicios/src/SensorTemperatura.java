import java.util.Scanner;

public class SensorTemperatura {
    public void verificarTemperatura() {
        Scanner scanner = new Scanner(System.in);
        int tempMinima = 18;
        int tempMaxima = 25;

        
        System.out.print("Ingrese la temperatura actual en gradosC: ");
        double temperatura = scanner.nextDouble();

        
        if (temperatura >= tempMinima && temperatura <= tempMaxima) {
            System.out.println(" La temperatura es adecuada.");
        } else {
            System.out.println("️ Advertencia: La temperatura esta fuera del rango deseado.");
        }
    }
}