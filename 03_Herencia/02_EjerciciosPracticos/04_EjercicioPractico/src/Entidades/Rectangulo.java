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

public class Rectangulo implements CalculosFormas {

    //  ATRIBUTOS   

        private Double base;
        private Double altura;

    //  CONSTRUCTORES

        public Rectangulo() {
        }

        public Rectangulo(Double base, Double altura) {
            this.base = base;
            this.altura = altura;
        }

    //  MÉTODOS PERSONALIZADOS  

        @Override
        public Double calcularArea() {
            
            Double areaRectangulo = this.base * this.altura;

            return areaRectangulo;

        }

        @Override
        public Double calcularPerimetro() {
            
            Double perimetroRectangulo = 2 * ( this.base + this.altura );

            return perimetroRectangulo;

        }

    //  MÉTODOS toSTRING

        @Override
        public String toString() {
            return "Rectangulo [ Base = " + base + " , Altura = " + altura + " , Area = " + calcularArea() + " , Perimetro = " + calcularPerimetro() + "]";
        }
    
}
