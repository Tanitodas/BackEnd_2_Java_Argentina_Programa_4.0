package Servicios;

public class ServicioEstudiante extends ServicioPersona {

    //  MÉTODOS PERSONALIZADOS

        protected String establecerAsignatura() {

            System.out.println("");
            System.out.println("================================");
            System.out.println("Ingrese el curso del alumno ( 1c1 , 2c1 , 3c1 )");
            String asignatura = entrada.nextLine();
            System.out.println("================================");
            System.out.println("");

            return asignatura;

        }

}
