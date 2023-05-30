package Servicio;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import Entidades.Empleado;

// Sistema de gestión de empleados

// Crea un sistema de gestión de empleados en Java. Este sistema debe ser capaz de agregar, eliminar,
// buscar y actualizar empleados. Cada empleado debe tener un nombre, una edad, un número de identificación único
// y una fecha de contratación.

// Crea las siguientes clases de entidad:

// Empleado: que debe contener los atributos mencionados anteriormente.
// Crea las siguientes clases de servicios:

// ServicioEmpleado: que debe contener los métodos para agregar, eliminar, buscar y actualizar empleados.
// Utiliza la colección ArrayList para almacenar los empleados.

public class GestionEmpleadosService {
    
    //  ATRIBUTOS   

        private Scanner entrada = new Scanner(System.in);
        // Colocamos el listado de empleados en un TreeSet para que sea una coleccion ordenada
        // y ademas para que no haya objetos del tipo 'Empleado' repetidos.
        private TreeSet<Empleado> listaDeEmpleados = new TreeSet<>(); 

    //  MÉTODOS PERSONALIZADOS

        public void agregarEmpleado() {
            
            String op;

            do {

                Empleado empleado = new Empleado();
                    
                System.out.println("Ingrese el NOMBRE del empleado");
                empleado.setNombre( entrada.nextLine() );

                System.out.println("Ingrese la EDAD del empleado");
                empleado.setEdad( entrada.nextInt() );

                System.out.println("Ingrese el NUMERO DE IDENTIFICACION del empleado");
                empleado.setNumeroIdentificacion( entrada.nextInt() );

                System.out.println("Ingrese la FECHA DE CONTRATACION del empleado (Tenga en cuenta el formato 'DD/MM/AAAA' )");
                System.out.println("1. Ingrese el DIA (DD) :");
                int dia = entrada.nextInt();

                System.out.println("2. Ingrese el MES(MM) :");
                int mes = entrada.nextInt();

                System.out.println("3. Ingrese el AÑO (AAAA) :");
                int año = entrada.nextInt();

                // Instanciamos un objeto de tipo 'GregorianCalendar' con la fecha de contratacion del empleado
                Calendar fechaContratacion = new GregorianCalendar(dia, mes, año);

                entrada.nextLine(); // Limpiamos Buffer

                // Seteamos la fecha que ingreso el usuario a la fecha de contratacion del EMPLEADO
                empleado.setFechaContratacion( fechaContratacion ); 

                // Añadimos al TreeSet al nuevo EMPLEADO.
                listaDeEmpleados.add( empleado );

                System.out.println("¿Desea agregar otra TAREA? S/N");
                op = entrada.nextLine();
                
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {

                    do {
                        
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();

                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

                }
                
            } while ( op.equalsIgnoreCase("S") ); 

        }

        public void eliminarEmpleado() {
            
            int contadorEncontradas = 0;
            System.out.println("Ingrese el NUMERO DE IDENTIFICACION del empleado que desea eliminar");
            int empleadoEliminar = entrada.nextInt();
    
            // Creamos el 'iterator'
            Iterator<Empleado> it = listaDeEmpleados.iterator();
    
            while (it.hasNext()) {
    
                if ( empleadoEliminar == ( it.next().getNumeroIdentificacion() ) ) {
    
                    it.remove();
                    contadorEncontradas++;
    
                }
    
            }

            if ( contadorEncontradas == 0 ) {
                
                System.out.println("NO se encontraron COINCIDENCIAS");

            }

        }

        private Empleado buscarPorNumeroDeIdentificacion() {
            
            Empleado empleadoBuscado = new Empleado();
            int contadorEncontradas = 0;
            System.out.println("Ingrese el NUMERO DE IDENTIFICACION del empleado que desea buscar:");
            int identificacionBuscar = entrada.nextInt();

            for (Empleado aux : listaDeEmpleados ) {

                if ( aux.getNumeroIdentificacion() == identificacionBuscar ) {

                    System.out.println("==============================");
                    System.out.println("El EMPLEADO buscado es igual a: ");
                    System.out.println( aux.toString() );
                    System.out.println("==============================");
                    empleadoBuscado = aux;
                    contadorEncontradas++;

                }

            }

            if ( contadorEncontradas == 0 ) {
                
                System.out.println("No se han encontrado coincidencias");

            }

            return empleadoBuscado;

        }

        public void modificarEmpleado() {
            
            // Primero buscamos el empleado con el metodo 'buscarPorNumeroDeIdentificacion'
            Empleado empleado = buscarPorNumeroDeIdentificacion();

            int op;

            do {
                
                System.out.println("¿Que atributo del empleado desea modificar?" );
                System.out.println( " 1. Nombre");
                System.out.println( " 2. Edad");
                System.out.println( " 3. Numero de Identificacion");
                System.out.println( " 4. Fecha de Contratacion");
                System.out.println("0. SALIR");
                op = entrada.nextInt();

                switch (op) {

                    case 1:
                        
                        System.out.println("El NOMBRE actual del empleado es: {" + empleado.getNombre() + "}" );
                        System.out.println("=====================================================");
                        System.out.println("Ingrese el nuevo nombre del empleado");
                        String nombreNuevo = entrada.nextLine();
                        System.out.println("=====================================================");
                        empleado.setNombre(nombreNuevo);
                        System.out.println("El nombre del empleado luego del cambio es: {" + empleado.getNombre() + "}" );
                        break;
                
                    case 2:
                        
                        System.out.println("La EDAD actual del empleado es: {" + empleado.getEdad() + "}" );
                        System.out.println("=====================================================");
                        System.out.println("Ingrese la edad nueva del empleado");
                        int edadNuevo = entrada.nextInt();
                        System.out.println("=====================================================");
                        empleado.setEdad(edadNuevo);
                        System.out.println("La EDAD del empleado luego del cambio es: {" + empleado.getEdad() + "}" );
                        break;
    
                    case 3:
                        
                        System.out.println("El NUMERO DE IDENTIFICACION actual del empleado es: {" + empleado.getNumeroIdentificacion() + "}" );
                        System.out.println("=====================================================");
                        System.out.println("Ingrese el nuevo Numero De Identificacion del empleado");
                        int identificacionNuevo = entrada.nextInt();
                        System.out.println("=====================================================");
                        empleado.setNumeroIdentificacion(identificacionNuevo);
                        System.out.println("El nombre del empleado luego del cambio es: {" + empleado.getNumeroIdentificacion() + "}" );
                        break;
    
                    case 4:
                        
                        System.out.println("La FECHA DE CONTRATACION actual del empleado es: {" + empleado.getFechaContratacion() + "}" );
                        System.out.println("=====================================================");
                        System.out.println("Ingrese la nueva Fecha de Contratacion del empleado");
                        System.out.println("1. Ingrese el DIA (DD) :");
                        int dia = entrada.nextInt();
                        System.out.println("2. Ingrese el MES(MM) :");
                        int mes = entrada.nextInt();
                        System.out.println("3. Ingrese el AÑO (AAAA) :");
                        int año = entrada.nextInt();
                        System.out.println("=====================================================");
                        Calendar fechaContratacionNueva = new GregorianCalendar(dia, mes, año);
                        empleado.setFechaContratacion(fechaContratacionNueva);
    
                        System.out.println("La NUEVA fecha de contratacion luego del cambio es: {" + empleado.getFechaContratacion() + "}" );
                        break;
                
                    case 0:

                        System.out.println("SALIENDO DEL PROGRAMA...");
                        break;
                    
                    default:
    
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                
                }

                entrada.nextLine(); //  Limpiamos el buffer

                System.out.println(); // Agregar una línea en blanco para mayor legibilidad

            } while ( op != 0);

        }

}
