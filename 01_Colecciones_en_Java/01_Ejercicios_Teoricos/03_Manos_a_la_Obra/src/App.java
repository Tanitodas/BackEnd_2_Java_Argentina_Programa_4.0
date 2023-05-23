// Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
// cada forma que aprendiste arriba.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        
    //  LISTAS
            
        ArrayList<Integer> numerosA = new ArrayList<>(); // Lista de tipo 'Integer'
        int a1 = 201;
        numerosA.add(a1); // Agregamos al numero 20 en la lista, en la posicion 0
        int b1 = 202;
        numerosA.add(b1); // Agregamos al numero 20 en la lista, en la posicion 1
        int c1 = 203;
        numerosA.add(c1); // Agregamos al numero 20 en la lista, en la posicion 2
        int d1 = 204;
        numerosA.add(d1); // Agregamos al numero 20 en la lista, en la posicion 3
        int e1 = 205;
        numerosA.add(e1); // Agregamos al numero 20 en la lista, en la posicion 4
            
        System.out.println("Imprimimos la lista");
        System.out.println(numerosA.toString());

        //  Eliminamos elemento por indice
        numerosA.remove(0); // eliminamos el elemento en el indice 0

        //  Eliminamos elemento por elemento (va a eliminar el primer 202 que se encuentre en la lista)
        //  numerosA.remove(203); (comentamos esta linea de codigo ya que nos toma el valor '202' como indice y no como
        //  valor de un elemento)

        System.out.println("Imprimimos la lista despues de eliminar los elementos");
        System.out.println(numerosA.toString());


    //  CONJUNTOS
        
        // Recordar que los HashSet no guardan objetos iguales
        HashSet<Integer> numerosB = new HashSet<>();
        Integer a2 = 201;
        numerosB.add(a2);
        Integer b2 = 202;
        numerosB.add(b2);
        Integer c2 = 203;
        numerosB.add(c2);
        Integer d2 = 204;
        numerosB.add(d2);
        Integer e2 = 205;
        numerosB.add(e2);
            
        System.out.println("Imprimimos el conjunto/set");
        System.out.println(numerosB.toString());

        //  Eliminamos elemento por indice (la unica forma de eliminar elementos del conjunto ,
        //  ya que los conjuntos no constan de índices, solo se puede borrar por elemento)
        numerosB.remove(202);

        System.out.println("Imprimimos el conjunto/set despues de eliminar el elemento 202");
        System.out.println(numerosB.toString());

    //  MAPAS
        
        // Recordar que los HashMap no guardan objetos iguales
        HashMap<Integer , String> alumnos = new HashMap<>();
        int dni = 345761891;
        String nombreAlumno = "Pepe1";
        alumnos.put(dni, nombreAlumno);

        int dni2 = 345761892;
        String nombreAlumno2 = "Pepe2";
        alumnos.put(dni2, nombreAlumno2);

        int dni3 = 345761893;
        String nombreAlumno3 = "Pepe3";
        alumnos.put(dni3, nombreAlumno3);

        int dni4 = 345761894;
        String nombreAlumno4 = "Pepe4";
        alumnos.put(dni4, nombreAlumno4);

        int dni5 = 345761895;
        String nombreAlumno5 = "Pepe5";
        alumnos.put(dni5, nombreAlumno5);

        System.out.println("Imprimimos el mapa");
        System.out.println(alumnos.toString());

        //  Eliminamos elemento por 'Llave' que es la que hace el elemento único, por eso en los mapas solo podemos 
        //  remover un elemento por su llave.
        alumnos.remove(345761895); // Eliminamos el elemento que tiene por valor a : "Pepe5"

        System.out.println("Imprimimos el mapa despues de eliminar el elemento con valor 'Pepe5'");
        System.out.println(alumnos.toString());

    }
}
