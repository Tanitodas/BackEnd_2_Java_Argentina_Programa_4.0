## *Ejercicio Practico N°8*:

### *Enunciado:*

Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:

* Clase 1:

```java

class Uno{

    private static int metodo() {

        int valor=0;

        try {
            valor = valor+1;
            valor = valor + Integer.parseInt (”42”);
            valor = valor +1;
            System.out.println(”Valor final del try:” + valor) ;
        } catch (NumberFormatException e) {
            Valor = valor + Integer.parseInt(”42”);
            System.out.println(“Valor final del catch:” + valor);
        } finally {
            valor = valor + 1;
            System.out.println(”Valor final del finally: ” + valor) ;
        }
        valor = valor +1;
        System.out.println(”Valor antes del return: ” + valor) ;
        return valor;
    }

    public static void main (String[] args) {

        try {
    
            System.out.println (metodo()) ;
    
        }catch(Exception e) {
    
            System.err.println(”Excepcion en metodo() ”) ;
            e.printStackTrace();
        }

    }

}

```

* Clase 2:

```java

class Dos{

    private static int metodo() {

        int valor=0;

            try{

                valor = valor + 1;
                valor = valor + Integer.parseInt (”W”);
                valor = valor + 1;
                System.out.println(”Valor final del try: ” + valor) ;

            } catch ( NumberFormatException e ) {

                valor = valor + Integer.parseInt (”42”);
                System.out.println(”Valor final del catch: ” + valor) ;

            } finally {

                valor = valor + 1;
                System.out.println(”Valor final del finally: ” + valor) ;

            }

    valor = valor + 1;
    System.out.println(”Valor antes del return: ” + valor) ;
    return valor;

    }

    public static void main (String[] args) {

        try{
    
            System.out.println ( metodo ( ) ) ;
    
        } catch(Exception e) {
    
            System.err.println ( ” Excepcion en metodo ( ) ” ) ;
            e.printStackTrace();
    
        }

    }

}

```

* Clase 3:

```java

class Tres{

    private static int metodo( ) {

        int valor=0;

        try{

            valor = valor + 1;
            valor = valor + Integer.parseInt (”W”);
            valor = valor + 1;
            System.out.println(”Valor final del try: ” + valor);

        } catch(NumberFormatException e) {

            valor = valor + Integer.parseInt (”W”);
            System.out.println(”Valor final del catch: ” + valor);

        } finally{

            valor = valor + 1;
            System.out.println(”Valor final del finally:” + valor);

        }

        valor = valor + 1;
        System.out.println(”Valor antes del return: ” + valor) ;
        return valor;
    }

    public static void main (String[] args) {

        try{

        System.out.println( metodo ( ) ) ;

        } catch(Exception e) {

        System.err.println(”Excepcion en metodo ( ) ” ) ;
        e.printStackTrace();

        }

    }

}

```

## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde aplicamos algunos metodos de las clases que construimos en la carpeta
      entidades.

    + *Servicios* : En este paquete guardamos las clases de servicios de todas las clases que almacenamos en la carpeta entidades, ellas son:
      *`'ServicioPersona'`* , *`'ServicioProfesor'`* , *`'ServicioPersonalServicio'`* , *`'ServicioEstudiante'`* y *`'ServicioEmpleado'`* en donde         desarrollamos metodos personalizados para realizar las tareas que nos piden en el ejercicio.

    + *Entidades* : Este paquete almacenan las clases *`'Persona'`* , *`'Profesor'`* , *`'Personal Servicio'`* , *`'Estudiante'`* y *`'Empleado'`*.

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
