package Entidades;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//  Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//  Revolver
// 
//  Métodos:
//
//      _ llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//        y el revolver para guardarlos en los atributos del juego.10
//
//      _ ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//        aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//        moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//        mojar. Al final del juego, se debe mostrar que jugador se mojó.
//
// Nota: Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

public class Juego {

    // ATRIBUTOS

    private Scanner entrada = new Scanner(System.in);
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Revolver r;
    private int contJugadores = 0;

    // CONSTRUCTORES

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    // MÉTODOS PERSONALIZADOS

    public void llenarJuego() {

        // Realizamos la carga de los jugadores en el juego.

        String op = null;

        do {

            System.out.println("Solo se puede cargar un maximo de 6 jugadores");

            Jugador jugador = new Jugador();

            System.out.println("Ingrese el ID del jugador");
            jugador.setId(entrada.nextInt());

            entrada.nextLine(); // Limpiamos Buffer
    
            System.out.println("Ingrese el NOMBRE del jugador");
            jugador.setNombre(entrada.nextLine());
    
            // El atributo 'mojado' del jugador lo dejamos como esta cargado por defecto
            // que es 'false'. Luego durante el juego realizamos la re asignacion y lo
            // tomamos como condicion de parada del juego.

            contJugadores++;
    
            // Añadimos al 'ArrayList' al nuevo JUGADOR.
            jugadores.add(jugador);
    
            System.out.println("¿Desea agregar otra JUGADOR? S/N");
            op = entrada.nextLine();
    
            if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {
    
                do {
    
                    System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                    op = entrada.nextLine();
    
                } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));
    
            }

            if ( contJugadores == 6) {
                
                System.out.println("Se llego a la maxima cantidad de jugadores posibles");
                break;

            }

        } while (op.equalsIgnoreCase("S") || contJugadores == 6 );

        // Realizamos la carga del revolver en el juego

        r = new Revolver(); // Instanciamos el objeto.

        r.llenarRevolver(); // Asignamos valores a sus atributos.

        impresioDeArrayList();

    }

    public void ronda() {

        String op;
        Jugador jugadorInicial = new Jugador();

        System.out.println("");
        System.out.println("====== Inicia la RULETA RUSA DEL AGUA!! ====== ");
        System.out.println("");

        // Bloque para elegir el jugador inicial de la ronda

            System.out.println("¿Por cual jugador desea iniciar el juego? Elegir/Aleatorio ");
            op = entrada.nextLine();

            // Bloque de validacion para que se ingresen solamente "Elegir" o "Aleatorio"
            if (!op.equalsIgnoreCase("elegir") && !op.equalsIgnoreCase("aleatorio")) {

                do {

                    System.out.println("Ingresó una opcion no valida. Intentelo nuevamente");
                    op = entrada.nextLine();

                } while (!op.equalsIgnoreCase("elegir") && !op.equalsIgnoreCase("aleatorio"));

            }

            if (op.equalsIgnoreCase("elegir")) {

                int contEncontrado = 0;

                do {

                    System.out.println("Ingrese el NOMBRE del jugador que desee que empieze el juego");
                    String nombreBucar =  entrada.nextLine() ;

                    // Bloque de validacion de la existencia del jugador en la lista de jugadores
                    for (Jugador aux : jugadores) {

                        if (aux.getNombre().equalsIgnoreCase( nombreBucar )) {

                            System.out.println("");
                            System.out.println("El jugador SI está participando del juego.");
                            System.out.println("");
                            System.out.println("Por ende el jugador de nombre : " + aux.getNombre()
                            + " va a ser el primero en gatillar. SUERTE!");
                            System.out.println("");
                            jugadorInicial = aux;
                            contEncontrado++;

                        }

                    }

                    if (contEncontrado == 0) {

                        System.out.println("El nombre ingresado no se encuentra en la lista de jugadores");
                        System.out.println("Intentelo nuevamente");

                    }
                    // Terminamos el bloque de validacion de existencia del jugador en la lista

                } while ( contEncontrado == 0 );
                

            } else if (op.equalsIgnoreCase("aleatorio")) {

                // En esta parte del codigo tomamos un indice aleatorio del ArrayList y
                // asignamos como 'jugadorInicial'
                // al objeto que se encuentre en esa posicion.

                Random al = new Random();
                int valorAleatorio = al.nextInt(jugadores.size());

                for (int i = 0; i <= jugadores.size() ; i++) {

                    if (valorAleatorio == i ) {

                        jugadorInicial = jugadores.get(i);
                        System.out.println("El jugador de nombre : " + jugadorInicial.getNombre() + " va a ser el primero en gatillar. SUERTE!");
                        break;

                    }

                }

            }

        // Finalizacion del bloque de eleccion del jugador inicial

        //  Empieza la ronda de juego por el 'jugadorInicial'
        int indicePerdedor = 0;
        int jugoElPrimerJugar = 0;

        do {
            
            for (Jugador aux : jugadores) {

                if ( aux.getNombre().equalsIgnoreCase(jugadorInicial.getNombre()) && aux.getId() == jugadorInicial.getId() && jugoElPrimerJugar == 0 ) {
    
                    System.out.println("============================");
                    System.out.println("El jugador " + aux.getNombre() + " va a disparar!");
                    aux.disparo(r);
                    jugoElPrimerJugar = 1;
    
                    if ( aux.getMojado() ) {
                        
                        System.out.println("");
                        System.out.println( aux.getNombre() + " SE ha mojado!");
                        System.out.println("Se terminó el juego! :C ");
                        System.out.println("============================");
                        indicePerdedor = jugadores.indexOf(aux);
                        break;
    
                    } else {
    
                        System.out.println("");
                        System.out.println( aux.getNombre() + " NO se ha mojado!");
                        System.out.println("El juego continua!! :)");
                        System.out.println("============================");
                        
                    } 
     
                } else if ( jugoElPrimerJugar == 1 ) {
    
                    System.out.println("============================");
                    System.out.println("El jugador " + aux.getNombre() + " va a disparar!");
                    aux.disparo(r);
    
                    if ( aux.getMojado() ) {
                        
                        System.out.println("");
                        System.out.println( aux.getNombre() + " SE ha mojado!");
                        System.out.println("Se terminó el juego! :C ");
                        System.out.println("============================");
                        indicePerdedor = jugadores.indexOf(aux);
                        break;
    
                    } else {
    
                        System.out.println("");
                        System.out.println( aux.getNombre() + " NO se ha mojado!");;
                        System.out.println("El juego continua!! :)");
                        System.out.println("============================");
                        
                    } 
    
                }
    
            }

        } while ( !jugadores.get(indicePerdedor).getMojado() );

        //  Mostramos todos los jugadores y el estado del atributo 'mojado'
        System.out.println(" ==== LISTA DE JUGADORES Y ESTADO DE ATRIBUTO 'MOJADO' ==== ");

        for (Jugador aux : jugadores) {
            
            System.out.println(" Jugador : {" + aux.getNombre() + "} ; Mojado : {" + aux.getMojado() + "}");

        }

        System.out.println("===========================================================");

    }

    public void impresioDeArrayList() {
        
        System.out.println("La lista de jugadores es: ");

        for (Jugador aux : jugadores) {
            
            System.out.println(aux);

        }

    }

}
