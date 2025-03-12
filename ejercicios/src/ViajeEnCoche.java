import java.util.Scanner;

class ViajeEnCoche {
    public void calcularTiempoDeViaje() {
        Scanner scanner = new Scanner(System.in);
        String continuar = "Si";

        while (continuar == "Si" || continuar == "SI" || continuar == "si") {
            System.out.print("\nIngrese la distancia total del viaje en kilometros: ");
            double distancia = scanner.nextDouble();

            System.out.print("Ingrese la velocidad promedio del coche en km/h: ");
            double velocidad = scanner.nextDouble();

            if (distancia <= 0 || velocidad <= 0) {
                System.out.println("Error: La distancia y la velocidad deben ser valores positivos.");
            } else {
                double tiempo = distancia / velocidad;
                double tiempoRedondeado = Math.round(tiempo * 100) / 100.0;
                System.out.println("El tiempo estimado de viaje es: " + tiempoRedondeado + " horas.");
            }

            System.out.print("Desea calcular otro viaje? (Si/No): ");
            continuar = scanner.next();
        }
    }
}