package Entidades;

import java.util.Calendar;

// Crear la clase "Pedido" con los siguientes atributos:  número de orden, descripción y fecha de creación. 
// Agregar constructor vacío, con parámetros, getters, setters y demás necesario.
// Dentro del servicio vamos a crear un método para la creación del objeto Pedido, solicitando los datos al usuario.
// Dichos objetos creados, los vamos a guardar dentro de una lista de Pedidos.

// Luego debemos:
// - Buscar un pedido según el número de orden y mostrarlo.
// - Buscar un pedido según una fecha ingresada por el usuario y mostrarlo. En el caso de que no existan 
//   pedidos con esa fecha, debe informar al usuario.
// - Mostrar todos los pedidos
// - Ordenar los pedidos por fecha de creación y mostrarlos
// - Remover los 3 primeros pedidos de la lista

// Utilizar un switch para que el usuario elija la opción que desea:
// 1)Agregar Pedido
// 2)Buscar un Pedido por número de orden
// 3)Buscar un Pedido por fecha de creación
// 4)Mostrar todos los pedidos
// 5)Ordenar y mostrar los pedidos según fecha de creación
// 6)Remover un Pedido de la lista

public class Pedido {
    
    //  ATRIBUTOS 

        private int numeroOrden;
        private String descripcion;
        private Calendar fechaCreacion;

    //  CONSTRUCCTORES

        public Pedido() {
        }

        public Pedido(int numeroOrden, String descripcion, Calendar fechaCreacion) {
            this.numeroOrden = numeroOrden;
            this.descripcion = descripcion;
            this.fechaCreacion = fechaCreacion;
        }

    //  GETTERS y SETTERS

        public int getNumeroOrden() {
            return numeroOrden;
        }

        public void setNumeroOrden(int numeroOrden) {
            this.numeroOrden = numeroOrden;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public Calendar getFechaCreacion() {
            return fechaCreacion;
        }

        public void setFechaCreacion(Calendar fechaActual) {
            this.fechaCreacion = fechaActual ;
        }

    //  MÉTODO toSTRING

        // Le sumamos '+1' al termino 'fechaCreacion.get( Calendar.MONTH )' ya que los meses en la clase
        // 'GregorianCalendar' empiezan desde 0. Es decir: Enero = 0 , Febrero = 1 , etc , etc.
        @Override
        public String toString() {
            return "Pedido [numeroOrden=" + numeroOrden + ", descripcion=" + descripcion + ", fechaCreacion="
                    + fechaCreacion.get( Calendar.DAY_OF_MONTH ) + " / " + ( fechaCreacion.get( Calendar.MONTH ) + 1 ) + " / " + fechaCreacion.get( Calendar.YEAR ) + "]";
        }

}
