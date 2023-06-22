package Entidades;

// En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen.
// Para ello deberán crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado.
// 
// La clase debe tener los siguientes atributos: 
//      _ Nombre del equipo 
//      _ Ciudad 
//      _ Cantidad de partidos jugados, ganados, perdidos y empatados, y puntos totales.
//
// En el programa principal, crear una lista de tipo "EquipoDe…" y agregar 10 objetos de tipo equipo a la lista. 
// Luego, mostrar por pantalla de forma ordenada según cantidad de puntos, los nombres de cada equipo, su cantidad de puntos,
// partidos jugados, ganados, perdidos y empatados.
//
// Una vez finalizado el torneo, determinar el equipo ganador, eliminar al último equipo de la tabla por haber descendido,
// sumar al nuevo equipo que ascendió de la división inferior, reiniciar los valores de partidos y puntos a 0 para
// el inicio del siguiente campeonato y mostrar la lista en orden alfabético de los equipos.

public class ClassEquiposDeFutbol {
    
    //  ATRIBUTOS

        private String nombreEquipo;
        private String ciudad;
        private int cantJugados , cantGanados , cantPerdidos , cantEmpatados , puntosTotales ;

    //  CONSTRUCTORES

        public ClassEquiposDeFutbol() {
        }

        public ClassEquiposDeFutbol(String nombreEquipo, String ciudad, int cantJugados, int cantGanados, int cantPerdidos,
            int cantEmpatados, int puntosTotales) {
            this.nombreEquipo = nombreEquipo;
            this.ciudad = ciudad;
            this.cantJugados = cantJugados;
            this.cantGanados = cantGanados;
            this.cantPerdidos = cantPerdidos;
            this.cantEmpatados = cantEmpatados;
            this.puntosTotales = puntosTotales;
        }

    //  GETTERS y SETTERS

        public String getNombreEquipo() {
            return nombreEquipo;
        }

        public void setNombreEquipo(String nombreEquipo) {
            this.nombreEquipo = nombreEquipo;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public int getCantJugados() {
            return cantJugados;
        }

        public void setCantJugados(int cantJugados) {
            this.cantJugados = cantJugados;
        }

        public int getCantGanados() {
            return cantGanados;
        }

        public void setCantGanados(int cantGanados) {
            this.cantGanados = cantGanados;
        }

        public int getCantPerdidos() {
            return cantPerdidos;
        }

        public void setCantPerdidos(int cantPerdidos) {
            this.cantPerdidos = cantPerdidos;
        }

        public int getCantEmpatados() {
            return cantEmpatados;
        }

        public void setCantEmpatados(int cantEmpatados) {
            this.cantEmpatados = cantEmpatados;
        }

        public int getPuntosTotales() {
            return puntosTotales;
        }

        public void setPuntosTotales(int puntosTotales) {
            this.puntosTotales = puntosTotales;
        }

    //  MÉTODO toString

        @Override
        public String toString() {
            return "EquiposDeFutbol [nombreEquipo=" + nombreEquipo + ", ciudad=" + ciudad + ", cantJugados="
                    + cantJugados + ", cantGanados=" + cantGanados + ", cantPerdidos=" + cantPerdidos
                    + ", cantEmpatados=" + cantEmpatados + ", puntosTotales=" + puntosTotales + "]";
        }
        
}
