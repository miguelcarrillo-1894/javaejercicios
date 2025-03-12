import java.util.Scanner;

public class PromedioExamenes {
    public void calcularPromedio() {
        Scanner scanner = new Scanner(System.in);
        int cantidadNotas;
        double sumaNotas = 0, nota;

        System.out.print("Ingrese la cantidad de notas: ");
        cantidadNotas = scanner.nextInt();

        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = scanner.nextDouble();
            sumaNotas += nota;
        }

        double promedio = sumaNotas / cantidadNotas;
        System.out.println("Su promedio es: " + promedio);
        if (promedio >= 6) {
            System.out.println(" Aprobado!");
        } else {
            System.out.println(" Reprobado. Necesita mejorar.");
        }
    }
}