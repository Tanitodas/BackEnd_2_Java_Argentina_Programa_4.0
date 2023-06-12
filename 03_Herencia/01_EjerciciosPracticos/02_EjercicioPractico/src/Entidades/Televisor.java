package Entidades;

public class Televisor extends Electrodomestico {
    
    //  ATRIBUTOS

        private Boolean TDT;
        private Double tamañoPantalla;
    
    //  CONSTRUCTORES

        public Televisor() {
        }

        public Televisor(Double precio, String color, char consumoEnergetico, Double peso, Boolean tDT,
                Double tamañoPantalla) {
            super(precio, color, consumoEnergetico, peso);
            TDT = tDT;
            this.tamañoPantalla = tamañoPantalla;
        }

    //  GETTERS y SETTERS

        public Boolean getTDT() {
            return TDT;
        }

        public void setTDT(Boolean tDT) {
            TDT = tDT;
        }

        public Double getTamañoPantalla() {
            return tamañoPantalla;
        }

        public void setTamañoPantalla(Double tamañoPantalla) {
            this.tamañoPantalla = tamañoPantalla;
        }

    // METODOS PERSONALIZADOS

        public void crearTelevisor() {
                
            crearElectrodomestico();

            String op;

            System.out.println("¿Tamaño de pantalla?(ingreselo en pulgadas)");
            this.tamañoPantalla = entrada.nextDouble();

            entrada.nextLine(); // Limpiamos el buffer

            System.out.println("¿Su televisor tiene TDT? S/N ");
            op = entrada.nextLine();
            
            if(op.equalsIgnoreCase("S")){

                this.TDT = true;

            } else {

                this.TDT = false;

            }

            if ( this.tamañoPantalla >= 40 ) {

                super.precio = precioFinal() + ( precioFinal()*0.3 );

            } else if (this.TDT) {

                super.precio = precioFinal() + 500.0 ;

            }

        }
        
}
