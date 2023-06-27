package Entidades;

import java.util.Calendar;

public final class Profesor extends Empleado {
    
    //  ASIGNATURA

        private String departamento;

    //  CONSTRUCTORES

        public Profesor(String nombres, String apellidos, Long numDNI, String estadoCivil, Calendar añoIncorporacion,
            Integer numeroDespachoAsignado) {
            super(nombres, apellidos, numDNI, estadoCivil, añoIncorporacion, numeroDespachoAsignado);
        }

        public Profesor() {
        }

    // GETTERS y SETTERS
        
        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

    //  MÉTODO ToString

        @Override
        public String toString() {
            return "Profesor [departamento=" + departamento + "]";
        } 

}
