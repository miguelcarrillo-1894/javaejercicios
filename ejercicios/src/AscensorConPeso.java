import java.util.Scanner;

public class AscensorConPeso {
    public void moverAscensor() {
        Scanner scanner = new Scanner(System.in);
        int pisoActual = 1; // El ascensor comienza en el piso 1
        int pisoMinimo = 1;
        int pisoMaximo = 10;
        double pesoMaximo = 200.0; // Límite de peso en kg

        // Pedir datos al usuario
        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = scanner.nextDouble();

        // Verificar si el peso está permitido
        if (pesoUsuario > pesoMaximo) {
            System.out.println("Error: El ascensor está sobrecargado. Peso máximo permitido: " + pesoMaximo + " kg.");
        } else {
            System.out.print("Ingrese el piso al que desea ir (1-10): ");
            int pisoDestino = scanner.nextInt();

            // Verificar si el piso es válido
            if (pisoDestino >= pisoMinimo && pisoDestino <= pisoMaximo) {
                System.out.println("Moviendo el ascensor del piso " + pisoActual + " al piso " + pisoDestino + "...");
                pisoActual = pisoDestino;
                System.out.println("El ascensor ha llegado al piso " + pisoActual);
            } else {
                System.out.println("Error: Piso no válido. Por favor, ingrese un número entre " + pisoMinimo + " y " + pisoMaximo + ".");
            }
        }
    }
}