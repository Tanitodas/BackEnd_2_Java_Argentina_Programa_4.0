package Aplicacion;

import Servicio.ProductoService;

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

public class TiendaApp {
    public static void main(String[] args) throws Exception {
        
        ProductoService servicio = new ProductoService();

        servicio.crearProductos();

        servicio.mostrarProductosYPrecios();

        servicio.modificarPrecio();

        servicio.eliminarProducto();

    }
}
