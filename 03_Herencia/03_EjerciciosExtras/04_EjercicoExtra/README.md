## *Ejercicio Extra N°4*:

### *Enunciado:*

**Sistema Gestión Facultad**. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio.

A continuación, se detalla qué tipo de información debe gestionar esta aplicación:

* Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
  identificación y su estado civil.
  
* Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
  incorporación a la facultad y qué número de despacho tienen asignado.

* En cuanto a los estudiantes, se requiere almacenar el curso en el que están
  matriculados.

* Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
  pertenecen (lenguajes, matemáticas, arquitectura, ...).

* Sobre el personal de servicio, hay que conocer a qué sección están asignados
  (biblioteca, decanato, secretaría, ...).

El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:

* Cambio del estado civil de una persona.

* Reasignación de despacho a un empleado.

* Matriculación de un estudiante en un nuevo curso.

* Cambio de departamento de un profesor.

* Traslado de sección de un empleado del personal de servicio.

Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.

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

