package Servicios;

import java.util.Scanner;

public class ServicioPersona {

    protected Scanner entrada = new Scanner(System.in);
    
    protected String asignarNombre(){

        System.out.println("");
        System.out.println("================================");
        System.out.println("ingrese el nombre o nombres");
        String nombre = entrada.nextLine();
        System.out.println("================================");
        System.out.println("");

        return nombre;
        
    }

    protected String asignarApellido(){

        System.out.println("");
        System.out.println("================================");
        System.out.println("ingrese el apellido o apellidos");
        String apellido = entrada.nextLine();
        System.out.println("================================");
        System.out.println("");

        return apellido;

    }

    protected long numeroDNI(){

        System.out.println("");
        System.out.println("================================");
        System.out.println("ingrese el DNI");
        long DNI = entrada.nextLong();
        entrada.nextLine(); // Limpiamos el buffer del enter
        System.out.println("================================");
        System.out.println("");

        return DNI;

    }

    protected String estadoCivil(){

        System.out.println("");
        System.out.println("================================");
        System.out.println("ingrese el estado civil actual");
        String estadoCivil = entrada.nextLine();
        System.out.println("================================");
        System.out.println("");

        return estadoCivil;

    }

}
