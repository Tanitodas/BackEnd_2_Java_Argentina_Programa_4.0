## *Ejercicio Practico N°3*:

### *Enunciado:*

Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.

Luego, recorrer este array y ejecutar el método `precioFinal()` en cada electrodoméstico. 

Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. 

Una vez hecho eso, también deberemos mostrar, la suma del precio de todos los Electrodomésticos. 
Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000, el resultado final
será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para televisor.

## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'Televisor'`* y *`'Lavadora'`*.

    + *Entidades* : Este paquete almacena la clase *`'Electrodomestico'`* , *`'Lavadora'`* y *`'Televisor'`*. En este caso la clase *`'Electrodomestico'`* es una clase padre de las clases  *`'Lavadora'`* y *`'Televisor'`*.

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
