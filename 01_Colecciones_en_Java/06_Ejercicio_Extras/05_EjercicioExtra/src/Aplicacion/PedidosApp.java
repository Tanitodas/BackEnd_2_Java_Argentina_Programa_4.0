package Aplicacion;

import java.util.Scanner;

import Servicio.PedidoService;

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

public class PedidosApp {
    public static void main(String[] args) throws Exception {
        
        PedidoService servicio = new PedidoService();
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Menú ====");
            System.out.println("1. Crear PEDIDO");
            System.out.println("2. BUSCAR pedido por N° de Orden");
            System.out.println("3. BUSCAR pedido por FECHA de creacion");
            System.out.println("4. MOSTRAR todos los pedidos");
            System.out.println("5. ORDENAR y MOSTRAR todos los pedidos segun fecha de creacion");
            System.out.println("6. REMOVER un pedido de la lista");
            System.out.println("0. SALIR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    servicio.creacionDePedido();
                    break;

                case 2:
                    
                    servicio.buscarPedidoSegunNumeroOrden();
                    break;

                case 3:
                    
                    servicio.buscarPedidoPorFecha();
                    break;

                case 4:
                
                    servicio.mostrarTodosPedidos();
                    break;

                case 5:

                    servicio.ordenarPedidosXFecha();
                    break;

                case 6:

                    servicio.eliminarPedido();
                    break;

                case 0:

                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            scanner.nextLine(); //  Limpiamos el buffer

            System.out.println(); // Agregar una línea en blanco para mayor legibilidad

        } while (opcion != 0);

        scanner.close();
    }
    
}
