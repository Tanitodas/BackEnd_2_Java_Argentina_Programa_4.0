package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Estudiante;
import Entidades.PersonalServicio;
import Entidades.Profesor;

public final class ServiciosMenu {

    //  ATRIBUTOS DE LA CLASE SERVICIO DE MENÚ

        //  Lista de los objetos de profesortes , estudiantes y personal.
        public static ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();
        private static ArrayList<Profesor> listaDeProfesores = new ArrayList<>();
        private static ArrayList<PersonalServicio> listaDePersonal = new ArrayList<>();
        
        //  Creamos los objetos del tipo de servicio para utilizar los metodos de cada servicio
        private ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
        private ServicioProfesor servicioProfesor = new ServicioProfesor();
        private ServicioPersonalServicio servicioPersonalServicio = new ServicioPersonalServicio();

        // Scanner para leer las opciones
        private static Scanner entrada = new Scanner(System.in);

        private int opcion = 5; 
    
        public void menuCreacionListas() {
            
            while (opcion != 0) {

                System.out.println("******MENU PRINCIPAL******");
                System.out.println("1. Crear un Profesor ");
                System.out.println("2. Crear un Empleado de Servicio ");
                System.out.println("3. Crear un Estudiante ");
                System.out.println("4. Modificar datos existentes");
                System.out.println("0. Salir");
                System.out.print("Ingrese una opción: ");
                opcion = entrada.nextInt();
                    
                switch (opcion) {

                    case 1:

                        Profesor profe = new Profesor();

                        System.out.println("Ingrese el NOMBRE/S del profesor:");
                        profe.setNombres( servicioProfesor.asignarNombre() );

                        System.out.println("Ingrese el APELLIDO/S del profesor:");
                        profe.setApellidos(servicioProfesor.asignarApellido());

                        System.out.println("Ingrese el DNI del profesor:");
                        profe.setNumDNI( servicioProfesor.numeroDNI() );

                        System.out.println("Ingrese el ESTADO CIVIL del profesor:");
                        profe.setEstadoCivil( servicioProfesor.estadoCivil() );

                        System.out.println("Ingrese la FECHA DE INCORPORACION del profesor:");
                        profe.setAñoIncorporacion( servicioProfesor.fechaDeAlta() );

                        System.out.println("Ingrese el numero de DESPACHO al que pertenece el docente");
                        profe.setNumeroDespachoAsignado( servicioProfesor.asignacionDespacho() );

                        System.out.println("Ingrese el DEPARTAMENTO al que pertenece el profesor");
                        profe.setDepartamento( servicioProfesor.asignarDepartamento() );

                        listaDeProfesores.add(profe);

                        break;

                    case 2:

                        PersonalServicio pServicio = new PersonalServicio();

                        System.out.println("Ingrese el NOMBRE/S del empleado de servicio:");
                        pServicio.setNombres( servicioPersonalServicio.asignarNombre() );

                        System.out.println("Ingrese el APELLIDO/S del empleado de servicio:");
                        pServicio.setApellidos( servicioPersonalServicio.asignarApellido() );

                        System.out.println("Ingrese el DNI del empleado de servicio:");
                        pServicio.setNumDNI( servicioPersonalServicio.numeroDNI() ) ;

                        System.out.println("Ingrese el ESTADO CIVIL del empleado de servicio:");
                        pServicio.setEstadoCivil( servicioPersonalServicio.estadoCivil() );

                        System.out.println("Ingrese la FECHA DE INCORPORACION del empleado de servicio:");
                        pServicio.setAñoIncorporacion( servicioPersonalServicio.fechaDeAlta() );

                        System.out.println("Ingrese el numero de DESPACHO al que pertenece el empleado de servicio");
                        pServicio.setNumeroDespachoAsignado( servicioPersonalServicio.asignacionDespacho() );

                        System.out.println("Ingrese la SECCION al que pertenece el empleado de servicio");
                        pServicio.setSeccion( servicioPersonalServicio.asignarSeccion() );

                        listaDePersonal.add(pServicio);
                        
                        break;

                    case 3:

                        Estudiante estudiante = new Estudiante();

                        System.out.println("Ingrese el NOMBRE/S del alumno:");
                        estudiante.setNombres( servicioEstudiante.asignarNombre() );

                        System.out.println("Ingrese el APELLIDO/S del alumno:");
                        estudiante.setApellidos( servicioEstudiante.asignarApellido() );

                        System.out.println("Ingrese el DNI del alumno:");
                        estudiante.setNumDNI( servicioEstudiante.numeroDNI() );
                    
                        System.out.println("Ingrese el ESTADO CIVIL del alumno:");
                        estudiante.setEstadoCivil( servicioEstudiante.estadoCivil() );
                    
                        System.out.println("Ingrese la ASIGNATURA a la que asiste el alumno");
                        estudiante.setAsignatura( servicioEstudiante.establecerAsignatura() );

                        listaDeEstudiantes.add(estudiante);
                        
                        break;

                    case 4:

                        int op;

                        do {

                            System.out.println("¿De que lista quiere modificar los datos?");
                            System.out.println("1. Lista de Profesores");
                            System.out.println("2. Lista de Estudiantes");
                            System.out.println("3. Lista de Empleados de Servicio");
                            System.out.println("0. Salir");
                            op = entrada.nextInt();

                            entrada.nextLine(); // Limpiamos el buffer del enter

                            switch (op) {
                                case 1:
                                    
                                    modificarListas(listaDeProfesores , op);
                                    break;

                                case 2:

                                    modificarListas(listaDeEstudiantes , op);
                                    break;

                                case 3: 

                                    modificarListas(listaDePersonal , op);
                                    break;
                            
                                default:
                                    System.out.println("Ingreso una opcion no valida");
                                    break;
                            }
                            
                        } while (op != 0);

                        entrada.nextLine(); // Limpiamos el buffer del enter

                    default:

                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                        break;

                }
                
                System.out.println(); // Línea en blanco

            } // FIN del while

            entrada.close();

        }   

        public void modificarListas( List<?> lista , int indice) {

            switch ( indice ) {

                case 1:

                    int contador = 0;
                    
                    System.out.println("====Modificacion de la lista de [ PROFESORES ] ====");
                    System.out.println("");

                    do {
                        
                        System.out.println("Ingrese el DNI del al que le quiere modificar los datos");
                        long DNImodif = entrada.nextLong();

                        for (int i = 0; i < lista.size() ; i++) {
                        
                        if ( listaDeProfesores.get(i).getNumDNI() == DNImodif ) {
                            
                            contador++;

                            System.out.println("¿Que datos quiere modificar del profesor? [" + listaDeProfesores.get(i).getNombres() + "]");
                            System.out.println("1 - Nombre");
                            System.out.println("2 - Apellido");
                            System.out.println("3 - DNI");
                            System.out.println("4 - Estado Civil");
                            System.out.println("5 - Fecha Incorporacion");
                            System.out.println("6 - Despacho");
                            System.out.println("7 - Departamento");
                            int atributoModificar = entrada.nextInt();

                            

                        }

                    }

                    if (contador == 0 ) {
                        
                        System.out.println("No se encontraron coincidencias en la lista");

                    }


                    } while (contador == 0);

                    
                    break;
            
                default:
                    break;
            }
            
            

        }

}