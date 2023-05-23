import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        // CODIGO SIN CORRECCIONES

            /*
             *
             *  HashMap<Integer> personas = new HashMap<>;
             *  String n1 = “Albus”;
             *  String n2 = “Severus”;
             *  personas.add(n1);
             *  personas.add(n2);
             * 
             */
            
        // CODIGO CON CORRECCIONES 

            //  1) En este caso agregamos el tipo de 'valor' del 'HashMap' y ademas añadimos
            //     los parentesis en el lado derecho de la ecuacion.
            HashMap<Integer , String> personas = new HashMap<>();

            //  2) Tenemos dos variables de tipo String , pero el HashMap almacena 2 datos
            //     ellos son las 'llaves' y los 'valores'. Vamos a considerar a los Strings
            //     como los 'valores' y vamos a asignarles dos llaves de tipo 'Integer'
            String n1 = "Albus";
            String n2 = "Severus";

            //  3) Para añadir un elemento a un HashMap se utiliza el metodo '.put' no el '.add'
            //     y le pasamos el valor de la 'llave' y el del 'valor'
            personas.put(1,n1);
            personas.put(2,n2);

            //  Como extra imprimimos los valores que contiene el 'HashMap' para visualizar por consola
            //  sus valores.

            System.out.println(personas);

    }
}
