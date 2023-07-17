## *Ejercicio Extra N°1*:

### *Enunciado:*

En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:

  _ Número de mástiles para veleros.
  _ Potencia en CV para barcos a motor.
  _ Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.

## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde no realizamos nada ya que el ejercicio no nos los pide.

    + *Entidades* : Este paquete almacena la carpeta 'Barcos' , 'Entidades_Auxiliares' y 'Puerto'.
  
      A su vez en ellas alamcenamos algunas clases, estas son, segun carpeta, las siuguientes:
      
      1)  *Barcos* : Se almacenan las clases *`'Barco'`* , *`'BarcoAMotor'`* , *`'BarcoVelero'`* , *`'YateDeLujo'`* e *`'InterfazBarco'`*.
      2)  *Entidades_Auxiliares* : Se alamcena la clase *`'Matricula'`* en donde establecemos que la matricula de los barcos es un objeto en donde                tenemos dos atributos y componen una matricula alfanumerica.
      3) *Puerto* : Se almacenan las clases *`'Alquiler'`* y *`'AlquilerServicio'`*.


+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
