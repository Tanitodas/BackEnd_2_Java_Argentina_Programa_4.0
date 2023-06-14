package Entidades.Barcos;

import java.util.Calendar;

import Entidades.Entidades_Auxiliares.Matricula;

public class YateDeLujo extends BarcoAMotor {
    
    //  ATRIBUTOS
    
        private Integer numeroCamarotes;
    
    //  CONSTRUCTORES

        public YateDeLujo(Integer potenciaMotor, Integer numeroCamarotes) {
            super(potenciaMotor);
            this.numeroCamarotes = numeroCamarotes;
        }
        
        public YateDeLujo(Matricula matricula, Double metrosEslora, Calendar fechaFabricacion, Integer numeroDeMastiles,
                Integer numeroCamarotes) {
            super(matricula, metrosEslora, fechaFabricacion, numeroDeMastiles);
            this.numeroCamarotes = numeroCamarotes;
        }

    //  GETTERS y SETTERS

        public Integer getNumeroCamarotes() {
            return numeroCamarotes;
        }

        public void setNumeroCamarotes(Integer numeroCamarotes) {
            this.numeroCamarotes = numeroCamarotes;
        } 

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
