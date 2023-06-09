// Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
// La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
// Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
// mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
// siguiente:

import Entidades.Animal;
import Entidades.Perro;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Animal perro1 = new Perro("Stich", " balanceado ", "perro", 5);
        perro1.alimentarse();

        Animal gato1 = new Perro("Michi", " balanceado de gato ", "gato naranja", 2);
        gato1.alimentarse();

        Animal caballo1 = new Perro("Afortunado", " pastito ", "pura sangre pa", 5);
        caballo1.alimentarse();

    }

}
