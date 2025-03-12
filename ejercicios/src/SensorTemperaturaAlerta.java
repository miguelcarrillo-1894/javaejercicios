import java.util.Scanner;

public class SensorTemperaturaAlerta {
    public void verificarTemperaturaConAlerta() {
        Scanner scanner = new Scanner(System.in);
        double umbralAlerta = 30.0; 

        
        System.out.print("Ingrese la temperatura actual en gradosC: ");
        double temperatura = scanner.nextDouble();

        
        if (temperatura > umbralAlerta) {
            System.out.println("️ ALERTA: La temperatura ha superado el umbral de " + umbralAlerta + "gradosC.");
        } else {
            System.out.println(" La temperatura es normal.");
        }
    }
}