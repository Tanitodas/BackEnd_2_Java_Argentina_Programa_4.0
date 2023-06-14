package Entidades.Barcos;

import java.util.Calendar;

import Entidades.Entidades_Auxiliares.Matricula;

public class BarcoVelero extends Barco {
    
    //  ATRIBUTOS

        private Integer numeroDeMastiles;
    
    //  CONSTRUCTORES

        public BarcoVelero(Integer numeroDeMastiles) {
            this.numeroDeMastiles = numeroDeMastiles;
        }

        public BarcoVelero(Matricula matricula, Double metrosEslora, Calendar fechaFabricacion,
            Integer numeroDeMastiles) {
            super(matricula, metrosEslora, fechaFabricacion);
            this.numeroDeMastiles = numeroDeMastiles;
        }

    //  GETTERS y SETTERS

        public Integer getNumeroDeMastiles() {
            return numeroDeMastiles;
        }

        public void setNumeroDeMastiles(Integer numeroDeMastiles) {
            this.numeroDeMastiles = numeroDeMastiles;
        }

    //  MÉTODO toString

        @Override
        public String toString() {
            return "BarcoVelero [numeroDeMastiles=" + numeroDeMastiles + "]";
        } 

}
