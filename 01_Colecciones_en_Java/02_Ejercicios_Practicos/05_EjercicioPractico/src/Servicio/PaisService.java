package Servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import Entidades.Pais;

// Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
// usaremos un *Conjunto* o *Set*. 

// El programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al 
// usuario si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos los países 
// guardados en el conjunto. (Recordemos hacer los servicios en la clase correspondiente).

// Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
// cómo se ordena un conjunto.

// Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
// buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
// usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
// al usuario.

public class PaisService {
    
    //  ATRIBUTOS DE SERVICIO

        private Scanner entrada = new Scanner(System.in);
        private HashSet<Pais> listaPaises = new HashSet<>();

    //  MÉTODOS PERSONALIZADOS

        public void crearPais () {
            
            String op;

            do {

                Pais pais = new Pais();

                System.out.println("Ingrese el NOMBRE del pais");
                pais.setNombre( entrada.nextLine() );

                System.out.println("Ingrese el CONTINENTE al que pertenece el pais");
                pais.setContinente( entrada.nextLine() );

                //  Añadimos el objeto 'pais' al Set 'listaPaises'
                listaPaises.add(pais);

                System.out.println("¿Desea agregar otra pelicula? S/N");
                op = entrada.nextLine();
            
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {

                    do {
                    
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();

                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

                }
                
            } while ( op.equalsIgnoreCase("S") );

            System.out.println("La lista de paises es: ");
            mostrarHashSet(listaPaises);

        }

        private void mostrarHashSet( HashSet<Pais> conjunto ) {
            
            for (Pais aux : conjunto) {
                
                System.out.println(aux);

            }

        }

        public void ordenarHashSet(  ) {
            
            // Para ordenar la lista de paises debemos transformar la lista de tipo 'HashSet'
            // en un lista y ordenarla a traves de un comparator y elegir ordenar la lista por
            // el atributo de 'nombre' del pais.

            ArrayList<Pais> listaPaisesAux = new ArrayList<>(listaPaises);

            listaPaisesAux.sort(compararNombre);

            System.out.println("-----------------------------------------------");
            System.out.println("La lista de paises ordenada alfabeticamente es:");
            System.out.println("-----------------------------------------------");

            for ( Pais aux : listaPaisesAux ) {
                
                System.out.println( aux ); 

            }

        }

        //  Creamos el comparator para ordenar la lista de paises a traves de el atributo de el nombre
        //  de dicho país.
        
        public static Comparator<Pais> compararNombre = new Comparator<Pais>() {

            @Override
            public int compare(Pais p1, Pais p2) {
    
                return p1.getNombre().compareTo( p2.getNombre() );
    
            }
    
        };

        public void eliminarPaisDeLista( ) {

            System.out.println("-----------------------------------------------");
            System.out.println("La lista de los paises antes de eliminar el pais es :");
            mostrarHashSet(listaPaises);
            
            System.out.println("¿Que pais desea eliminar de la lista?");
            String paisEliminar = entrada.nextLine();

            //  Creamos el 'iterator'
            Iterator<Pais> it = listaPaises.iterator();
            
            while ( it.hasNext() ) {

                if ( paisEliminar.equalsIgnoreCase( it.next().getNombre() ) ) {
                    
                    it.remove();

                } else {

                    System.out.println("No se han encontrado coincidencias");

                }

            }

            System.out.println("-----------------------------------------------");
            System.out.println("La lista despues de eliminar {" + paisEliminar + "} es igual a: ");
            System.out.println("-----------------------------------------------");

            mostrarHashSet(listaPaises);

        }

}
