import java.util.Scanner;

public class Cine {
    public void recomendarPelicula() {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        
        if (edad <= 0) {
            System.out.println(" Error: La edad debe ser un numero positivo.");
            return;
        }

        
        String categoria;
        String peliculas;

        if (edad < 7) {
            categoria = "Peliculas animadas y educativas";
            peliculas = "Ejemplos: Toy Story, Buscando a Nemo, Coco.";
        } else if (edad <= 17) {
            categoria = "Peliculas familiares, animaciones y aventuras";
            peliculas = "Ejemplos: Harry Potter, Jumanji, Los Increibles.";
        } else if (edad <= 30) {
            categoria = "Accion, drama, comedia y ciencia ficcion";
            peliculas = "Ejemplos: Inception, John Wick, Avengers, El Lobo de Wall Street.";
        } else {
            categoria = "Peliculas clasicas y dramas";
            peliculas = "Ejemplos: El Padrino, Casablanca, Forrest Gump.";
        }

        
        System.out.println("\n--- RECOMENDACION DE CINE ---");
        System.out.println("Categoria de peliculas recomendadas: " + categoria);
        System.out.println(peliculas);
    }
}
