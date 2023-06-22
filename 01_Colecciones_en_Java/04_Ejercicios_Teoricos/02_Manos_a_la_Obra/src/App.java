// Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        //  LISTAS
            ArrayList<Integer> numerosA = new ArrayList<>(); // Lista de tipo 'Integer'
            int a1 = 20;
            numerosA.add(a1); // Agregamos al numero 20 en la lista, en la posicion 0
            int b1 = 20;
            numerosA.add(b1); // Agregamos al numero 20 en la lista, en la posicion 1
            int c1 = 20;
            numerosA.add(c1); // Agregamos al numero 20 en la lista, en la posicion 2
            int d1 = 20;
            numerosA.add(d1); // Agregamos al numero 20 en la lista, en la posicion 3
            int e1 = 20;
            numerosA.add(e1); // Agregamos al numero 20 en la lista, en la posicion 4
            System.out.println("Imprimimos la lista");
            System.out.println(numerosA.toString());

        //  CONJUNTOS
            // Recordar que los HashSet no guardan objetos iguales
            HashSet<Integer> numerosB = new HashSet<>();
            Integer a2 = 20;
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

        //  MAPAS
            // Recordar que los HashMap no guardan objetos iguales
            HashMap<Integer , String> alumnos = new HashMap<>();
            int dni = 34576189;
            String nombreAlumno = "Pepe";
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

    }
}
