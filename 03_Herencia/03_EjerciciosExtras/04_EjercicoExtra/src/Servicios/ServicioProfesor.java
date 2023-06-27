package Servicios;

import java.util.Scanner;

public class ServicioProfesor extends ServicioEmpleado {
    
    //  ATRIBUTO

        protected Scanner entrada = new Scanner(System.in);

    //  MÉTODOS PERSONALES

        protected String asignarDepartamento() {
            
            System.out.println("");
            System.out.println("================================");
            System.out.println("Ingrese el departamento al que pertenece el profesor ( Cs.Basicas , Ing.Civil , Ing.Sistemas , Ing.Quimica )");
            String departamento = entrada.nextLine();
            System.out.println("================================");
            System.out.println("");

            return departamento;

        }

}   
