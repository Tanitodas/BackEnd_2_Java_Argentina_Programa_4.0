package Entidades.Barcos;

import java.util.Calendar;

import Entidades.Entidades_Auxiliares.Matricula;

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

public class Barco {

    //  ATRIBUTOS

        private Matricula matricula;
        private Double metrosEslora;
        private Calendar fechaFabricacion;

    //  CONSTRUCTORES

        public Barco() {
        }

        public Barco(Matricula matricula, Double metrosEslora, Calendar fechaFabricacion) {
            this.matricula = matricula;
            this.metrosEslora = metrosEslora;
            this.fechaFabricacion = fechaFabricacion;
        }

    //  GETTERS y SETTERS

        public Matricula getMatricula() {
            return matricula;
        }

        public void setMatricula(Matricula matricula) {
            this.matricula = matricula;
        }

        public Double getMetrosEslora() {
            return metrosEslora;
        }

        public void setMetrosEslora(Double metrosEslora) {
            this.metrosEslora = metrosEslora;
        }

        public Calendar getFechaFabricacion() {
            return fechaFabricacion;
        }

        public void setFechaFabricacion(Calendar fechaFabricacion) {
            this.fechaFabricacion = fechaFabricacion;
        }

    //  MÉTODOS PERSONALIZADOS

        
        

        
        

}
