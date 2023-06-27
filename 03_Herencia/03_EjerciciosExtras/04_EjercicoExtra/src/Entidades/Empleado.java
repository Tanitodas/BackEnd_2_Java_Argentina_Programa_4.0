package Entidades;

import java.util.Calendar;

//      _ Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//        incorporación a la facultad y qué número de despacho tienen asignado.

public class Empleado extends Persona {
    
    //  ATRIBUTOS DE LA CLASE

        private Calendar añoIncorporacion;
        private Integer numeroDespachoAsignado;

    //  CONSTRUCTORES

        public Empleado(){ 
        }

        public Empleado(String nombres, String apellidos, Long numDNI, String estadoCivil, Calendar añoIncorporacion,
            Integer numeroDespachoAsignado) {
            super(nombres, apellidos, numDNI, estadoCivil);
            this.añoIncorporacion = añoIncorporacion;
            this.numeroDespachoAsignado = numeroDespachoAsignado;
        }
        
    //  GETTERS y SETTERS

        public Calendar getAñoIncorporacion() {
            return añoIncorporacion;
        }

        public void setAñoIncorporacion(Calendar añoIncorporacion) {
            this.añoIncorporacion = añoIncorporacion;
        }

        public Integer getNumeroDespachoAsignado() {
            return numeroDespachoAsignado;
        }

        public void setNumeroDespachoAsignado(Integer numeroDespachoAsignado) {
            this.numeroDespachoAsignado = numeroDespachoAsignado;
        }

    //  MÉTODO ToString

        @Override
        public String toString() {
            return "Empleado [añoIncorporacion=" + añoIncorporacion + ", numeroDespachoAsignado="
                    + numeroDespachoAsignado + "]";
        }

}
