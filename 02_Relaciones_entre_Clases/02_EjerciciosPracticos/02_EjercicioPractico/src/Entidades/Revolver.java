package Entidades;

import java.util.Random;

// Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
// del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
// tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
// Métodos:
// • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
// deben ser aleatorios.
// • mojar(): devuelve true si la posición del agua coincide con la posición actual
// • siguienteChorro(): cambia a la siguiente posición del tambor
// • toString(): muestra información del revolver (posición actual y donde está el agua)

public class Revolver {
    
    // ATRIBUTOS

        private Integer posicionActual;
        private Integer posicionAgua;

    //  CONSTRUCTORES

        public Revolver() {
        }

        public Revolver(Integer posicionActual, Integer posicionAgua) {
            this.posicionActual = posicionActual;
            this.posicionAgua = posicionAgua;
        }

    //  GETTERS y SETTERS

        public Integer getPosicionActual() {
            return posicionActual;
        }

        public void setPosicionActual(Integer posicionActual) {
            this.posicionActual = posicionActual;
        }

        public Integer getPosicionAgua() {
            return posicionAgua;
        }

        public void setPosicionAgua(Integer posicionAgua) {
            this.posicionAgua = posicionAgua;
        }

    //  MÉTODO toString

        @Override
        public String toString() {
            return "Revolver [ posicionActual = " + posicionActual + ", posicionAgua = " + posicionAgua + "]";
        }

    //  MÉTODOS PERSONALIZADOS

        public void llenarRevolver() {
            
            Random al = new Random();

            this.posicionActual = al.nextInt(7);
            this.posicionAgua = al.nextInt(7);

        }

        public Boolean mojar() {
            
            return this.posicionActual == this.posicionAgua;

        }

        public void siguienteChorro() {
            
            if ( this.posicionActual == 5 ) {
                
                this.posicionActual = 0;

            } else {

                this.posicionActual = this.posicionActual + 1;

            }
        
        }

}
