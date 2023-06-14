package Entidades;

public class Lavadora extends Electrodomestico {
    
    //  ATRIBUTO

        private Double carga;

    //  CONSTRUCCTORES

        public Lavadora() {
           
        }

        public Lavadora(Double precio, String color, char consumoEnergetico, Double peso, Double carga) {
            super(precio, color, consumoEnergetico, peso);
            this.carga = carga;
        }

    //  GETTERS y SETTERS
        
        public Double getCarga() {
            return carga;
        }

        public void setCarga(Double carga) {
            this.carga = carga;
        }

    //  METODOS PERSONALIZADOS

        public void crearLavadora() {
            
            crearElectrodomestico();

            System.out.println("¿Cuanta carga admite la lavadora?");
            this.carga = entrada.nextDouble();

            if ( carga >= 30 ) {

                super.precio = precioFinal() + 500;

            } else {

                super.precio = precioFinal();

            }

        }

}
