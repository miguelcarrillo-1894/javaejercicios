import java.util.Scanner;

public class AscensorInteligente {
    public void moverAscensorSiTemperaturaAdecuada() {
        Scanner scanner = new Scanner(System.in);
        int pisoActual = 1; 
        int pisoMinimo = 1;
        int pisoMaximo = 10;
        int tempMinima = 18;
        int tempMaxima = 25;

        
        System.out.print("Ingrese la temperatura actual en gradosC: ");
        double temperatura = scanner.nextDouble();

        
        if (temperatura < tempMinima || temperatura > tempMaxima) {
            System.out.println(" Advertencia: La temperatura esta fuera del rango permitido (" + tempMinima + "gradosC - " + tempMaxima + "gradosC).");
            System.out.println(" El ascensor no se movera por razones de seguridad.");
        } else {
           
            System.out.print("Ingrese el piso al que desea ir (1-10): ");
            int pisoDestino = scanner.nextInt();

            
            if (pisoDestino >= pisoMinimo && pisoDestino <= pisoMaximo) {
                System.out.println(" Temperatura adecuada. Moviendo el ascensor del piso " + pisoActual + " al piso " + pisoDestino + "...");
                pisoActual = pisoDestino;
                System.out.println("El ascensor ha llegado al piso " + pisoActual);
            } else {
                System.out.println("Error: Piso no valido. Por favor, ingrese un numero entre " + pisoMinimo + " y " + pisoMaximo + ".");
            }
        }
    }
}
