import java.util.Scanner;

public class AscensorConPeso {
    public void moverAscensor() {
        Scanner scanner = new Scanner(System.in);
        int pisoActual = 1; 
        int pisoMinimo = 1;
        int pisoMaximo = 10;
        double pesoMaximo = 200.0; 

        
        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = scanner.nextDouble();

       
        if (pesoUsuario > pesoMaximo) {
            System.out.println("Error: El ascensor esta sobrecargado. Peso maximo permitido: " + pesoMaximo + " kg.");
        } else {
            System.out.print("Ingrese el piso al que desea ir (1-10): ");
            int pisoDestino = scanner.nextInt();

            
            if (pisoDestino >= pisoMinimo && pisoDestino <= pisoMaximo) {
                System.out.println("Moviendo el ascensor del piso " + pisoActual + " al piso " + pisoDestino + "...");
                pisoActual = pisoDestino;
                System.out.println("El ascensor ha llegado al piso " + pisoActual);
            } else {
                System.out.println("Error: Piso no valido. Por favor, ingrese un numero entre " + pisoMinimo + " y " + pisoMaximo + ".");
            }
        }
    }
}