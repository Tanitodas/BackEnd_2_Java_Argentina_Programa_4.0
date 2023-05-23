package Servicio;

// Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
// programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
// después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
// salir, se mostrará todos los perros guardados en el ArrayList.

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Raza;

public class RazasService {
    
    //  ATRIBUTOS De la clase service.

        private Scanner entrada;

    //  METODOS PERSONALIZADOS del servicio.

        public Raza creacionDeNuevaRazas() {
            
            entrada = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese el nombre de la raza nueva que quiere añadir");
            String nombre = entrada.next();
            
            return new Raza(nombre);
        
        }

        public void rellenarArrayList( ArrayList<Raza> listaRaza , Raza raza ) {
            
            listaRaza.add(raza);

        }

        public void mostrarLista( ArrayList<Raza> listaRaza ) {
            
            for ( Raza raza1 : listaRaza ) {
                
                System.out.println( raza1.toString() );

            }

        }

}
