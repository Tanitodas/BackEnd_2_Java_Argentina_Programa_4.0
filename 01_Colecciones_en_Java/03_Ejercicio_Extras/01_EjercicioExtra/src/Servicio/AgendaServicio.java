package Servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Entidades.Contacto;

// Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono.
//
// La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos
// los contactos y mostrar los contactos ordenados alfabéticamente por nombre.
//
// En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono).
// Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre,
// mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.

public class AgendaServicio {
    
    //  ATRIBUTOS

        private Scanner entrada = new Scanner(System.in);
        private HashMap<Integer,Contacto> agendaTelefonica = new HashMap<>();
        private int numeroDeContacto = 0;
        
    //  MÉTODOS PERSONALIZADOS

        public void agregarContacto() {
                
            String op;

            do {

                Contacto contacto = new Contacto();
                    
                System.out.println("Ingrese el NOMBRE del contacto");
                contacto.setNombre( entrada.nextLine() );
                    
                System.out.println("Ingrese el TELEFONO del contacto");
                contacto.setNumeroDeTelefono( entrada.nextInt() );

                // Añadimos al HashMap el contacto nuevo y asignamos un numero de lista, el cual es la llave
                agendaTelefonica.put( numeroDeContacto , contacto );

                numeroDeContacto++;

                //  Limpiamos el buffer del enter
                entrada.nextLine();

                System.out.println("¿ Desea agregar otro Contacto ? S/N");
                op = entrada.nextLine();
                
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {

                    do {
                        
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();

                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

                }
                
            } while ( op.equalsIgnoreCase("S") ); 

        }

        public void buscarContactoXNombre() {

            int contadorEncontradas = 0;
            System.out.println("Ingrese el NOMBRE que quiere buscar en la agenda:");
            String nombreBuscar = entrada.nextLine();
    
            for ( Contacto aux : agendaTelefonica.values() ) {
    
                if ( aux.getNombre().equalsIgnoreCase(nombreBuscar) ) {
    
                    System.out.println("==============================");
                    System.out.println("El CONTACTO buscado es : ");
                    System.out.println( aux.toString() );
                    System.out.println("==============================");
                    contadorEncontradas++;
    
                }
    
            }
    
            if ( contadorEncontradas == 0 ) {
                
                System.out.println("No se han encontrado coincidencias");
    
            }
    
        }

        public void ordenarContactosXNombre() {

            //  Creamos un 'ArrayList' de tipo 'Contacto' con los valores del 'HashMap' a traves del
            //  metodo '.values()'. Esto lo hacemos para poder ordenar esta lista a traves del metodo
            //  '.sort' y con la utilizacion de un 'Comparator' que nos compare el nombre de cada contacto
            ArrayList<Contacto> listaDeContactos = new ArrayList<>( agendaTelefonica.values() );

            //  Ordenamos alfabeticamente el 'ArrayList'
            listaDeContactos.sort(compararNombre);
    
            System.out.println("========== LISTA DE CONTACTOS ORDENADOS X NOMBRE ==========");
    
            for ( Contacto aux : listaDeContactos ) {
    
                System.out.println("");
                System.out.println(aux.toString());
                System.out.println("");
    
            }
    
            System.out.println("==============================");
    
        }

        public static Comparator<Contacto> compararNombre = new Comparator<Contacto>() {
            
            @Override 
            public int compare(Contacto contacto1,Contacto contacto2){
    
                return contacto1.getNombre().compareTo(contacto2.getNombre());
    
            }

        };

        public void mostrarTodosLosContactos() {

            System.out.println("========== LISTA PEDIDOS ==========");
    
            for ( Map.Entry<Integer,Contacto> aux : agendaTelefonica.entrySet() ) {
    
                System.out.println("");
                System.out.println( aux.toString() );
                System.out.println("");
    
            }
    
            System.out.println("==============================");
    
        }



}
