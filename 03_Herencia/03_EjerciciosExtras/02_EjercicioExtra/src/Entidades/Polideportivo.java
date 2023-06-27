package Entidades;

import java.util.Scanner;

public class Polideportivo extends Edificio {

    //  ATRIBUTOS

        private Scanner entrada = new Scanner(System.in);
        private String nombre;
        private Boolean techado;

    // CONSTRUCTORES

        public Polideportivo(String nombre, Boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
        }

        public Polideportivo() {
        }

    //  MÉTODOS PERSONALIZADOS  

        @Override
        public void calcularSuperficie() {
           
            System.out.println("Ingrese el ancho del edificio");
            this.ancho = entrada.nextInt();

            System.out.println("Ingrese el largo del edificio");
            this.largo = entrada.nextInt();

            System.out.println("La superficie del edificio será: " + this.ancho * this.largo + " mts2 ");

        }

        @Override
        public void calcularVolumen() {
            
            System.out.println("Ingrese el alto del edificio");
            this.alto = entrada.nextInt();

            System.out.println("El volumen del edificio será: " + this.ancho * this.largo * this.alto + " mts3 ");
            
        }

        public void techado() {
            
            System.out.println("El polideportivo es techado? S/N");
            String opcion = entrada.next();

            if (opcion.equalsIgnoreCase("S")) {
                
                this.techado = true;
                System.out.println("El polideportivo es techado");

            } else {

                this.techado = false;
                System.out.println("El polideportivo es descubierto");
            }


        }

        @Override
        public String toString() {
            return "Polideportivo [entrada=" + entrada + ", nombre=" + nombre + ", techado=" + techado + "]";
        }

        
    
}
