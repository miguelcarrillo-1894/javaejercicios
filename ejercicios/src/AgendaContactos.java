import java.util.Scanner;

public class AgendaContactos {
    public void registrarContactos() {
        Scanner scanner = new Scanner(System.in);
        String contactos = "";
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el numero de telefono: ");
            String telefono = scanner.nextLine();

            contactos += nombre + " - " + telefono + "\n";

            System.out.print("Desea agregar otro contacto? (si/no): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("\nLista de Contactos:");
        System.out.println(contactos.isEmpty() ? "No se registro ningun contacto." : contactos);
    }
}