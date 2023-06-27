package Entidades;

import java.util.Calendar;

public final class PersonalServicio extends Empleado {
    
    //  ATRIBUTOS

        private String seccion;

    //  CONSTRUCTORES

        public PersonalServicio(String nombres, String apellidos, Long numDNI, String estadoCivil,
            Calendar añoIncorporacion, Integer numeroDespachoAsignado) {
            super(nombres, apellidos, numDNI, estadoCivil, añoIncorporacion, numeroDespachoAsignado);
        }

        public PersonalServicio() {
        }

    //  GETTERS y SETTERS

        public String getSeccion() {
            return seccion;
        }

        public void setSeccion(String seccion) {
            this.seccion = seccion;
        }

    //  MÉTODO ToString

        @Override
        public String toString() {
            return "PersonalServicio [seccion=" + seccion + "]";
        }
        
}
