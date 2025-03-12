import java.util.Scanner;

class CuentaRegresiva {
    public void iniciarCuentaRegresiva() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo para la cuenta regresiva: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Cuenta regresiva:");
            while (numero >= 0) {
                System.out.println(numero);
                numero--;
            }
            System.out.println("Tiempo cumplido.");
        } else {
            System.out.println("Error: Debe ingresar un numero entero positivo.");
        }
    }
}