package Entidades;

import java.util.Scanner;

public class Oficina extends Edificio {

    //  ATRIBUTOS   

        private Scanner entrada = new Scanner(System.in);
        protected Integer numeroDeOficina;
        protected Integer personasPorOficina;
        protected Integer cantidadDePisos;

    //  CONSTRUCTORES

        public Oficina(Integer numeroDeOficina, Integer personasPorOficina, Integer cantidadDePisos) {
            this.numeroDeOficina = numeroDeOficina;
            this.personasPorOficina = personasPorOficina;
            this.cantidadDePisos = cantidadDePisos;
        }

        public Oficina() {
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

        public void cantidadDePersonas() {
            
            System.out.println("Ingrese la cantidad de Oficinas por Piso");
            this.numeroDeOficina = entrada.nextInt();

            System.out.println("Ingrese la cantidad de Personas por Oficina");
            this.personasPorOficina = entrada.nextInt();

            System.out.println("Ingrese la cantidad de Pisos del Edificio");
            this.cantidadDePisos = entrada.nextInt();

            System.out.println(" La cantidad de personas por edificio es:  " + this.numeroDeOficina * this.cantidadDePisos * this.personasPorOficina + " Personas ");

        }
    
}
