## Manos a la Obra N°1:

### *Enunciado:*

Vamos a crear una clase `Animal` que tenga un método *`'hacerRuido()'`* que devuelva un saludo
“Hola”. 

Luego haremos clase `Perro` y clase `Gato` que extiendan de `Animal` y sobreescriban el
método *`'hacerRuido()'`* con el ruido que corresponda a cada uno. 

Luego, en el *`main`* vamos a crear un *ArrayList* de animales y los siguientes animales

Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();

Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.


## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'Perro'`* , *`'Gato'`* y *`'Animal'`*, a pesar de esta ultima ser una clase padre.

    + *Entidades* : Este paquete almacena la clase *`'Perro'`* , *`'Gato'`* y *`'Animal'`*. En este caso la clase *`'Animal'`* es una clase padre de las clases  *`'Perro'`* y *`'Gato'`*.

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.