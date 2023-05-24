package Entidades;

// Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
// un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
// está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
// ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
// la lista ordenada.

public class Raza {
    
    // ATRIBUTOS

        private String nombreRaza;

    // CONSTRUCTORES

        public Raza() {
        }

        public Raza(String nombreRaza) {
            this.nombreRaza = nombreRaza;
        }

    //  GETTERS y SETTERS

        public String getNombreRaza() {
            return nombreRaza;
        }

        public void setNombreRaza(String nombreRaza) {
            this.nombreRaza = nombreRaza;
        }
    
    //  METODOS toString

        @Override
        public String toString() {
            return " Raza [ nombreRaza = " + nombreRaza + " ] ";
        }
    
}
