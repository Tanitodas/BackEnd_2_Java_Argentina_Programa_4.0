// Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
// programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
// después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
// salir, se mostrará todos los perros guardados en el ArrayList.

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Raza;
import Servicio.RazasService;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner entrada = new Scanner(System.in);
        RazasService servicio = new RazasService();

        System.out.println("¿Desea crear una lista de Razas? S/N");
        String opcion = entrada.nextLine();

        if (opcion.equalsIgnoreCase("S")) {

            ArrayList<Raza> listaDeRazas = new ArrayList<>();
            String op;

            do {
                
                Raza nuevaRaza = servicio.creacionDeNuevaRazas();
                
                servicio.rellenarArrayList(listaDeRazas, nuevaRaza);

                System.out.println("¿Desea seguir creando razas? S/N ");
                op = entrada.nextLine();

            } while ( op.equalsIgnoreCase("S") );

            System.out.println("--------------------------");

            servicio.mostrarLista( listaDeRazas );

        } else {

            System.out.println("Que lastima que no pueda ayudarte :c");

        }

        entrada.close();

    }

}
