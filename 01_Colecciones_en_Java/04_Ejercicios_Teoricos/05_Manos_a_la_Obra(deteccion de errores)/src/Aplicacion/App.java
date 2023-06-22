// Corregir el siguiente codigo 

import java.util.ArrayList;
import java.util.Iterator;

public class App {
  
    public static void main(String[] args) throws Exception {
        
        // CODIGO SIN CORREGIR
        
            //  ArrayList<String> = new ArrayList()

            //  bebidas.put(“café);

            //  bebidas.add(“té”);
        
            //  Iterator<String> it =bebidas.iterator();
        
            //  whale (it.next()){
            //     if (it.next().equals(“café”)){
            //     it.remove();
            //  }

        // CODIGO CORREGIDO

            /*
             *  1) Añadimos nombre a la declaracion de esta coleccion que es "palabra".
             *     Luego añadimos el diamante en el segundo miembro de la ecuacion.
             *     Ademas agregamos el punto y coma al final de toda la linea de codigo.
             */
            
            ArrayList<String> bebidas = new ArrayList<>();

            /*
             *  2) El metodo correcto para agregar un elemento a una coleccion es el
             *     metodo ".add" y añadimos tmb unas comillas dobles al final de la 
             *     palabra
             */

            bebidas.add("café");

            bebidas.add("té");

            /*
             *  3) importamos la clase iterator, en este caso no tenemos que corregir nada mas
             */
    
            Iterator<String> it = bebidas.iterator();

            /*
             * 
             *  4) Corregimos la palabra "whale" por "while" y en la parte de la condicion
             *     colocamos el metodo "hasNext()" enves de "next()" para validar si la coleccion tiene un
             *     elemento la coleccion o no.
             * 
             */
    
            while (it.hasNext()){
                if ( it.next().equals("café") ){
                it.remove();
                }
            }
            
    }

}
