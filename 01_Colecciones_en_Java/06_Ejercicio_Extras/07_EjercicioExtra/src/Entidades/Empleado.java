package Entidades;

import java.util.Calendar;

// Sistema de gestión de empleados

// Crea un sistema de gestión de empleados en Java. Este sistema debe ser capaz de agregar, eliminar,
// buscar y actualizar empleados. Cada empleado debe tener un nombre, una edad, un número de identificación único
// y una fecha de contratación.

// Crea las siguientes clases de entidad:

// Empleado: que debe contener los atributos mencionados anteriormente.
// Crea las siguientes clases de servicios:

// ServicioEmpleado: que debe contener los métodos para agregar, eliminar, buscar y actualizar empleados.
// Utiliza la colección ArrayList para almacenar los empleados.

public class Empleado {
    
    //  ATRIBUTOS   

        private String nombre;
        private int edad;
        private int numeroIdentificacion;
        private Calendar fechaContratacion;

    //  CONSTRUCTORES

        public Empleado() {
        }

        public Empleado(String nombre, int edad, int numeroIdentificacion, Calendar fechaContratacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.numeroIdentificacion = numeroIdentificacion;
            this.fechaContratacion = fechaContratacion;
        }

    //  GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getNumeroIdentificacion() {
            return numeroIdentificacion;
        }

        public void setNumeroIdentificacion(int numeroIdentificacion) {
            this.numeroIdentificacion = numeroIdentificacion;
        }

        public Calendar getFechaContratacion() {
            return fechaContratacion;
        }

        public void setFechaContratacion(Calendar fechaContratacion) {
            this.fechaContratacion = fechaContratacion;
        }
        
    //  MÉTODO toString

        @Override
        public String toString() {
            return "Empleado [nombre=" + nombre + ", edad=" + edad + ", numeroIdentificacion=" + numeroIdentificacion
            + ", fechaContratacion=" + fechaContratacion + "]";
        }

}
