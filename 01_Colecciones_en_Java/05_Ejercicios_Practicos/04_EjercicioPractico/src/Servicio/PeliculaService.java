package Servicio;

// Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
// tendremos una clase Pelicula con el título, director y duración de la película (en horas).
// Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
// que se pide a continuación:
// En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
// todos sus datos y guardándolos en el objeto Pelicula.
// Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
// crear otra Pelicula o no.
// Después de ese bucle realizaremos las siguientes acciones:
// • Mostrar en pantalla todas las películas.
// • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
// • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
// pantalla.
// • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
// pantalla.
// • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
// • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import Entidades.Pelicula;

public class PeliculaService {

    // Atributo

    private Scanner entrada = new Scanner(System.in);
    private ArrayList<Pelicula> listaPelis = new ArrayList<>();

    // Metodos personalizados

    public void crearPeliculas() {

        String op;

        do {

            Pelicula peli = new Pelicula();

            System.out.println("Ingresar 'titulo' de la pelicula");
            peli.setTitulo(entrada.nextLine());

            System.out.println("Ingresar 'director' de la pelicula");
            peli.setDirector(entrada.nextLine());

            System.out
                    .println("Ingresar 'duracion' de la pelicula (Ingrese la duracion en horas, por ejemplo: 1,5 hrs)");
            peli.setDuracion(entrada.nextDouble());

            entrada.nextLine(); // Limpiamos el buffer del enter

            listaPelis.add(peli);

            System.out.println("¿Desea agregar otra pelicula? S/N");
            op = entrada.nextLine();

            if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {

                do {

                    System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                    op = entrada.nextLine();

                } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

            }

        } while (!op.equalsIgnoreCase("N"));

    }

    public void mostrarTodasLasPeliculas() {

        System.out.println("Todas las peliculas son: ");

        for (Pelicula aux : listaPelis) {

            System.out.println(aux);

        }

    }

    public void mostrarLasPeliculasMayor1hrs() {

        System.out.println("Todas las peliculas mayores a 1 hrs son: ");

        for (Pelicula aux : listaPelis) {

            if (aux.getDuracion() > 1.0) {

                System.out.println(aux);

            }

        }

    }

    public void ordenarPorDuracionMenorAMayor() {

        System.out.println("----------------------------");
        System.out.println("Las peliculas ordenadas de menor a mayor (segun la duracion) son:");
        
        listaPelis.sort(compararDuracion);

        for (Pelicula aux : listaPelis) {
            
            System.out.println( aux );

        }

    }

    public void ordenarPorDuracionMayorAMenor() {

        System.out.println("----------------------------");
        System.out.println("Las peliculas ordenadas de mayor a menor (segun la duracion) son:");
        
        listaPelis.sort( compararDuracion );

        Collections.reverse( listaPelis );

        System.out.println("");

        for (Pelicula aux : listaPelis) {
            
            System.out.println( aux );

        }

    }

    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDuracion().compareTo( p2.getDuracion() );

        }

    };

    public void ordenarPorTitulo() {

        System.out.println("----------------------------");
        System.out.println("Las peliculas ordenadas (segun el titulo) son:");
        
        listaPelis.sort(compararTitulo);

        for (Pelicula aux : listaPelis) {
            
            System.out.println( aux );

        }

    }

    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getTitulo().compareTo( p2.getTitulo() );

        }

    };

    public void ordenarPorDirector() {

        System.out.println("----------------------------");
        System.out.println("Las peliculas ordenadas (segun el director) son:");
        
        listaPelis.sort(compararDirector);
        
        for (Pelicula aux : listaPelis) {
            
            System.out.println( aux );

        }

    }

    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDirector().compareTo( p2.getDirector() );

        }

    };

}
