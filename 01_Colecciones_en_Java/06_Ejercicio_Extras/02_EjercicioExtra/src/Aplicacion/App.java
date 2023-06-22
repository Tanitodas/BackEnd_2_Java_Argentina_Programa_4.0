package Aplicacion;

import java.util.Scanner;

import Servicio.EquipoDeFutbolService;

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

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        EquipoDeFutbolService servicio = new EquipoDeFutbolService();

        int opcion;

        do {

            System.out.println("==== Menú ====");
            System.out.println("1. AGREGAR equipo a la lista del torneo");
            System.out.println("2. ORDENAR y MOSTRAR equipos por CANTIDAD DE PUNTOS TOTALES");
            System.out.println("3. ORDENAR y MOSTRAR equipos los equipos alfabeticamente");
            System.out.println("4. ORDENAR y MOSTRAR equipos por CANTIDAD DE PARTIDOS GANADOS");
            System.out.println("5. ORDENAR y MOSTRAR equipos por CANTIDAD DE PARTIDOS EMPATADOS");
            System.out.println("6. ORDENAR y MOSTRAR equipos por CANTIDAD DE PARTIDOS PERDIDOS");
            System.out.println("7. ORDENAR y MOSTRAR equipos por CANTIDAD DE PARTIDOS JUGADOS");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    
                    servicio.crearEquipo();
                    break;

                case 2:
                    
                    servicio.ordenarEquiposXPuntos();
                    break;

                case 3:
                    
                    servicio.ordenarEquiposXNombre();
                    break;

                case 4:
                
                    servicio.ordenarEquiposXCantPartidosGanados();
                    break;

                case 5:
                
                    servicio.ordenarEquiposXCantPartidosEmpatados();
                    break;

                case 6:
                
                    servicio.ordenarEquiposXCantPartidosPerdidos();
                    break;

                case 7:
                
                    servicio.ordenarEquiposXCantPartidosJugados();
                    break;

                case 0:

                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            entrada.nextLine(); //  Limpiamos el buffer

            System.out.println(); // Agregar una línea en blanco para mayor legibilidad

        } while (opcion != 0);

        entrada.close();

    }
    
}
