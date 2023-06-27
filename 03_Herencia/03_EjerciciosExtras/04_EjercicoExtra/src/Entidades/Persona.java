package Entidades;

//      _ Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//        identificación y su estado civil.

public class Persona {
    
    //  ATRIBUTOS DE CLASE

        protected String nombres;
        protected String apellidos;
        protected Long numDNI;
        protected String estadoCivil;

    //  CONSTRUCCTOR

        public Persona() {
        }

        public Persona(String nombres, String apellidos, Long numDNI, String estadoCivil) {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.numDNI = numDNI;
            this.estadoCivil = estadoCivil;
        }

    //  GETTERS y SETTERS
    
        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public Long getNumDNI() {
            return numDNI;
        }

        public void setNumDNI(Long numDNI) {
            this.numDNI = numDNI;
        }

        public String getEstadoCivil() {
            return estadoCivil;
        }

        public void setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
        }

    //  MÉTODO ToString

        @Override
        public String toString() {
            return "Personas [nombres=" + nombres + ", apellidos=" + apellidos + ", numDNI=" + numDNI + ", estadoCivil="
                    + estadoCivil + "]";
        }
        
}
