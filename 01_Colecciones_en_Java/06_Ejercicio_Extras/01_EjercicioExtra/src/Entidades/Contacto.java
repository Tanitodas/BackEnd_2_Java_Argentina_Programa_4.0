package Entidades;

// Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
// La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos
// los contactos y mostrar los contactos ordenados alfabéticamente por nombre.
// En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono).
// Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre,
// mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.

public class Contacto {
    
    //  ATRIBUTOS

        private String nombre;
        private Integer numeroDeTelefono;

    //  CONSTRUCCTOR

        public Contacto() {
        }

        public Contacto(String nombre, Integer numeroDeTelefono) {
            this.nombre = nombre;
            this.numeroDeTelefono = numeroDeTelefono;
        }

    //  GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getNumeroDeTelefono() {
            return numeroDeTelefono;
        }

        public void setNumeroDeTelefono(Integer numeroDeTelefono) {
            this.numeroDeTelefono = numeroDeTelefono;
        }

    //  MÉTODO toString
        
        @Override
        public String toString() {
            return "Contacto [nombre=" + nombre + ", numeroDeTelefono=" + numeroDeTelefono + "]";
        }

}
