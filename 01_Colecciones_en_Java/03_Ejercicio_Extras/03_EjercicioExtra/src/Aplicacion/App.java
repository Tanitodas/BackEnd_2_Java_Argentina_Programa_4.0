package Aplicacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import Entidades.Persona;
import Servicio.PersonaService;

// Desarrolla una función que reciba como parámetro un ArrayList de objetos "Persona" y devuelva un HashSet
// con los nombres de las personas. A continuación, implementa otra función que tome este HashSet como entrada y
// retorne un TreeSet ordenado de los nombres. Además, crea las entidades y servicios necesarios.

public class App {
    public static void main(String[] args) throws Exception {
       
        PersonaService servicio = new PersonaService();

        System.out.println(" Creamos el ArrayList con elementos de tipo 'Persona' ");
        ArrayList<Persona> lista = servicio.crearArrayList();
        System.out.println("");

        System.out.println(" Transformamos el ArrayList en 'HashSet' ");
        HashSet<String> listaString = servicio.TransformacionHashSet(lista);
        System.out.println("");

        System.out.println(" Transformamos el HashSet en 'TreeSet' ");
        TreeSet<String> listaStringOrdenado = servicio.transformacionTreeSet(listaString);
        System.out.println("");

        System.out.println("Imprimimos el TreeSet de Nombres Ordenado");

        System.out.println("========= Lista de nombres Ordenados ==========");

        for ( String aux : listaStringOrdenado ) {
            
            System.out.println( aux.toString() );

        }

        System.out.println("=====================================");

    }

}
