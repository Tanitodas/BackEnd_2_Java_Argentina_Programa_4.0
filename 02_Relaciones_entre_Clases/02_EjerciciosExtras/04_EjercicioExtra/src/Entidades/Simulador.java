package Entidades;

// • La clase Simulador debe tener un método que genere un listado de alumnos manera
// aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
// manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.

// • Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
// rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
// debe retornar la lista de dnis.

// • Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
// objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
// listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
// mismo nombre.

// • Se debe imprimir por pantalla el listado de alumnos.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Simulador {
    
    //  ATRIBUTOS   

        private HashMap<Long , Alumno> listaAlumnos = new HashMap<>();
        private Random aleatorio = new Random();
        private Scanner entrada = new Scanner(System.in);
        
    // MÉTODOS PERSONALIZADOS

        public HashMap< Long , Alumno> crearListaAlumnos() {
            
            String[] nombres = { "Noelia", "Ezequiel", "Luciano", "Lautaro", "Natalia" };
            String[] apellidos = {" Beron " , "Arce" , "Ahumada" , "Cadenas" , "DeArmas"};

            String op;

            do {
                
                Alumno alumno = new Alumno();

                for (int i = 0; i < nombres.length; i++) {
    
                    int indice = aleatorio.nextInt( nombres.length - 1 );
                    alumno.setNombre( nombres[indice] );
    
                }
    
                for (int i = 0; i < apellidos.length; i++) {
    
                    int indice = aleatorio.nextInt( apellidos.length );
                    alumno.setApellido( apellidos[indice] );
    
                }

                alumno.setDni( creadorAleatorioDNIs() );
                
                listaAlumnos.put( alumno.getDni() , alumno );

                System.out.println("¿Desea agregar otra ALUMNO? S/N");
                op = entrada.nextLine();
        
                if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {
        
                    do {
        
                        System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                        op = entrada.nextLine();
        
                    } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));
        
                }

            } while ( op.equalsIgnoreCase("S") );

            return listaAlumnos;

        }

        private Long creadorAleatorioDNIs() {

            long randomNum = (long)( Math.random() * 999999999 + 10000000 );
            
            return randomNum;

        }

        // public void name( String[] nombres , Long randomNum ) {
            
        //     HashMap< Long , String[] > listaAlumnos = new HashMap<>();


        //     listaAlumnos.put(randomNum, nombres);

        // }

        public void impresionLista() {
            
            for ( Map.Entry<Long,Alumno> entry : listaAlumnos.entrySet() ) {
                
                System.out.println("Documento : " + entry.getKey() );
                System.out.println("Alumno :" + entry.getValue() );

            }

        }

}
