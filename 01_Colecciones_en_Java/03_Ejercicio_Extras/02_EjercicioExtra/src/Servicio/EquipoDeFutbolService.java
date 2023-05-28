package Servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import Entidades.ClassEquiposDeFutbol;

// En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen.
//
// Para ello deberán crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado.
// 
// La clase debe tener los siguientes atributos: 
//      _ Nombre del equipo 
//      _ Ciudad 
//      _ Cantidad de partidos jugados, ganados, perdidos y empatados, y puntos totales.
//
// En el programa principal, crear una lista de tipo "EquipoDe…" y agregar 10 objetos de tipo equipo a la lista. 
// Luego, mostrar por pantalla de forma ordenada según cantidad de puntos, los nombres de cada equipo, su cantidad de puntos,
// partidos jugados, ganados, perdidos y empatados.
//
// Una vez finalizado el torneo, determinar el equipo ganador, eliminar al último equipo de la tabla por haber descendido,
// sumar al nuevo equipo que ascendió de la división inferior, reiniciar los valores de partidos y puntos a 0 para
// el inicio del siguiente campeonato y mostrar la lista en orden alfabético de los equipos.

public class EquipoDeFutbolService {
    
    //  ATRIBUTOS

        private Scanner entrada = new Scanner(System.in);
        private HashMap<Integer, ClassEquiposDeFutbol> listaDeEquipos = new HashMap<>();
        private int contadorDeEquipos = 0;
        private Random aleatorio = new Random();

    //  MÉTODOS PERSONALIZADOS

