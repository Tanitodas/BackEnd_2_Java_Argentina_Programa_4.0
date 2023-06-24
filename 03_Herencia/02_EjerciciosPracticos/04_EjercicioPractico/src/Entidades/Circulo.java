package Entidades;

import Interfaceses.CalculosFormas;

// Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
// geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
// dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
// dos métodos para calcular el área, el perímetro y el valor de PI como constante.
// Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
// calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
// resultado final.
// Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
// Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

public class Circulo implements CalculosFormas {

    //  ATRIBUTOS

        private Double radio;

    //  CONSTRUCTORES

        public Circulo() {
        }

        public Circulo(Double radio) {
            this.radio = radio;
        }

    //  GETTERS y SETTERS

        public Double getRadio() {
            return radio;
        }

        public void setRadio(Double radio) {
            this.radio = radio;
        }

    //  MÉTODOS PERSONALIZADOS

        @Override
        public Double calcularArea() {
            
            Double areaCirculo = CalculosFormas.valorDePi * this.radio * this.radio ;

            return areaCirculo;

        }

        @Override
        public Double calcularPerimetro() {
            
            Double perimetroCirculo = CalculosFormas.valorDePi * 2 * this.radio;

            return perimetroCirculo;

        }

    //  MÉTODO toSTRING

        @Override
        public String toString() {
            return "Circulo [ Radio = " + this.radio + " , Area = " + calcularArea() + " , Perimetro = " + calcularPerimetro() + "]";
        }
    
}
