## Ejercicio Extra Nº 2
----
### *Enunciado:*
<p> 

En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen.

Para ello deberán crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado.

La clase debe tener los siguientes atributos: 
     _ Nombre del equipo 
     _ Ciudad 
     _ Cantidad de partidos jugados, ganados, perdidos y empatados, y puntos totales.

En el programa principal, crear una lista de tipo "EquipoDe…" y agregar 10 objetos de tipo equipo a la lista. 
Luego, mostrar por pantalla de forma ordenada según cantidad de puntos, los nombres de cada equipo, su cantidad de puntos, partidos jugados, ganados, perdidos y empatados.

Una vez finalizado el torneo, determinar el equipo ganador, eliminar al último equipo de la tabla por haber descendido,
sumar al nuevo equipo que ascendió de la división inferior, reiniciar los valores de partidos y puntos a 0 para
el inicio del siguiente campeonato y mostrar la lista en orden alfabético de los equipos.

</p>

---
## Estructura de Carpetas
---
El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'EquipoDeFutbolService'`* y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'ClassEquipoDeFutbol'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'EquipoDeFutbolService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'ClassEquipoDeFutbol'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
