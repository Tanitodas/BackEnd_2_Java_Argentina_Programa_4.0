package Entidades;

import java.util.Random;

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

public class Carta {
    
    //  ATRIBUTOS

        private String paloCarta;
        private int numeroCarta;
        private int[] numerosPosibles = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 10 , 11 , 12 };
        private String[] palosPosibles = { "Espada" , "Basto" , "Oro" , "Copa" } ;
        private Random aleatorio = new Random();

    //  CONSTRUCTOR 

        public Carta( ) {
            this.paloCarta = palosPosibles[ aleatorio.nextInt(palosPosibles.length) ];
            this.numeroCarta = numerosPosibles[ aleatorio.nextInt( numerosPosibles.length ) ];
        }

    //  GETTERS y SETTERS 

        public Integer getNumeroCarta() {
            return numeroCarta;
        }

        public void setNumero(Integer numero) {
            this.numeroCarta = numero;
        }

        public String getPaloCarta() {
            return paloCarta;
        }

        public void setPaloCarta(String palo) {
            this.paloCarta = palo;
        }

    //  MÉTODO toString

    @Override
    public String toString() {
        return "Carta [ numero = " + numeroCarta + ", palo = " + paloCarta + " ] ";
    }
        
}
