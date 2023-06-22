package Servicio;

// Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
// un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
// está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
// ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
// la lista ordenada.

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
