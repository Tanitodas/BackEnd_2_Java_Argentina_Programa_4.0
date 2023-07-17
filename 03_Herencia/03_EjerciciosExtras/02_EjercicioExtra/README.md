## *Ejercicio Extra N°2*:

### *Enunciado:*

Crear una superclase llamada `Edificio` con los siguientes atributos:

 1) Ancho.
 2) Alto
 3) Largo.

La clase edificio tendrá como métodos:

*  Método `calcularSuperficie()`: calcula la superficie del edificio.

*  Método `calcularVolumen()`: calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:

`Clase Polideportivo` con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

`Clase EdificioDeOficinas` con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos `calcularSuperficie` y `calcularVolumen` en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
`cantPersonas()` y mostrar los resultados de cada edificio de oficinas.

## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde aplicamos algunos metodos de las clases que construimos en la carpeta
      entidades.

    + *Entidades* : Este paquete almacenan las clases *`'Edificio'`* , *`'Oficina'`* y *`'Polideportivo'`*.

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
