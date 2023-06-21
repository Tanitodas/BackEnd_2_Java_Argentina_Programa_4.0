package Entidades;

//      2_ Persona con atributos: nombre, apellido, edad, documento y Perro.

public class Persona {
    
    // ATRIBUTOS

        private String nombre;
        private String apellido;
        private Integer edad;
        private Long dni;
        private Perro perro;
        private Boolean dueño;

    //  CONSTRUCTORES

        public Persona() {
        }

        public Persona(String nombre, String apellido, Integer edad, Long dni, Perro perro, Boolean dueño) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.dni = dni;
            this.perro = perro;
            this.dueño = dueño;
        }

    //  GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public Long getDni() {
            return dni;
        }

        public void setDni(Long dni) {
            this.dni = dni;
        }

        public Perro getPerro() {
            return perro;
        }

        public void setPerro(Perro perro) {
            this.perro = perro;
        }

        public Boolean getDueño() {
            return dueño;
        }

        public void setDueño(Boolean dueño) {
            this.dueño = dueño;
        }

    //  MÉTODO toSTRING

        @Override
        public String toString() {
            return "Persona [ nombre = " + nombre + ", apellido = " + apellido + ", edad = " + edad + ", dni = " + dni
            + ", perro = " + perro + ", dueño = " + dueño + " ]";
        }
        
}
