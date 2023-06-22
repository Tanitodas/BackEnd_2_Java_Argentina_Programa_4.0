package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Entidades.Producto;

// Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
// productos que venderemos y el precio que tendrán. Además, se necesita que la
// aplicación cuente con las funciones básicas.Estas las realizaremos en el servicio. Como:
//
// Introducir un elemento.
// Modificar su precio.
// Eliminar un producto.
// Mostrar los productos que tenemos con su precio (Utilizar Hashmap). 
//
// El HashMap tendrá de llave el nombre del producto y de valor el *precio*.
//
// Realizar un menú para lograr todas las acciones previamente mencionadas.

public class ProductoService {
    
    //  ATRIBUTOS  

        private Scanner entrada = new Scanner(System.in);
        private HashMap<Integer,Producto> listaDeProductos = new HashMap<>();

    //  MÉTODOS PERSONALIZADOS

        public void crearProductos() {
            
            String op;

            do {

                Producto producto = new Producto();
                
                System.out.println("Ingrese el NOMBRE del producto");
                producto.setNombreProducto( entrada.nextLine() );

                System.out.println("Ingrese el PRECIO del producto");
                producto.setPrecioProducto( entrada.nextInt() );

                producto.setCodigoProducto( producto.getNombreProducto().hashCode() ); // Almacenamos como el codigo del producto como un valor hash

                entrada.nextLine(); //  Limpiamos el buffer

                // Añadimos como llave el codigo del producto al codigo del mismo y como valor del 'HashMap'
                // el objeto del producto.
                listaDeProductos.put( producto.getCodigoProducto(), producto );

                System.out.println("¿Desea agregar otra pelicula? S/N");
                op = entrada.nextLine();
            
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {

                    do {
                    
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();

                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

                }

            } while ( op.equalsIgnoreCase("S") );

        }

        private void mostrarProductos() {
            
            for ( Map.Entry<Integer,Producto> aux : listaDeProductos.entrySet() ) {
                
                System.out.println("------------------------------------------------------");
                System.out.println( " Nombre Producto = " + aux.getValue().getNombreProducto() );
                System.out.println( " Precio Producto = " + aux.getValue().getPrecioProucto() );
                System.out.println( " Codigo Producto = " + aux.getKey() );
                System.out.println("------------------------------------------------------");

            }

        }

        public void modificarPrecio() {
            
            System.out.println("Ingrese el nombre del producto del que quiere modificar el precio");
            String productoModificarPrecio = entrada.nextLine();

            for ( Map.Entry<Integer,Producto> aux : listaDeProductos.entrySet() ) {
                
                if ( aux.getValue().getNombreProducto().equalsIgnoreCase(productoModificarPrecio) ) {
                    
                    System.out.println("El precio actual del producto es igual a: {" + aux.getValue().getPrecioProucto() + "}" );

                    System.out.println("¿Cual es el precio nuevo del producto?");
                    aux.getValue().setPrecioProducto( entrada.nextInt() );

                } else {

                    System.out.println("No se encontraron coincidencias en la lista de productos");

                }

            }

            entrada.nextLine(); //  Limpiamos el buffer

            System.out.println("La lista despues de modificar el precio a {" + productoModificarPrecio + "} es: ");
            mostrarProductos();

        }

        public void eliminarProducto() {
            
            System.out.println("Ingrese el nombre del producto que quiere eliminar de la lista");
            String productoEliminar = entrada.nextLine();

            for ( Map.Entry<Integer,Producto> aux : listaDeProductos.entrySet() ) {
                
                if ( aux.getValue().getNombreProducto().equalsIgnoreCase(productoEliminar) ) {
                    
                    listaDeProductos.remove( aux.getKey() );

                } else {

                    System.out.println("No se encontraron coincidencias en la lista de productos");

                }

            }

            System.out.println("La lista despues de eliminar el producto a {" + productoEliminar + "} es: ");
            mostrarProductos();

        }

        public void mostrarProductosYPrecios() {

            System.out.println("*******************************************");
            System.out.println("La lista de los productos y sus precios es : ");
            
            for ( Map.Entry<Integer,Producto> aux : listaDeProductos.entrySet() ) {
                
                System.out.println("------------------------------------------------------");
                System.out.println( " Nombre Producto = " + aux.getValue().getNombreProducto() );
                System.out.println( " Precio Producto = " + aux.getValue().getPrecioProucto() );
                System.out.println("------------------------------------------------------");

            }

        }

}
