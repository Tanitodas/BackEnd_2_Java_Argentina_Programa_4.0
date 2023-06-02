package Entidades;

// Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
// jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
// si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
// debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
// Métodos:
// • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
// mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
// revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
// devuelve true, sino false.

public class Jugador {
    
    //  ATRIBUTOS

        private Integer id;
        private String nombre;
        private Boolean mojado = false;

    //  CONSTRUCTORES

        public Jugador() {
        }

        public Jugador(Integer id, String nombre, Boolean mojado) {
            this.id = id;
            this.nombre = nombre;
            this.mojado = mojado;
        }

    //  GETTERS y SETTERS
        
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Boolean getMojado() {
            return mojado;
        }

        public void setMojado(Boolean mojado) {
            this.mojado = mojado;
        }

    //  MÉTODOS toString

        @Override
        public String toString() {
            return "Jugador [id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + "]";
        }
    
    //  MÉTODOS PÉRSONALIZADOS

        public Boolean disparo( Revolver revolver ) {

            //  Verificamos si la 'posicionActual' es igual a la 'posicionAgua'
            //  Si esto es así el metodo 'mojar' de la clase 'Revolver' devuelve un 'true', por ende la
            //  variable 'mojado' queda con valor 'true'.
            //
            //  En cambio, si el metodo 'mojar' devuelve 'false' significa que la 'posicionActual' y 'posicionAgua'
            //  son diferentes por ende el jugador sigue participando y la variable 'mojado' adopta el valor de 'false'

            this.mojado = revolver.mojar();

            //  Luego de verificar esto utilizamos el metodo 'siguienteChorro' perteneciente a la clase 'Revolver'
            //  para mover la posicionActual en 1.

            revolver.siguienteChorro();

            return this.mojado;
            
        }

}
