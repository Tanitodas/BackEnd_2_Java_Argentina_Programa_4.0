## Ejercicio Nº 5

### *Enunciado:*
<p> 

Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un *Conjunto* o *Set*. 

El programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al 
usuario si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos los países 
guardados en el conjunto. (Recordemos hacer los servicios en la clase correspondiente).

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.

</p>


## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'PaisService'`* y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'Pais'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'PaisService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'Pais'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.

