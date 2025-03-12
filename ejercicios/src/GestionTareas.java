import java.util.Scanner;

public class GestionTareas {
    public void gestionarTareas() {
        Scanner scanner = new Scanner(System.in);
        String tareas = "";
        String tarea = "";

        System.out.println("=== Gestion de Tareas ===");

        do {
            System.out.print("Ingrese el nombre de la tarea (o 'salir' para finalizar): ");
            tarea = scanner.nextLine();

            if (!(tarea.length() == 5 && tarea.charAt(0) == 's' && tarea.charAt(1) == 'a' && tarea.charAt(2) == 'l' 
                && tarea.charAt(3) == 'i' && tarea.charAt(4) == 'r')) {
                
                System.out.print("Descripcion: ");
                String descripcion = scanner.nextLine();

                System.out.print("Fecha de vencimiento: ");
                String fecha = scanner.nextLine();

                tareas = tareas + "Tarea: " + tarea + "\nDescripcion: " + descripcion + "\nFecha: " + fecha + "\n\n";
            }
        } while (!(tarea.length() == 5 && tarea.charAt(0) == 's' && tarea.charAt(1) == 'a' && tarea.charAt(2) == 'l' 
                 && tarea.charAt(3) == 'i' && tarea.charAt(4) == 'r'));

        System.out.println("\n=== Lista de Tareas ===");
        if (tareas.length() == 0) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.println(tareas);
        }
    }
}
