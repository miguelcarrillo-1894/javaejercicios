import java.util.Scanner;

public class Biblioteca {
    public void registrarLibros() {
        Scanner scanner = new Scanner(System.in);
        String listaLibros = "";
        String continuar;

        do {
            System.out.print("Ingrese el titulo del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese el numero de paginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine(); 

            listaLibros += "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas + "\n";

            System.out.print("Desea registrar otro libro? (si/no): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nLista de libros registrados:");
        System.out.println(listaLibros);
    }
}
