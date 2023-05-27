package Entidades;

// Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
// productos que venderemos y el precio que tendrán. Además, se necesita que la
// aplicación cuente con las funciones básicas.Estas las realizaremos en el servicio. Como:
//
// Introducir un elemento.
// Modificar su precio.
// Eliminar un producto.
// Mostrar los productos que tenemos con su precio (Utilizar Hashmap). 
//
// El HashMap tendrá de llave el *nombre* del producto y de valor el *precio*.
//
// Realizar un menú para lograr todas las acciones previamente mencionadas.

public class Producto {
    
    // ATRIBUTOS

        private String nombreProducto;
        private Integer precioProducto;
        private Integer codigoProducto;

    // CONSTRUCCION

        public Producto() {
        }

        public Producto(String nombreProducto, Integer precioProducto, Integer codigoProducto) {
            this.nombreProducto = nombreProducto;
            this.precioProducto = precioProducto;
            this.codigoProducto = codigoProducto;
        }

    // GETTERS y SETTERS

        public String getNombreProducto() {
            return nombreProducto;
        }

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        public Integer getPrecioProucto() {
            return precioProducto;
        }

        public void setPrecioProducto(Integer precioProducto) {
            this.precioProducto = precioProducto;
        }

        public Integer getCodigoProducto() {
            return codigoProducto;
        }

        public void setCodigoProducto(Integer codigoProducto) {
            this.codigoProducto = codigoProducto;
        }

    // MÉTODO toString
        
        @Override
        public String toString() {
            return "Producto [ nombreProducto=" + nombreProducto + ", precioProucto=" + precioProducto
            + ", codigoProducto=" + codigoProducto + "]";
        }

}
