package Servicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import Entidades.Persona;

// Desarrolla una función que reciba como parámetro un ArrayList de objetos "Persona" y devuelva un HashSet
// con los nombres de las personas. A continuación, implementa otra función que tome este HashSet como entrada y
// retorne un TreeSet ordenado de los nombres. Además, crea las entidades y servicios necesarios.

public class PersonaService {
    
    //  ATRIBUTOS 

        private Scanner entrada = new Scanner(System.in);

    //  MÉTODOS PERSONALIZADOS

        // Creamos un metodo para crear objetos de tipo 'Persona' y los almacenamos en el ArrayList.
        public ArrayList<Persona> crearArrayList() {
            
            String op;
            ArrayList<Persona> listaDePersonas = new ArrayList<>();
        
            do {
        
                Persona persona = new Persona();
                        
                System.out.println("Ingrese el NOMBRE de la persona");
                persona.setNombre( entrada.nextLine() );
                        
                System.out.println("Ingrese la EDAD de la persona");
                persona.setEdad( entrada.nextInt() );

                System.out.println("Ingrese el DOCUMENTO de la persona");
                persona.setDni( entrada.nextLong() );
        
                // Añadimos al ArrayList la persona.
                listaDePersonas.add( persona );
        
                System.out.println("¿Desea agregar otro PERSONA? S/N");
                op = entrada.nextLine();
                    
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {
        
                    do {
                            
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();
        
                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));
        
                }
                    
            } while ( op.equalsIgnoreCase("S") ); 

            return listaDePersonas;

        }

        public HashSet<String> TransformacionHashSet( ArrayList<Persona> listaPersonas ) {
            
            HashSet<String> listaDeNombres = new HashSet<>();

            for ( Persona aux : listaPersonas ) {
                
                listaDeNombres.add( aux.getNombre() );

            }

            return listaDeNombres;
        
        }

        public TreeSet<String> transformacionTreeSet( HashSet<String> listaDeNombres ) {
            
            TreeSet<String> nombresOrdenados = new TreeSet<>();

            for (String aux : listaDeNombres) {
                
                nombresOrdenados.add( aux );

            }
            
            return nombresOrdenados;
            
        }

}
