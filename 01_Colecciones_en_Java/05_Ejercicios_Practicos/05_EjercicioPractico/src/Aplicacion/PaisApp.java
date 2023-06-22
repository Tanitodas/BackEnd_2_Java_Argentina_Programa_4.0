import Servicio.PaisService;

public class PaisApp {

    public static void main(String[] args) throws Exception {
       
        PaisService servicio = new PaisService();

        servicio.crearPais();

        servicio.ordenarHashSet();

        servicio.eliminarPaisDeLista();

    }
}