        public void crearEquipo() {
            
            String op;

            do {

                ClassEquiposDeFutbol equipo = new ClassEquiposDeFutbol();
                    
                System.out.println("Ingrese el NOMBRE del equipo");
                equipo.setNombreEquipo( entrada.nextLine() );
                    
                System.out.println("Ingrese la CIUDAD del equipo");
                equipo.setCiudad( entrada.nextLine() );

                System.out.println("Ingrese la cantidad de partidos JUGADOS en todo el torneo");
                equipo.setCantJugados( entrada.nextInt() );

                System.out.println("Cargamos aleatoriamente los valores de los partidos ganados y perdidos");
                System.out.println("en funcion de estos dos valores obtenemos el valor de los partidos empatados");

                //  Limpiamos el buffer del enter
                entrada.nextLine();

                //  Asignamos un valor aleatorio a la cantidad de partidos ganados. Y validamos que el valor aleatorio
                //  no sea mayor a la cantidad total de partidos jugados.

                int valorAleatorio = 0;

                do {
                    
                    valorAleatorio = aleatorio.nextInt( equipo.getCantJugados() );

                    if ( valorAleatorio < equipo.getCantJugados() ) {
                
                        equipo.setCantGanados( valorAleatorio );

                    }

                } while ( valorAleatorio > equipo.getCantJugados() );

                //  Asignamos un valor aleatorio a la cantidad de partidos perdidos. Y validamos que el valor aleatorio
                //  no sea mayor a la resta entre la cantidad de partidos jugados y partidos ganados.

                do {
                    
                    valorAleatorio = aleatorio.nextInt( equipo.getCantJugados() - equipo.getCantGanados() );

                    if ( valorAleatorio <= ( equipo.getCantJugados() - equipo.getCantGanados() ) && valorAleatorio >= 0 ) {
                
                        equipo.setCantPerdidos(valorAleatorio);

                    }

                } while ( valorAleatorio > ( equipo.getCantJugados() - equipo.getCantGanados() ) );

                //  Asignamos la cantidad de partidos restantes a la cantidad de partidos empatados
                equipo.setCantEmpatados( equipo.getCantJugados() - ( equipo.getCantGanados() + equipo.getCantPerdidos() ) );

                //  Asignamos los puntos correspondietes a cada equipo segun la cantidad de partidos ganados y empatados
                asignacionDePuntos( equipo );

                // Añadimos al HashMap el equipo nuevo y asignamos un contador, el cual es la llave.
                listaDeEquipos.put( contadorDeEquipos , equipo );

                contadorDeEquipos++;

                System.out.println("¿ Desea agregar otro EQUIPO ? S/N");
                op = entrada.nextLine();
                
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {

                    do {
                        
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();

                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

                }
                
            } while ( op.equalsIgnoreCase("S") ); 

        }

        public void asignacionDePuntos( ClassEquiposDeFutbol equipo ) {
            
            equipo.setPuntosTotales( (equipo.getCantGanados()*3) + (equipo.getCantEmpatados()*1)  );

        }

        public void ordenarEquiposXNombre() {

            //  Creamos un 'ArrayList' de tipo 'ClassEquiposDeFutbol' con los valores del 'HashMap' a traves del
            //  metodo '.values()'. Esto lo hacemos para poder ordenar esta lista a traves del metodo
            //  '.sort' y con la utilizacion de un 'Comparator' que nos compare el nombre de cada equipo
            ArrayList<ClassEquiposDeFutbol> listaDeEquiposAL = new ArrayList<>( listaDeEquipos.values() );

            //  Ordenamos alfabeticamente el 'ArrayList'
            listaDeEquiposAL.sort(compararNombre);
    
            System.out.println("========== TABLA DE EQUIPOS ORDENADOS X NOMBRE ==========");
            for (ClassEquiposDeFutbol aux : listaDeEquiposAL) {
                
                System.out.println("");
                System.out.println(aux.toString());
                System.out.println("");

            }
            System.out.println("==============================");
    
        }

        public void ordenarEquiposXPuntos() {

            //  Creamos un 'ArrayList' de tipo 'ClassEquiposDeFutbol' con los valores del 'HashMap' a traves del
            //  metodo '.values()'. Esto lo hacemos para poder ordenar esta lista a traves del metodo
            //  '.sort' y con la utilizacion de un 'Comparator' que nos compare la cantidad de puntos obtenidos
            //  de cada equipo de futbol
            ArrayList<ClassEquiposDeFutbol> listaDeEquiposAL = new ArrayList<>( listaDeEquipos.values() );

            //  Ordenamos por puntos el 'ArrayList'
            listaDeEquiposAL.sort(compararPuntos);
    
            System.out.println("========== TABLA DE EQUIPOS ORDENADOS X PUNTOS TOTALES ==========");
            for (ClassEquiposDeFutbol aux : listaDeEquiposAL) {
                
                System.out.println("");
                System.out.println(aux.toString());
                System.out.println("");

            }
            System.out.println("==============================");
    
        }

        public void ordenarEquiposXCantPartidosJugados() {

            ArrayList<ClassEquiposDeFutbol> listaDeEquiposAL = new ArrayList<>( listaDeEquipos.values() );

            listaDeEquiposAL.sort(compararPartidosJugados);
    
            System.out.println("========== TABLA DE EQUIPOS ORDENADOS X PARTIDOS JUGADOS ==========");
            for (ClassEquiposDeFutbol aux : listaDeEquiposAL) {
                
                System.out.println("");
                System.out.println(aux.toString());
                System.out.println("");

            }
            System.out.println("==============================");
    
        }

        public void ordenarEquiposXCantPartidosGanados() {

            ArrayList<ClassEquiposDeFutbol> listaDeEquiposAL = new ArrayList<>( listaDeEquipos.values() );

            listaDeEquiposAL.sort( compararPartidoGanados );
    
            System.out.println("========== TABLA DE EQUIPOS ORDENADOS X PARTIDOS GANADOS ==========");
            for (ClassEquiposDeFutbol aux : listaDeEquiposAL) {
                
                System.out.println("");
                System.out.println(aux.toString());
                System.out.println("");

            }
            System.out.println("==============================");
    
        }

        public void ordenarEquiposXCantPartidosEmpatados() {

            ArrayList<ClassEquiposDeFutbol> listaDeEquiposAL = new ArrayList<>( listaDeEquipos.values() );

            listaDeEquiposAL.sort( compararPartidosEmpatados );
    
            System.out.println("========== TABLA DE EQUIPOS ORDENADOS X PARTIDOS EMPATADOS ==========");
            for (ClassEquiposDeFutbol aux : listaDeEquiposAL) {
                
                System.out.println("");
                System.out.println(aux.toString());
                System.out.println("");

            }
            System.out.println("==============================");
    
        }

        public void ordenarEquiposXCantPartidosPerdidos() {

            ArrayList<ClassEquiposDeFutbol> listaDeEquiposAL = new ArrayList<>( listaDeEquipos.values() );

            listaDeEquiposAL.sort( compararPartidosPerdidos );
    
            System.out.println("========== TABLA DE EQUIPOS ORDENADOS X PARTIDOS PERDIDOS ==========");
            for (ClassEquiposDeFutbol aux : listaDeEquiposAL) {
                
                System.out.println("");
                System.out.println(aux.toString());
                System.out.println("");

            }
            System.out.println("==============================");
    
        }

        //  Comparator para ordenar los equipos por orden alfabetico
        public static Comparator<ClassEquiposDeFutbol> compararNombre = new Comparator<ClassEquiposDeFutbol>() {
            
            @Override 
            public int compare( ClassEquiposDeFutbol equipo1, ClassEquiposDeFutbol equipo2 ){
    
                return equipo1.getNombreEquipo().compareTo( equipo2.getNombreEquipo() );
    
            }

        };

        //  Comparator para comparar los puntos totales de cada equipo
        public static Comparator<ClassEquiposDeFutbol> compararPuntos = new Comparator<ClassEquiposDeFutbol>() {
            
            @Override
            public int compare( ClassEquiposDeFutbol equipo1, ClassEquiposDeFutbol equipo2 ){

                return Integer.compare(equipo1.getPuntosTotales(), equipo2.getPuntosTotales() );

            }

        };

        //  Comparator para comparar la cantidad de partidos GANADOS de cada equipo
        public static Comparator<ClassEquiposDeFutbol> compararPartidoGanados = new Comparator<ClassEquiposDeFutbol>() {
            
            @Override
            public int compare( ClassEquiposDeFutbol equipo1, ClassEquiposDeFutbol equipo2 ){

                return Integer.compare(equipo1.getCantGanados(), equipo2.getCantGanados() );

            }

        };

        //  Comparator para comparar la cantidad de partidos EMPATADOS de cada equipo
        public static Comparator<ClassEquiposDeFutbol> compararPartidosEmpatados = new Comparator<ClassEquiposDeFutbol>() {
            
            @Override
            public int compare( ClassEquiposDeFutbol equipo1, ClassEquiposDeFutbol equipo2 ){

                return Integer.compare(equipo1.getCantEmpatados(), equipo2.getCantEmpatados() );

            }

        };

        //  Comparator para comparar la cantidad de partidos PERDIDOS de cada equipo
        public static Comparator<ClassEquiposDeFutbol> compararPartidosPerdidos = new Comparator<ClassEquiposDeFutbol>() {
            
            @Override
            public int compare( ClassEquiposDeFutbol equipo1, ClassEquiposDeFutbol equipo2 ){

                return Integer.compare(equipo1.getCantPerdidos(), equipo2.getCantPerdidos() );

            }

        };

        //  Comparator para comparar la cantidad de partidos JUGADOS de cada equipo
        public static Comparator<ClassEquiposDeFutbol> compararPartidosJugados = new Comparator<ClassEquiposDeFutbol>() {
            
            @Override
            public int compare( ClassEquiposDeFutbol equipo1, ClassEquiposDeFutbol equipo2 ){

                return Integer.compare(equipo1.getCantJugados(), equipo2.getCantJugados() );

            }

        };

}
