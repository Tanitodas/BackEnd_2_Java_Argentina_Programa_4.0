package Servicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import Entidades.Pedido;

// Crear la clase "Pedido" con los siguientes atributos:  número de orden, descripción y fecha de creación. 
// Agregar constructor vacío, con parámetros, getters, setters y demás necesario.
// Dentro del servicio vamos a crear un método para la creación del objeto Pedido, solicitando los datos al usuario.
// Dichos objetos creados, los vamos a guardar dentro de una lista de Pedidos.

// Luego debemos:
// - Buscar un pedido según el número de orden y mostrarlo.
// - Buscar un pedido según una fecha ingresada por el usuario y mostrarlo. En el caso de que no existan 
//   pedidos con esa fecha, debe informar al usuario.
// - Mostrar todos los pedidos
// - Ordenar los pedidos por fecha de creación y mostrarlos
// - Remover los 3 primeros pedidos de la lista

// Utilizar un switch para que el usuario elija la opción que desea:
// 1)Agregar Pedido
// 2)Buscar un Pedido por número de orden
// 3)Buscar un Pedido por fecha de creación
// 4)Mostrar todos los pedidos
// 5)Ordenar y mostrar los pedidos según fecha de creación
// 6)Remover un Pedido de la lista

public class PedidoService {

    // ATRIBUTOS

    private Scanner entrada = new Scanner(System.in);
    private LinkedHashSet<Pedido> listaPedidos = new LinkedHashSet<>();
    private int contadorPedidos = 0;

    // MÉTODOS PERSONALIZADOS

    public void creacionDePedido() {
            
        String op;

        do {

            Pedido pedidoI = new Pedido();
                
            System.out.println("Ingrese la descripcion del pedido");
            pedidoI.setDescripcion( entrada.nextLine() );
                
            //  Cargamos en el numero de orden el valor del contador de pedidos actual.
            //  Es decir, cada vez que creemos un pedido el contador va a aumentar en 1.
            pedidoI.setNumeroOrden( contadorPedidos );

            // Seteamos la fecha actual del sistema a la fecha de creacion del pedido

            //  Nota: Utilizamos la clase Abstracta 'Calendar' y la instanciaremos con el metodo '.getInstance()' que
            //        nos crea un objeto de tipo 'GregorianCalendar' con la fecha actual del sistema.

            // Obtenemos la fecha en del sistema cuando creamos el pedido.
            Calendar fechaActual = Calendar.getInstance(); 
            // Cargamos la fecha actual en la fecha del pedido.
            pedidoI.setFechaCreacion( fechaActual ); 

            // Añadimos al LinkedHashSet el pedido.
            listaPedidos.add(pedidoI);

            System.out.println("¿Desea agregar otro Pedido? S/N");
            op = entrada.nextLine();
            
            if (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {

                do {
                    
                    System.out.println("Ingresó una letra no valida. Intentelo nuevamente");
                    op = entrada.nextLine();

                } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

            }

            contadorPedidos++;
            
        } while ( op.equalsIgnoreCase("S") ); 

    }

    public void buscarPedidoPorFecha() {

        int contadorEncontradas = 0;
        // Pedimos al usuario que fecha quiere buscar
        System.out.println("Ingrese la fecha que quiere buscar (Tenga en cuenta el formato 'DD/MM/AAAA' )");
        System.out.println("1. Ingrese el DIA (DD) :");
        int dia = entrada.nextInt();

        System.out.println("2. Ingrese el MES(MM) :");
        int mes = entrada.nextInt();

        System.out.println("3. Ingrese el AÑO (AAAA) :");
        int año = entrada.nextInt();

        // Instanciamos un objeto de tipo 'GregorianCalendar' con la fecha buscada
        Calendar fechaBuscada = new GregorianCalendar(dia, mes, año);

        System.out.println("Lista de pedidos con coincidencia con la fecha buscada " + fechaBuscada + " :");

        // Recorremos el LinkedHashSet comparando las fechas a traves de un for each
        for (Pedido auxPedido : listaPedidos) {

            if (auxPedido.getFechaCreacion().equals(fechaBuscada)) {

                System.out.println("-------------------------------------");
                System.out.println(auxPedido.toString());
                System.out.println("-------------------------------------");
                contadorEncontradas++;

            }

        }

        if ( contadorEncontradas == 0 ) {
            
            System.out.println("No se han encontrado coincidencias");

        }

    }

    public void buscarPedidoSegunNumeroOrden() {

        int contadorEncontradas = 0;
        System.out.println("Ingrese el numero de orden que desea buscar:");
        int numeroBuscar = entrada.nextInt();

        for (Pedido aux : listaPedidos) {

            if (aux.getNumeroOrden() == numeroBuscar) {

                System.out.println("==============================");
                System.out.println("El pedido buscado es igual a: ");
                System.out.println(aux.toString());
                System.out.println("==============================");
                contadorEncontradas++;

            }

        }

        if ( contadorEncontradas == 0 ) {
            
            System.out.println("No se han encontrado coincidencias");

        }

    }

    public void mostrarTodosPedidos() {

        System.out.println("========== LISTA PEDIDOS ==========");

        for (Pedido aux : listaPedidos) {

            System.out.println("");
            System.out.println(aux.toString());
            System.out.println("");

        }

        System.out.println("==============================");

    }

    public void ordenarPedidosXFecha() {

        ArrayList<Pedido> listaPedidosL = new ArrayList<>(listaPedidos);

        listaPedidosL.sort(compararFecha);

        System.out.println("========== LISTA PEDIDOS ORDENADOS X HORA ==========");

        for (Pedido aux : listaPedidos) {

            System.out.println("");
            System.out.println(aux.toString());
            System.out.println("");

        }

        System.out.println("==============================");

    }

    public static Comparator<Pedido> compararFecha=new Comparator<Pedido>(){

        @Override public int compare(Pedido p1,Pedido p2){

            return p1.getFechaCreacion().compareTo(p2.getFechaCreacion());

        }

    };

    public void eliminarPedido() {

        System.out.println("Ingrese el numero de Orden del pedido que desea eliminar");
        int pedidoEliminar = entrada.nextInt();

        // Creamos el 'iterator'
        Iterator<Pedido> it = listaPedidos.iterator();

        while (it.hasNext()) {

            if ( pedidoEliminar == (it.next().getNumeroOrden()) ) {

                it.remove();

            } else {

                System.out.println("No se han encontrado coincidencias");

            }

        }

        System.out.println("-----------------------------------------------");
        System.out.println("La lista despues de eliminar {" + pedidoEliminar + "} es igual a: ");
        System.out.println("-----------------------------------------------");

        mostrarTodosPedidos();

    }

}
