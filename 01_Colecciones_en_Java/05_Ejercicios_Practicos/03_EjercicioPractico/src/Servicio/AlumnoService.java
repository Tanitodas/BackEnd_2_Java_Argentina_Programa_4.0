package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Alumno;

// Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
// alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
// con sus 3 notas.
//
// En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
//
// Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
// pregunta al usuario si quiere crear otro Alumno o no.
//
// Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//
// 1.  Método notaFinal() : 
//
//     El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos.
//     Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio 
//     final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.

public class AlumnoService {
    
    //  ATRIBUTOS

        private Scanner entrada = new Scanner(System.in);
        private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    //  MÉTODOS PERSONALIZADOS

        public void crearAlumno() {
            
            String opcion;

            do {
                
                Alumno alumno = new Alumno();

                System.out.println("Ingrese el 'nombre' del alumno");
                alumno.setNombre( entrada.nextLine() );

                System.out.println("Ingrese las notas del alumno");
                
                ArrayList<Integer> notas = new ArrayList<>();

                for (int i = 0; i < 3; i++) {
                
                    System.out.println("Ingrese la nota n° " + ( i + 1 ) );

                    notas.add( entrada.nextInt() );

                }

                entrada.nextLine(); // Limpiamos el buffer para leer textos.
                
                alumno.setNotas(notas);

                // Asignacion del alumno al la 'Lista' de alumnos
                listaAlumnos.add(alumno);

                System.out.println("¿Desea ingresar otro alumno? S/N");
                opcion = entrada.nextLine();

                //  Validacion para que se ingrese una opcion valida 

                if (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {

                    do {
    
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        opcion = entrada.nextLine();
    
                    } while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));
    
                }

            } while ( opcion.equalsIgnoreCase("S") );

        }

        public void notaFinal() {

            double notaPromedio = 0.0;
            
            System.out.println("Ingrese el nombre del Alumno que quiere saber su nota final");
            String nombre = entrada.nextLine();

            for (Alumno aux : listaAlumnos) {
                
                if ( aux.getNombre().equalsIgnoreCase(nombre) ) {
                    
                    notaPromedio = (double) ( aux.getNotas().get(0) + aux.getNotas().get(1) + aux.getNotas().get(2) ) / aux.getNotas().size() ;

                }

            }

            System.out.println("La nota final del alumno es : {" + notaPromedio + "}");

        }


}
