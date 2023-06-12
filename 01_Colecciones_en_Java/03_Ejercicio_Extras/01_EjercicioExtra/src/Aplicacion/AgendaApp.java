package Aplicacion;

import java.util.Scanner;

import Servicio.AgendaServicio;

// Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
// La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos
// los contactos y mostrar los contactos ordenados alfabéticamente por nombre.
// En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono).
// Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre,
// mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.

public class AgendaApp {
    public static void main(String[] args) throws Exception {
        
        AgendaServicio servicio = new AgendaServicio();
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Menú ====");
            System.out.println("1. AGREGAR contacto");
            System.out.println("2. BUSCAR contacto por nombre");
            System.out.println("3. MOSTRAR todos los contactos");
            System.out.println("4. ORDENAR y MOSTRAR todos los contactos alfabeticamente");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    servicio.agregarContacto();;
                    break;

                case 2:
                    
                    servicio.buscarContactoXNombre();
                    break;

                case 3:
                    
                    servicio.mostrarTodosLosContactos();
                    break;

                case 4:
                
                    servicio.ordenarContactosXNombre();
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
