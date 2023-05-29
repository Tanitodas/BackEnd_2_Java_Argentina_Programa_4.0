package Entidades;

//  Eres el responsable de una tienda de libros y necesitas gestionar el inventario de tu tienda. 
//  Debes desarrollar un programa en Java que te permita realizar las siguientes operaciones:
//  A.  Crear una clase 'Libro' con los siguientes atributos: 
//
//      _ titulo (String) 
//      _ autor (String)
//      _ precio (double).
//
//  B.  Implementar la clase 'InventarioLibreria' que contenga las siguientes funcionalidades:
//
//      _ Un ArrayList para almacenar los libros en el inventario.
//      _ Un HashSet para almacenar los autores únicos de los libros en el inventario.
//      _ Un TreeMap para almacenar los libros ordenados por título.
//      _ Un método 'agregarLibro' que reciba como parámetros el título, autor y precio de un libro 
//        y lo agregue al inventario.
//      _ Un método 'obtenerAutoresUnicos' que retorne el conjunto de autores únicos presentes en el inventario.
//      _ Un método 'obtenerLibrosOrdenadosPorTitulo' que retorne una lista de libros ordenados alfabéticamente
//        por título.
//      _ Un método 'calcularPrecioPromedio' que calcule y retorne el precio promedio de todos los libros en
//        el inventario.
//      _ Un método 'imprimirInventario' que imprima por pantalla todos los libros en el inventario, mostrando
//        título, autor y precio.
//
// C.   En el método principal (main), crea una instancia de 'InventarioLibreria' y realiza las siguientes operaciones:
//      
//      _ Agrega al menos 5 libros al inventario utilizando el método agregarLibro.
//      _ Muestra por pantalla los autores únicos presentes en el inventario utilizando el método obtenerAutoresUnicos.
//      _ Muestra por pantalla los libros ordenados por título utilizando el método obtenerLibrosOrdenadosPorTitulo.
//      _ Muestra por pantalla el precio promedio de los libros en el inventario utilizando el método
//        calcularPrecioPromedio.
//      _ Utiliza el método imprimirInventario para mostrar todos los libros en el inventario.

public class Libro {
    
    // ATRIBUTOS

        private String titulo;
        private String autor;
        private double precio;

    //  CONSTRUCCTORES

        public Libro() {
        }

        public Libro(String titulo, String autor ,double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.precio = precio;
        }

    // GETTERS y SETTERS
        
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

    //  METODO toString

        @Override
        public String toString() {
            return "[titulo = " + titulo + ", autor = " + autor + ", precio = " + precio + "]";
        }
        
}
