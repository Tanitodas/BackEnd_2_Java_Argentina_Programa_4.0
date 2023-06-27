package Servicios;

import java.util.Scanner;

public class ServicioPersonalServicio extends ServicioEmpleado {
    
    //  ATRIBUTO

        protected Scanner entrada = new Scanner(System.in);

    //  MÉTODOS PERSONALES

        protected String asignarSeccion() {
            
            System.out.println("");
            System.out.println("================================");
            System.out.println("Ingrese la Seccion del empleado ( Biblioteca , Aulas , Oficinas )");
            String seccion = entrada.nextLine();
            System.out.println("================================");
            System.out.println("");

            return seccion;

        }

}
