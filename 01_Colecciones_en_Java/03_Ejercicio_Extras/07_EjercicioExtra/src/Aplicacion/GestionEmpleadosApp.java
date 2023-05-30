package Aplicacion;

import java.util.Scanner;

import Servicio.GestionEmpleadosService;

// Sistema de gestión de empleados

// Crea un sistema de gestión de empleados en Java. Este sistema debe ser capaz de agregar, eliminar,
// buscar y actualizar empleados. Cada empleado debe tener un nombre, una edad, un número de identificación único
// y una fecha de contratación.

// Crea las siguientes clases de entidad:

// Empleado: que debe contener los atributos mencionados anteriormente.
// Crea las siguientes clases de servicios:

// ServicioEmpleado: que debe contener los métodos para agregar, eliminar, buscar y actualizar empleados.
// Utiliza la colección ArrayList para almacenar los empleados.

public class GestionEmpleadosApp {
    public static void main(String[] args) throws Exception {
        
        GestionEmpleadosService servicio = new GestionEmpleadosService();
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Menú ====");
            System.out.println("1. Agregar EMPLEADO");
            System.out.println("2. Eliminar EMPLEADO");
            System.out.println("3. Modificar EMPLEADO");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    servicio.agregarEmpleado();
                    break;

                case 2:
                    
                    servicio.eliminarEmpleado();
                    break;

                case 3:
                    
                    servicio.modificarEmpleado();
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

