
// ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.

import java.util.ArrayList;

import Entidades.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        
        //  Creamos una lista de tipo 'Libro'

            ArrayList<Libro> listaDeLibros = new ArrayList<>();

        //  Creamos varios objetos de tipo libro para luego almacenarlos en la lista

            Libro libro1 = new Libro("1984", "Pepe Grillo");
            Libro libro2 = new Libro("La mancha", "Andres Villa");
            Libro libro3 = new Libro("La Noche", "Maria Estela");

        //  Guardamos los libros en la lista

            listaDeLibros.add(libro1);
            listaDeLibros.add(libro2);
            listaDeLibros.add(libro3);

        //  Mostramos la Lista que se llama 'listaDeLibros' con un for each, que nos va a mostrar elemento por
        //  elemento.

            for (Libro libro : listaDeLibros) {
                
                System.out.println(libro.getNombre());

            }

    }

}
