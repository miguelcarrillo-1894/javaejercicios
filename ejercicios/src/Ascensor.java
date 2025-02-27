import java.util.Scanner;

public class Ascensor {
    public void moverAscensor() {
        Scanner scanner = new Scanner(System.in);
        int pisoActual = 1; // Suponemos que el ascensor empieza en el piso 1
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        // Pedir el piso al usuario
        System.out.print("Ingrese el piso al que desea ir (1-10): ");
        int pisoDestino = scanner.nextInt();

        // Verificar si es un piso válido
        if (pisoDestino >= pisoMinimo && pisoDestino <= pisoMaximo) {
            System.out.println("Moviendo el ascensor del piso " + pisoActual + " al piso " + pisoDestino + "...");
            pisoActual = pisoDestino;
            System.out.println("El ascensor ha llegado al piso " + pisoActual);
        } else {
            System.out.println("Error: Piso no válido. Por favor, ingrese un número entre " + pisoMinimo + " y " + pisoMaximo + ".");
        }
    }
}