package Aplicacion;

import Entidades.InterfaceDePrueba;

public class App {

    public static void main(String[] args) throws Exception {
    
        InterfaceDePrueba a = new InterfaceDePrueba() {
            
            @Override
            public void mostrarPorPantalla() {
        
            System.out.println("asd");
        
            }

        };

        a.mostrarPorPantalla();

    }

}
