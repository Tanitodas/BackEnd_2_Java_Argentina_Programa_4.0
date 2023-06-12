## Ejercicio Nº 3

### *Enunciado:*
<p> 

Crear una clase llamada *Alumno* que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.

En el servicio de *Alumno* deberemos tener un bucle que crea un objeto *Alumno*.

Se pide toda la información al usuario y ese *Alumno* se guarda en una lista de tipo *Alumno* y se le
pregunta al usuario si quiere crear otro *Alumno* o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

1.  *`Método notaFinal()`* : 

    El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el `main`.

</p>


## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:

    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'AlumnoService'`* y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'Alumno'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'AlumnoService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'Alumno'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
