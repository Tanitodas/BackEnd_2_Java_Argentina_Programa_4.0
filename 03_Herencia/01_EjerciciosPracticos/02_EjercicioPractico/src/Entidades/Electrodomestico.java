package Entidades;

import java.util.Scanner;

public class Electrodomestico {
    
    //  ATRIBUTO

        protected Scanner entrada = new Scanner(System.in);
        protected Double precio;
        protected String color;
        protected char consumoEnergetico;
        protected Double peso = 1000.0;

    // CONSTRUCTORES

        public Electrodomestico() {
        }

        public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
            this.precio = precio;
            this.color = color;
            this.consumoEnergetico = consumoEnergetico;
            this.peso = peso;
        }

    //  GETTERS y SETTERS

        public Double getPrecio() {
            return precio;
        }

        public void setPrecio(Double precio) {
            this.precio = precio;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public char getConsumoEnergetico() {
            return consumoEnergetico;
        }

        public void setConsumoEnergetico(char consumoEnergetico) {
            this.consumoEnergetico = consumoEnergetico;
        }

        public Double getPeso() {
            return peso;
        }

        public void setPeso(Double peso) {
            this.peso = peso;
        }

    //  MÉTODOS PERSONALIZADOS

        public void comprobarConsumoEnergetico( char consumoEnergetico ) {
            
            consumoEnergetico = Character.toUpperCase( consumoEnergetico );

            switch ( consumoEnergetico ) {
                
                case 'A':
                    
                    this.consumoEnergetico = 'A';
                    break;

                case 'B':
                    
                    this.consumoEnergetico = 'B';
                    break;

                case 'C':
                    
                    this.consumoEnergetico = 'C';
                    break;

                case 'D':
                    
                    this.consumoEnergetico = 'D';
                    break;

                case 'E':
                    
                    this.consumoEnergetico = 'E';
                    break;

                case 'F':
                    
                    this.consumoEnergetico = 'F';
                    break;
            
                default:

                    this.consumoEnergetico = 'F';
                    break;

            }

        }

        public void comprobarColor( String color ) {
            
            switch ( color ) {
                
                case "blanco":
                    
                    this.color = "blanco";
                    break;

                case "negro" :
                    
                    this.color = "negro";
                    break;

                case "rojo":
                    
                    this.color = "rojo";
                    break;

                case "azul":
                    
                    this.color = "azul";
                    break;

                case "gris":
                    
                    this.color = "gris";
                    break;

                default:

                    this.color = "blanco";
                    break;

            }

        }

        public void crearElectrodomestico() {
            
            System.out.println("Ingrese el color:");
            String color = entrada.nextLine();

            comprobarColor(color);

            System.out.println("Ingrese el consumo energetico:");
            char consumoEnergetico = entrada.next().charAt(0);

            comprobarConsumoEnergetico(consumoEnergetico);

        }

        public Double precioFinal() {
            
            consumoEnergetico = Character.toUpperCase( consumoEnergetico );

            switch ( this.consumoEnergetico ) {
                
                case 'A':
                    
                    this.precio = this.precio + 1000;
                    break;

                case 'B':
                    
                    this.precio = this.precio + 800;
                    break;

                case 'C':
                    
                    this.precio = this.precio + 600;
                    break;

                case 'D':
                    
                    this.precio = this.precio + 500;
                    break;

                case 'E':
                    
                    this.precio = this.precio + 300;
                    break;

                case 'F':
                    
                    this.precio = this.precio + 100;
                    break;

            }

            if (this.peso >= 1 && this.peso <= 19) {

                this.precio = this.precio + 100;

            } else if (this.peso >= 20 && this.peso <= 49) {

                this.precio = this.precio + 500;

            } else if (this.peso >= 50 && this.peso <= 79) {

                this.precio = this.precio + 800;

            } else if (this.peso >= 80) {

                this.precio = this.precio + 1000;

            }

            return this.precio;
            
        }

        
        

}
