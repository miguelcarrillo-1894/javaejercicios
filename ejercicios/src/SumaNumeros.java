import java.util.Scanner;

public class SumaNumeros {
    public void calcularSuma() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String respuesta;

        do {
            System.out.print("Ingrese un numero: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no valida. Ingrese un numero valido.");
                scanner.next(); 
            }
            int numero = scanner.nextInt();
            scanner.nextLine(); 
            suma += numero;

            System.out.print("Desea ingresar otro numero? (si/no): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("La suma total de los numeros ingresados es: " + suma);
    }
}
