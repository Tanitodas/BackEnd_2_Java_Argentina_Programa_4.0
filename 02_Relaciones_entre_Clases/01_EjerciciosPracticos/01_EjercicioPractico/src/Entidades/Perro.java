package Entidades;

//  1_ Perro, que tendrá como atributos: nombre, raza, edad y tamaño.

public class Perro {
    
    //  ATRIBUTOS

        private String nombre;
        private String raza;
        private Integer edad;
        private Boolean dueño;

    //  CONSTRUCTORES

        public Perro() {
        }

        public Perro(String nombre, String raza, Integer edad, Boolean dueño) {
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
            this.dueño = dueño;
        }

    //  GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public Boolean getDueño() {
            return dueño;
        }

        public void setDueño(Boolean dueño) {
            this.dueño = dueño;
        }

    // MÉTODOS toSTRING

        @Override
        public String toString() {
            return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", dueño=" + dueño + "]";
        }

}
