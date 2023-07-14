## Ejercicio Teorico N°2:

### *Enunciado:*

Crear una ***SuperClase*** llamada *`'Electrodoméstico'`* con los siguientes atributos:

*  Precio
*  Color
*  Consumo energético (letras entre A y F)
*  Peso.

***Los constructores*** que se deben implementar son los siguientes:

*  Un constructor vacío.
*  Un constructor con todos los atributos pasados por parámetro.

***Los métodos*** a implementar son:

1)  Métodos getters y setters de todos los atributos.
   
3)   Método `comprobarConsumoEnergetico(char letra)`: comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
   
5)   Método `comprobarColor(String color)`: comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se  invocará al crear el objeto y no será visible.
   
7)  Método `crearElectrodomestico()`: le pide la información al usuario y llena el electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000.
   
9) Método `precioFinal()`: según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios:
10) 
   <
   img src="https://i.postimg.cc/02CQ6L3c/Imagen-izquierda.png" lign="left" width="200px
   img src = "https://i.postimg.cc/Dyh0w2CS/Imagen-Derecha.png" lign="rigth" width="200px
   />

A continuación, se debe ***crear una SubClase*** llamada *`'Lavadora'`*, con los atributos:

* Carga.
  
* Además de los atributos heredados.

***Los constructores*** que se implementarán serán:

* Un constructor vacío.
  
* Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
  llamar al constructor de la clase padre.
  
 ***Los métodos*** que se implementara serán:
 
 1) Método get y set del atributo carga.
   
 2) Método `crearLavadora ()`: este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
   
 3) Método `precioFinal()`: este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.

 Se debe ***crear también una SubClase*** llamada *`'Televisor'`* con los siguientes atributos:
 
 * Resolución (en pulgadas)
 * Sintonizador TDT (booleano)
 * Además de los atributos heredados.
   
 ***Los constructores*** que se implementarán serán:
 
 * Un constructor vacío.
   
 * Un constructor con la resolución, sintonizador TDT y el resto de los atributos
 heredados. Recuerda que debes llamar al constructor de la clase padre.
 
 ***Los métodos*** que se implementara serán:
 
 1) Método get y set de los atributos resolución y sintonizador TDT.
    
 2) Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
 
 3) Método precioFinal(): este método será heredado y se le sumará la siguiente
     funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
     incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
     $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

 Finalmente, en el ***main*** debemos realizar lo siguiente:
 
 Vamos a crear una *`'Lavadora'`* y un *`'Televisor'`* y llamar a los métodos necesarios para mostrar
 el precio final de los dos electrodomésticos.

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
