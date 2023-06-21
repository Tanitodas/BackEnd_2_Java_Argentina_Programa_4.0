package Aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Electrodomestico;

// Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
// para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
// Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
// deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
// televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
// precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
// 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
// electrodomésticos, 2000 para lavadora y 5000 para televisor.

import Entidades.Lavadora;
import Entidades.Televisor;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Electrodomestico> listaDeElectrodomesticos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("==== MENÚ ====");
            System.out.println("1. Crear Televisor");
            System.out.println("2. Crear Lavadora )");
            System.out.println("3. Mostrar el precio de toda la lista de precios )");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("");
                    System.out.println("=== Creando Televisor === ");
                    
                    Televisor televisor = new Televisor();

                    televisor.crearTelevisor();

                    listaDeElectrodomesticos.add(televisor);

                    break;

                case 2:

                    System.out.println("");
                    System.out.println("=== Creando Lavadora === ");
                    
                    Lavadora lavadora = new Lavadora();

                    lavadora.crearLavadora();

                    listaDeElectrodomesticos.add(lavadora);

                    break;

                case 3:

                    double sumaDePrecios = 0;
                    int contador = 0;

                    System.out.println("");

                    for ( Electrodomestico aux : listaDeElectrodomesticos ) {
                        
                        System.out.println("El precio del electrodomestico n° " + contador + " es igual a: " + aux.getPrecio() );
                        contador++;

                        sumaDePrecios = sumaDePrecios + aux.getPrecio();

                    }

                    System.out.println( "La suma del valor de todos los electrodomesticos es : " + sumaDePrecios );

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
