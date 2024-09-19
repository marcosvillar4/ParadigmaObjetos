<br>Marcos Villar <br> 19/09/24
____
GRASP: Serie de patrones, **G**eneral **R**esponsability **A**ssignment **S**oftware **P**atterns


<h3>Principios GRASP: </h3>

- Principio Experto Informacion:
  - Quien es el responsable de cada funcion del codigo?
  - La responsabilidad de una funcion cae en el objeto que tenga la informacion necesaria para ejecutarla

- Creador:
  - Que clase es la responsable de crear objectos?
  - En general la clase B es responsable de crear la clase A si:
    - La clase B contiene instancias de A
    - La clase B graba instancias de A 
    - La clase B utiliza instancias de A
    - La clase B tiene la info para inicializar la clase A

- Controlador:
  - Quien coordina el backend con el frontend?
  - Va a haber una clase intermedia la cual permita el intercambio de informacion entre la interfaz y la funcionalidad de la aplicacion

- Bajo Acoplamiento:
  - Cuanto depende una clase para que funcione otra
  - Una clase deberia funcionar sola

- Alta cohesion:
  - Los elementos internos de un programa tienen que estar altamente relacionados entre si  

_____

SOLID: Acronimo para multiples principios 

**S**ingle responsability principle<br>
**O**pen-closed principle<br>
**L**iskov substitution principle<br>
**I**terface segregation principle<br>
**D**ependency inversion principle<br>

<h3>Principios SOLID: </h3>

   - Single responsability Principle:
     - Cada clase tiene una responsabilidad
   - Open-closed principle:
     - Las clases deben ser extensibles pero no modificables
   - Liskov substitution principle:
     - Un tendria que poder remplazar una clase A con una clase B si comparten herencia
   - Interface segregation principle:
     - Interfaces largas deben ser simplificadas en multiples interfaces mas chicas
   - Dependency inversion principle:
     - Para armar dependencias, hay que usar interfaces