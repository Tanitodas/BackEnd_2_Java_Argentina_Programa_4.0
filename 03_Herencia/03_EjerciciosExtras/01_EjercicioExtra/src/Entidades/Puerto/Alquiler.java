package Entidades.Puerto;

import java.util.Calendar;

import Entidades.Barcos.Barco;

// En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
// nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
// amarre y el barco que lo ocupará.
//
// Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
// Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
//      _ Número de mástiles para veleros.
//      _ Potencia en CV para barcos a motor.
//      _ Potencia en CV y número de camarotes para yates de lujo.
//
// Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
// alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
// multiplicando por 10 los metros de eslora).
//
// En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
// sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
// en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
// el número de camarotes.
//
// Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
// métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
// precio final de su alquiler.

public class Alquiler {
    
    //  ATRIBUTOS

        private String nombre;
        private Long DNI;
        private Calendar fechaAlquiler;
        private Calendar fechaDeDevolucion;
        private String posicionAmarre;
        private Barco barcoOcupante;

    //  CONSTRUCTORES

        public Alquiler() {
        }

        public Alquiler(String nombre, Long dNI, Calendar fechaAlquiler, Calendar fechaDeDevolucion,
                String posicionAmarre, Barco barcoOcupante) {
            this.nombre = nombre;
            DNI = dNI;
            this.fechaAlquiler = fechaAlquiler;
            this.fechaDeDevolucion = fechaDeDevolucion;
            this.posicionAmarre = posicionAmarre;
            this.barcoOcupante = barcoOcupante;
        }

    //  GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Long getDNI() {
            return DNI;
        }

        public void setDNI(Long dNI) {
            DNI = dNI;
        }

        public Calendar getFechaAlquiler() {
            return fechaAlquiler;
        }

        public void setFechaAlquiler(Calendar fechaAlquiler) {
            this.fechaAlquiler = fechaAlquiler;
        }

        public Calendar getFechaDeDevolucion() {
            return fechaDeDevolucion;
        }

        public void setFechaDeDevolucion(Calendar fechaDeDevolucion) {
            this.fechaDeDevolucion = fechaDeDevolucion;
        }

        public String getPosicionAmarre() {
            return posicionAmarre;
        }

        public void setPosicionAmarre(String posicionAmarre) {
            this.posicionAmarre = posicionAmarre;
        }

        public Barco getBarcoOcupante() {
            return barcoOcupante;
        }

        public void setBarcoOcupante(Barco barcoOcupante) {
            this.barcoOcupante = barcoOcupante;
        }

    //  MÉTODO toString

        @Override
        public String toString() {
            return "Alquiler [nombre=" + nombre + ", DNI=" + DNI + ", fechaAlquiler=" + fechaAlquiler
                    + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionAmarre=" + posicionAmarre
                    + ", barcoOcupante=" + barcoOcupante + "]";
        }
        
}
