package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

public class Baraja {
    
    //  ATRIBUTOS

        private ArrayList<Carta> baraja = new ArrayList<>();
        private ArrayList<Carta> monton = new ArrayList<>();
        private Scanner entrada = new Scanner(System.in);

    //  CONSTRUCCTOR

        public Baraja() {
        }

        public Baraja( ArrayList<Carta> baraja ) {
            this.baraja = baraja;
        }

    //  GETTERS y SETTERS
        
        public ArrayList<Carta> getBaraja() {
            return baraja;
        }

        public void setBaraja( ArrayList<Carta> baraja ) {
            this.baraja = baraja;
        }

    //  MÉTODOS PERSONALIZADOS

        public void rellenamosLaBaraja() {
            
            for (int i = 0; i < 40; i++) {

                baraja.add( new Carta() );
 
            }

            impresionDeBaraja();

        }

        public void barajar() {
            
            //  Reordena aleatoriamente los objetos dentro de la lista.
            Collections.shuffle(baraja);

            impresionDeBaraja();

        }

        public void siguienteCarta( ) {

            for (Carta aux : baraja) {
                
                if ( baraja.isEmpty() ) {

                    System.out.println("No hay mas cartas.");
    
                } else { 

                    System.out.println("Su carta nueva es: " + aux.toString() );
                    
                    monton.add(aux);
                    baraja.remove(aux);
                    break;
                    
                }

            }

        }

        public int cartasDisponibles() {
        
            return baraja.size();

        }

//       darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//       cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//       debemos indicárselo al usuario.
//
        public void darCartas() {
            
            System.out.println("Ingrese el numero de cartas que quiere");
            int cantidadDeCartas = entrada.nextInt();

            if ( baraja.size() >= cantidadDeCartas ) {
                
                for (int i = 0; i < cantidadDeCartas ; i++) {
                
                    for (Carta auxCarta : baraja) {
                        
                        System.out.println(" Su carta nueva es: " + auxCarta.toString() );
                        baraja.remove(auxCarta);
                        monton.add(auxCarta);
                        break;
    
                    }
    
                }
    
            } else {

                System.out.println("No daremos cartas por que no hay suficientes en la baraja");
                System.out.println(" Ingrese un numero de cartas menor a " + baraja.size() );

            }
            
        }

//        cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//        indicárselo al usuario.

        public void cartasMonton() {
            
            if ( monton.isEmpty() ) {
                
                System.out.println("No ha salido ninguna carta");

            } else {

                System.out.println("Las cartas que han salido son: ");

                for ( Carta aux : monton ) {
                    
                    System.out.println( aux.toString() );

                }

            }

        }

        public void impresionDeBaraja() {

            System.out.println("======================================");
            System.out.println("La baraja tiene las siguientes cartas");
            System.out.println("");
            
            for (int i = 0; i < baraja.size(); i++) {
                
                System.out.println("Posicion " + i + " : " + baraja.get(i).toString() );

            }

            System.out.println("======================================");

        }

}
