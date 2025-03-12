import java.util.Scanner;

class JuegoAdivinanza {
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1; 
        int intento;

        System.out.println("Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un numero entre 1 y 100.");

        do {
            System.out.print("Ingrese su suposicion: ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("El numero es menor. Intenta de nuevo.");
            } else if (intento < numeroSecreto) {
                System.out.println("El numero es mayor. Intenta de nuevo.");
            } else {
                System.out.println("Felicidades! Has adivinado el numero.");
            }
        } while (intento != numeroSecreto);
    }
}