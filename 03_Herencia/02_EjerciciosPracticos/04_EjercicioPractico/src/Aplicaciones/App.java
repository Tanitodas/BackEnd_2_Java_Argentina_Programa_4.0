package Aplicaciones;

import Entidades.Circulo;
import Entidades.Rectangulo;

// Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
// geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
// dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
// dos métodos para calcular el área, el perímetro y el valor de PI como constante.
// Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
// calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
// resultado final.
// Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
// Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

public class App {
    public static void main(String[] args) throws Exception {
        
        Circulo c1 = new Circulo(25.0);
        Rectangulo r1 = new Rectangulo(15.0, 10.2);

        System.out.println("El circulo tiene las siguientes caracteristicas : " + c1.toString() );
        System.out.println("El rectangulo tiene las siguientes caracteristicas : " + r1.toString() );

    }
    
}
