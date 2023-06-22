package Aplicacion;

import Entidades.Perro;
import Entidades.Persona;

// Realizar un programa para que una Persona pueda adoptar un Perro.
// Vamos a contar de dos clases: 
//
//      1_ Perro, que tendrá como atributos: nombre, raza, edad y tamaño.
//
//      2_ Persona con atributos: nombre, apellido, edad, documento y Perro.
//
// Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
// pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
// la clase Persona, la información del Perro y de la Persona.

public class App {
    
    public static void main(String[] args) throws Exception {
        
        //  Creamos las dos personas
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        //  Creamos los dos perros
        Perro perro1 = new Perro("firulai1","doberman",6,true);
        Perro perro2 = new Perro("firulai2","labrador",8,true);

        //  Seteamos los perros a las personas
        persona1.setPerro(perro1);
        persona2.setPerro(perro2);

        //  Imprimimos los atributos de las personas
        System.out.println(persona1);
        System.out.println(persona2);

    }

}
