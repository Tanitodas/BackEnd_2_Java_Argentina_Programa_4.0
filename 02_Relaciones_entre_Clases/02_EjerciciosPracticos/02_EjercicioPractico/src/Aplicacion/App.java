import java.util.Scanner;

// Realizar el juego de la ruleta rusa de agua en Java. 
//
// Como muchos saben, el juego se trata de un número de jugadores, que, con un revolver de agua,
// el cual posee una sola carga de agua, se dispara y se moja.
//
// Las clases por hacer del juego son las siguientes:
//
//      1_ Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//         del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//         tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
//         
//         Métodos:
//         _ llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//           deben ser aleatorios.
//         _ mojar(): devuelve true si la posición del agua coincide con la posición actual
//         _ siguienteChorro(): cambia a la siguiente posición del tambor
//         _ toString(): muestra información del revolver (posición actual y donde está el agua)
//
//      2_ Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//         jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//         si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//         debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//
//         Métodos:
//         _ disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//           mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//           revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//           devuelve true, sino false.
//
//      3_ Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//         Revolver.
//
//         Métodos:
//         _ llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//           y el revolver para guardarlos en los atributos del juego.
//
//         _ ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//           aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//           moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//           mojar. Al final del juego, se debe mostrar que jugador se mojó.
//           Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

import Entidades.Juego;

public class App {
    public static void main(String[] args) throws Exception {
        
        Juego juego = new Juego();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("==== Menú Juego de Ruleta Rusa ====");
            System.out.println("1. Cargar Jugadores y revolver");
            System.out.println("2. Jugar");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    juego.llenarJuego();
                    break;

                case 2:
                    
                    juego.ronda();
                    break;

                case 0:

                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            scanner.nextLine(); //  Limpiamos el buffer

            System.out.println(); // Agregar una línea en blanco para mayor legibilidad

        } while (opcion != 0);

        scanner.close();

    }
}
