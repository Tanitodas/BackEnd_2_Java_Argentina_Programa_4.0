import Servicio.PeliculaService;

public class PeliculaApp {
    public static void main(String[] args) throws Exception {
        
        PeliculaService servicio = new PeliculaService();

        servicio.crearPeliculas();

        servicio.mostrarTodasLasPeliculas();

        servicio.mostrarLasPeliculasMayor1hrs();

        servicio.ordenarPorDuracionMenorAMayor();

        servicio.ordenarPorDuracionMayorAMenor();

        servicio.ordenarPorTitulo();

        servicio.ordenarPorDirector();

    }
}
