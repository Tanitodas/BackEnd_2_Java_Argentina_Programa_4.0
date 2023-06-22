package Aplicacion;

// Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
// un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
// está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
// ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
// la lista ordenada.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import Entidades.Raza;
import Servicio.RazasService;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner entrada = new Scanner(System.in);
        RazasService servicio = new RazasService();

        System.out.println("¿Desea crear una lista de Razas? S/N");
        String opcion = entrada.nextLine();

        if (opcion.equalsIgnoreCase("S")) {

            ArrayList<Raza> listaDeRazas = new ArrayList<>();
            String op;

            do {
                
                Raza nuevaRaza = servicio.creacionDeNuevaRazas();
                
                servicio.rellenarArrayList(listaDeRazas, nuevaRaza);

                System.out.println("¿Desea seguir creando razas? S/N ");
                op = entrada.nextLine();

            } while ( op.equalsIgnoreCase("S") );

            System.out.println("--------------------------");

            servicio.mostrarLista( listaDeRazas );

            System.out.println("--------------------------");

            Iterator<Raza> iterador = listaDeRazas.iterator();

            System.out.println("¿Que raza desea eliminar de la lista?");
            opcion = entrada.nextLine();

            while ( iterador.hasNext() ) {
                
                if ( opcion.equalsIgnoreCase( iterador.next().getNombreRaza() ) ) {
                    
                    iterador.remove();

                }

            }

            System.out.println("--------------------------");
            System.out.println("La lista despues de eliminar una raza es : ");

            servicio.mostrarLista( listaDeRazas );

        } else {

            System.out.println("Que lastima que no pueda ayudarte :c");

        }

        entrada.close();

    }

}
