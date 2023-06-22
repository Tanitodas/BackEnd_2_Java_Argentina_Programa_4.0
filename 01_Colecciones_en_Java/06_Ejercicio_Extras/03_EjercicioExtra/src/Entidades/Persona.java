package Entidades;

// Desarrolla una función que reciba como parámetro un ArrayList de objetos "Persona" y devuelva un HashSet
// con los nombres de las personas. A continuación, implementa otra función que tome este HashSet como entrada y
// retorne un TreeSet ordenado de los nombres. Además, crea las entidades y servicios necesarios.

public class Persona {
    
    //  ATRIBUTOS DE LA CLASE
    
        private String nombre;
        private int edad;
        private long dni;

    //  CONSTRUCCTOR

        public Persona() {
        }

        public Persona(String nombre, int edad, long dni) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
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

        public long getDni() {
            return dni;
        }

        public void setDni(long dni) {
            this.dni = dni;
        }

    // MÉTODO toString

        @Override
        public String toString() {
            return " Persona [ nombre = " + nombre + ", edad = " + edad + ", dni = " + dni + " ] ";
        }
        
}
