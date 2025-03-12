import java.util.Scanner;

public class Campeonato {
    public void clasificarEquipo() {
        Scanner scanner = new Scanner(System.in);

        int puntosEquipoA = 0, puntosEquipoB = 0, puntosEquipoC = 0;
        int equipo, resultado;

        System.out.println("Registro de Partidos - Campeonato");

        do {
            System.out.println("\n1. Equipo A");
            System.out.println("2. Equipo B");
            System.out.println("3. Equipo C");
            System.out.println("0. Salir");
            System.out.print("Seleccione el equipo que jugo: ");
            equipo = scanner.nextInt();

            if (equipo == 0) {
                break;
            } else if (equipo < 1 || equipo > 3) {
                System.out.println("Opcion no valida. Intente de nuevo.");
                continue;
            }

            System.out.print("Ingrese el resultado (1 = Ganado, 2 = Empatado, 3 = Perdido): ");
            resultado = scanner.nextInt();

            if (resultado < 1 || resultado > 3) {
                System.out.println("Resultado no valido. Intente de nuevo.");
                continue;
            }

            int puntos = 0;
            if (resultado == 1) {
                puntos = 3;
            } else if (resultado == 2) {
                puntos = 1;
            }

            if (equipo == 1) {
                puntosEquipoA += puntos;
            } else if (equipo == 2) {
                puntosEquipoB += puntos;
            } else {
                puntosEquipoC += puntos;
            }

            System.out.println("\nClasificacion Actual:");
            System.out.println("Equipo A: " + puntosEquipoA + " puntos");
            System.out.println("Equipo B: " + puntosEquipoB + " puntos");
            System.out.println("Equipo C: " + puntosEquipoC + " puntos");

        } while (equipo != 0);

        System.out.println("Fin del programa.");
    }
}