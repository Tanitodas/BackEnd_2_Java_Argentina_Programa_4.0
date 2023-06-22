package Aplicacion;

import java.util.Scanner;

import Servicio.InventarioLibreria;

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

public class LibreriaApp {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        InventarioLibreria servicio = new InventarioLibreria();

        int opcion;

        do {

            System.out.println("==== Menú ====");
            System.out.println("1. AGREGAR libro al inventario");
            System.out.println("2. MOSTRAR autores unicos presentes en el inventario");
            System.out.println("3. ORDENAR y MOSTRAR libros por TITULO");
            System.out.println("4. CALCULAR y MOSTRAR precio promedio del inventario");
            System.out.println("5. MOSTRAR inventario de libros");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    
                    servicio.añadimosLibrosAlInventario();
                    break;

                case 2:
                    
                    servicio.obtenerAutoresUnicos();
                    break;

                case 3:
                    
                    servicio.obtenerLibrosOrdenadosXTitulo();
                    break;

                case 4:
                
                    servicio.calcularPrecioPromedio();
                    break;

                case 5:
                
                    servicio.impresionDeInventario();
                    break;

                case 0:

                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            entrada.nextLine(); //  Limpiamos el buffer

            System.out.println(); // Agregar una línea en blanco para mayor legibilidad

        } while (opcion != 0);

        entrada.close();



    }
}
