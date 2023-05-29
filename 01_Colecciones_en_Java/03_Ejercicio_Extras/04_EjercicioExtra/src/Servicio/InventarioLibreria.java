package Servicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import Entidades.Libro;

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

public class InventarioLibreria {
    
    //  ATRIBUTOS

        private Scanner entrada = new Scanner(System.in);
        private ArrayList<Libro> inventarioLibros = new ArrayList<>();
        private HashSet<String> autoresUnicos = new HashSet<>();
        private TreeSet<String> librosOrdenados = new TreeSet<>();

    //  MÉTODOS PERSONALIZADOS

        public void añadimosLibrosAlInventario() {
            
            String op;
        
            do {
        
                Libro libro = new Libro();
                        
                System.out.println("Ingrese el TITULO del libro");
                libro.setTitulo( entrada.nextLine() );
                        
                System.out.println("Ingrese el AUTOR del libro");
                libro.setAutor( entrada.nextLine() );

                System.out.println("Ingrese el PRECIO del libro");
                libro.setPrecio( entrada.nextDouble() );
        
                // Añadimos al ArrayList el libro creado.
                inventarioLibros.add( libro );
        
                System.out.println("¿Desea agregar otro LIBRO al inventario? S/N");
                op = entrada.nextLine();
                    
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {
        
                    do {
                            
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();
        
                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));
        
                }
                    
            } while ( op.equalsIgnoreCase("S") ); 

        }

        public void obtenerAutoresUnicos( ) {
            
            for ( Libro aux : inventarioLibros ) {
                
                autoresUnicos.add( aux.getAutor() );

            }

            System.out.println(" ====== LISTA DE AUTORES ====== ");

            for (String aux2 : autoresUnicos) {
                
                System.out.println( aux2.toString() );

            }

            System.out.println("====================");

        }

        public void obtenerLibrosOrdenadosXTitulo( ) {
            
            for ( Libro aux : inventarioLibros ) {
                
                librosOrdenados.add( aux.getTitulo() );

            }

            System.out.println(" ====== LISTA DE LIBROS ordenados X titulo ====== ");

            for (String aux2 : librosOrdenados ) {
                
                System.out.println( aux2.toString() );

            }

            System.out.println("====================");

        }

        public void calcularPrecioPromedio() {
            
            double sumaDePrecios = 0;
            double precioPromedio;

            for (Libro aux : inventarioLibros ) {
             
                sumaDePrecios = aux.getPrecio() + sumaDePrecios;
                
            }

            precioPromedio = sumaDePrecios / inventarioLibros.size();

            System.out.println("====== PROMEDIO DE PRECIO DE LOS LIBROS ======");

            System.out.println("Precio promedio =  $ " + precioPromedio );

            System.out.println("=======================");

        }

        public void impresionDeInventario() {
            
            System.out.println(" ====== LISTA DE LIBROS ====== ");

            for ( Libro aux : inventarioLibros ) {
                
                System.out.println( aux.toString() );

            }

            System.out.println("====================");

        }

}
