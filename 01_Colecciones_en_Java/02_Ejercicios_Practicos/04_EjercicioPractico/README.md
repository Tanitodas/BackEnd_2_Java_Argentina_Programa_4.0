## Ejercicio Nº 4
----
### *Enunciado:*
<p> 
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 

Para esto, tendremos una clase Pelicula con el título, director y duración de la película (en horas).

Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:

+ En el servicio deberemos tener un bucle que crea un objeto *Pelicula* pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.

+ Después, esa *Pelicula* se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
</p>

+ Mostrar en pantalla todas las películas

+ Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

+ Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.

+ Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.

+ Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.

+ Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

---
## Estructura de Carpetas
---
El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'PeliculaService'`* y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'Pelicula'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'PeliculaService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'Pelicula'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
