package Entidades;

//      _ En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//        matriculados

public final class Estudiante extends Persona {
    
    //  ATRIBUTOS DE LA CLASE   

        private String asignatura;

    //  CONSTRUCCTORES  

        public Estudiante() {
        }

        public Estudiante(String nombres, String apellidos, Long numDNI, String estadoCivil, String asignatura) {
            super(nombres, apellidos, numDNI, estadoCivil);
            this.asignatura = asignatura;
        }
    
    //  GETTERS y SETTERS   

        public String getAsignatura() {
            return asignatura;
        }

        public void setAsignatura(String asignatura) {
            this.asignatura = asignatura;
        }

    // MÉTODO ToString

        @Override
        public String toString() {
            return "Estudiante [asignatura=" + asignatura + "]";
        }

}
