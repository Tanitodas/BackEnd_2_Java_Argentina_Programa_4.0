package Entidades;

// ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.

//  Vamos a crear una clase 'Libro' con atributo de 'nombre' y 'autor' para luego crear
//  una coleccion de objetos de esta clase.
public class Libro {
    
    // ATRIBUTOS

        private String nombre;
        private String autor;

    //  CONSTRUCCTORES

        public Libro() {
        }

        public Libro(String nombre, String autor) {
            this.nombre = nombre;
            this.autor = autor;
        }

    // GETTERS y SETTERS
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

    //  METODO toString

        @Override
        public String toString() {
            return "Libro [nombre = " + nombre + " , autor = " + autor + "]";
        }
        
}
