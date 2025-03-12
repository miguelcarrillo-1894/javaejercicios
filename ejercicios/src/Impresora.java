import java.util.Scanner;

class Impresora {
    private int papelDisponible;

    public Impresora() {
        this.papelDisponible = 50;
    }

    public void imprimirPaginas() {
        Scanner scanner = new Scanner(System.in);
        String continuar = "Si";

        while (papelDisponible > 0 && (continuar == "Si" || continuar == "SI" || continuar == "si")) {
            System.out.println("\nPapel disponible: " + papelDisponible);
            System.out.print("Ingrese la cantidad de paginas que desea imprimir: ");
            int paginas = scanner.nextInt();

            if (paginas > 0 && paginas <= papelDisponible) {
                papelDisponible -= paginas;
                System.out.println("Se han impreso " + paginas + " paginas. Papel restante: " + papelDisponible);
            } else {
                System.out.println("Error: No hay suficiente papel o cantidad no valida.");
            }

            if (papelDisponible > 0) {
                System.out.print("Desea imprimir mas paginas? (Si/No): ");
                continuar = scanner.next();
            } else {
                System.out.println("Se ha agotado el papel. No es posible imprimir mas paginas.");
                continuar = "No"; 
            }
        }
    }
}