Curso de JAVA, Centro de Formación Digital San Blas

- demos: definiciones de variables, métodos...
- demos-oop: proyectos en java orientado a objetos
- demo-concepts: excepciones, test, collections...

demos:

01-demo
Los ficheros java tienen una extension .java
Al escribir los nombres del fichero se utiliza un convenio de escritura llamado PascalCase, en el que la primera letra será en mayúsculas y el resto en minúscula. En caso de que tuviera más de una palabra se escribe la siguiente palabra sin espacio y con la primera letra en mayúscula. Ejemplo: HelloPepe.java
Se escriben en inglés debido a que es el lenguaje universal dentro del entorno informático.
Otros convenios de escritura son:
    - camelCase: utilizados para las variables, escrito en minúsculas, en caso de tener más de una palabra para llamarla, la siguiente se escribe sin espacio y con la primera letra en mayúscula. Ejemplo: greetings
    - UPPER_SNAKE_CASE: utilizados para las constantes, se escriben todas las palabras en mayúscula, en caso de haber más de una palabra se separarán con una barra baja(_). Ejemplo: PACK_PRICE.
Los ficheros que vamos a crear en 'demos' serán de tipo clase.
Al crear la clase aparecerá al principio:
public class HelloPepe {}.
    - public: palabra reservada en Java, indica que es accesible desde fuera.
    - class:
    - HelloPepe:
    - {}:

Escritura en java:
{},[],(),"",//.



03-out
Escribir algo de tres formas diferentes en pantalla
println, printf, println con formato
    println -> sólo vale para String
    printf -> para String, variables (concatenación)
    println .formatted templated String - > para que imprima el mensaje del con una estructura del modo que quieras, se usan string y variables

04-oop
main
propiedades de los objetos
Las palabras en color azul indican el tipo(molde)
Las palabras en color blanco indican el objeto
Las palabras en color naranja indican la variable(los datos) 

05-funciones
Función: código ejecutable
    Puedo invocarlo por su nombre
    Puede recibir valores -> los recoge como parámetros
    Puede devolver un valor
    /"+" para sumar o concatenar
    imprimir por pantalla, el valor se puede usar
    si fuera void sería devolver por pantalla
    el nombre result sólo funciona para esta función
    // Los argumentos son los valores que llegarán a los parámetros