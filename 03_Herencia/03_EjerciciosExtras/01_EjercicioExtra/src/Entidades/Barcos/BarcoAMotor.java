package Entidades.Barcos;

import java.util.Calendar;

import Entidades.Entidades_Auxiliares.Matricula;

public class BarcoAMotor extends Barco {
    
    //  ATRIBUTOS

        protected Integer potenciaMotor;
    
    //  CONSTRUCTORES

        public BarcoAMotor(Integer portenciaMotor) {
            this.potenciaMotor = portenciaMotor;
        }

        public BarcoAMotor(Matricula matricula, Double metrosEslora, Calendar fechaFabricacion,
            Integer numeroDeMastiles) {
            super(matricula, metrosEslora, fechaFabricacion);
            this.potenciaMotor = numeroDeMastiles;
        }

    //  GETTERS y SETTERS

        public Integer getNumeroDeMastiles() {
            return potenciaMotor;
        }

        public void setNumeroDeMastiles(Integer numeroDeMastiles) {
            this.potenciaMotor = numeroDeMastiles;
        }

    //  MÉTODO toString

        @Override
        public String toString() {
            return "BarcoVelero [potenciaMotor=" + potenciaMotor + "]";
        } 

}
