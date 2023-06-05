package Entidades;

public class Alumno {
    
    //  ATRIBUTOS

        private String nombre; 
        private String apellido;
        private Long dni;
        private Integer votos;
        private Integer cantDados;

    //  CONSTRUCTORES

        public Alumno() {
        }

        public Alumno(String nombre, String apellido, Long dni) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
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

        public Long getDni() {
            return dni;
        }

        public void setDni(Long dni) {
            this.dni = dni;
        }

    //  MÉTODO toString

        @Override
        public String toString() {
            return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
        }

}
