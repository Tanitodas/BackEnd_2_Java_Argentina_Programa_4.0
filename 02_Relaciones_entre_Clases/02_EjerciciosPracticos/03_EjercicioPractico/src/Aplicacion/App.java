package Aplicacion;

import java.util.Scanner;
import Entidades.Baraja;

// Realizar una baraja de cartas españolas orientada a objetos. 
//
// Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 
// Esta clase debe contener un método toString() que retorne el número de carta y el palo. 
//
// La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
// 
// Las operaciones que podrá realizar la baraja son:
//
//      _ barajar(): cambia de posición todas las cartas aleatoriamente.
//
//      _ siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//        se haya llegado al final, se indica al usuario que no hay más cartas.
//
//      _ cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//      
//      _ darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//        cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//        debemos indicárselo al usuario.
//
//      _ cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//        indicárselo al usuario.
//
//      _ mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//        luego se llama al método, este no mostrara esa primera carta.

public class App {
    public static void main(String[] args) throws Exception {
        
        Baraja baraja = new Baraja();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("==== Menú de Baraja ====");
            System.out.println("1. Carga de Cartas en la Baraja");
            System.out.println("2. Barajar ( Mecla la baraja de manera aleatorio )");
            System.out.println("3. Mostrar cartas disponibles para repartir");
            System.out.println("4. Repartir cartas");
            System.out.println("5. Cartas Monton");
            System.out.println("6. Mostrar Baraja");
            System.out.println("7. Siguiente Carta");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    baraja.rellenamosLaBaraja();;
                    break;

                case 2:
                    
                    baraja.barajar();
                    break;

                case 3:
                    
                    System.out.println( "La cantidad de cartas disponibles es : " + baraja.cartasDisponibles() );
                    break;

                case 4:
                    
                    baraja.darCartas();
                    break;

                case 5:
                    
                    baraja.cartasMonton();
                    break;

                case 6:
                    
                    baraja.impresionDeBaraja();
                    break;

                case 7:
                    
                    baraja.siguienteCarta();
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

