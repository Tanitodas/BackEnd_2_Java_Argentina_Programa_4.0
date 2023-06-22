//  Corrige el siguiente código:

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class App {
   
    public static void main(String[] args) throws Exception {
        
        // CODIGO SIN CORRECCIONES

            //  Array<int> listado = new ArrayList;
            
            //  TreeSet<String> = TreeSet();
            
            //  HashMap<Integer> personas = new HashMap<>;

        // CODIGO CON CORRECCIONES 

            // 1) En este caso agregamos la palabra "List" luego del Array (leyendo desde izq a der)
            //    ademas de añadir los parentesis en "ArrayList" en el segundo miembro de la ecuacion
            //    para designar la utilizacion del constructor vacio de la clase 'ArrayList'
            ArrayList<Integer> listado = new ArrayList<>();

            // 2) Aqui añadimos el nombre identificatorio de la coleccion, el cual lo designamos por "nombreDeColeccion"
            //    ademas añadimos la palabra "new" en el segundo miembro de la ecuacion
            TreeSet<String> nombreDeColeccion = new TreeSet<>();
            
            // 3) En este caso solamente reemplazamos los simbolos "<>" por "()" para designar el constructor vacio
            //    de la clase 'HashMap' y añadimos el tipo de dato de la 'Valor' (tipo 'String')
            HashMap<Integer,String> personas = new HashMap<>();

    }
}
