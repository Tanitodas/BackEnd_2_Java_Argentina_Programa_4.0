package Entidades;

// Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
// usaremos un *Conjunto* o *Set*. 

// El programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al 
// usuario si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos los países 
// guardados en el conjunto. (Recordemos hacer los servicios en la clase correspondiente).

// Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
// cómo se ordena un conjunto.

// Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
// buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
// usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
// al usuario.

public class Pais {
    
    //  ATRIBUTOS

        private String nombre;
        private String continente;

    //  CONSTRUCCTORES

        public Pais() {
        }

        public Pais(String nombre, String continente) {
            this.nombre = nombre;
            this.continente = continente;
        }

    //  GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getContinente() {
            return continente;
        }

        public void setContinente(String continente) {
            this.continente = continente;
        }

    //  MÉTODO toString()

        @Override
        public String toString() {
            return "Pais [ nombre = " + nombre + ", continente = " + continente + " ]";
        }

}
