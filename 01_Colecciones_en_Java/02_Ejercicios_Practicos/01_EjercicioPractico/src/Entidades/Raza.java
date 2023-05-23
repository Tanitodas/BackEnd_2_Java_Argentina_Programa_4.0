package Entidades;

// Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
// programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
// después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
// salir, se mostrará todos los perros guardados en el ArrayList.

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
