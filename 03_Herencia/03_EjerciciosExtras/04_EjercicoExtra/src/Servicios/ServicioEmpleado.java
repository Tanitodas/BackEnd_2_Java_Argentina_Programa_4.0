package Servicios;

import java.util.Calendar;

public class ServicioEmpleado extends ServicioPersona {

    //  MÉTODOS PERSONALIZADOS

        public Calendar fechaDeAlta() {

            Calendar fechaAlta = Calendar.getInstance();
            
            System.out.println("");
            System.out.println("================================");
            System.out.println("Ingrese el dia del alta (DD)");
            int dia = entrada.nextInt();
            System.out.println("Ingrese el mes del alta (M)(0 = Enero;...;11 = Diciembre)");
            int mes = entrada.nextInt();
            System.out.println("Ingrese el año del alta (YYYY)");
            int anio = entrada.nextInt();
            System.out.println("================================");
            System.out.println("");

            entrada.nextLine(); // Limpiamos el buffer del enter

            fechaAlta.set(Calendar.DAY_OF_MONTH, dia); // Establece el día del mes
            fechaAlta.set(Calendar.MONTH, mes); // Establece el mes (0 = enero)
            fechaAlta.set(Calendar.YEAR, anio); // Establece el año

            return fechaAlta;

        }

        public int asignacionDespacho() {

            System.out.println("");
            System.out.println("================================");
            System.out.println("Ingrese el numero de despacho del empleado");
            int numDespacho = entrada.nextInt();
            System.out.println("================================");
            System.out.println("");

            entrada.nextLine(); // Limpiamos el buffer del enter

            return numDespacho;

        }

}
