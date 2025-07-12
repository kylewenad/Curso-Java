Collection en Java

De la clase Collections en Java heredan las clases que constituyen la API de colecciones de Java:
- List:
    · ArrayList
    · LinkedList
    · Vector
    · Stack
- Queue:
    · Deque
        - ArrayDeque
- Set:
    · Hashset
    · LinkedHashSet
    · TreeSet

No hereda de Collection pero funcionan parecido:
- Map:
    · HashMap
    · TreeMap


Los principales métodos de la interfaz Collection son: 
    * - add(E e): Añade un elemento a la colección.
    * - addAll(Collection<? extends E> c): Añade todos los elementos de otra
    * - remove(Object o): Elimina un elemento de la colección. 
    * - removeAll(Collection<?> c): Elimina todos los elementos de otra colección.
    * - retainAll(Collection<?> c): Retiene solo los elementos que están en otra colección. 
    * - size(): Devuelve el número de elementos en la colección.
    * - isEmpty(): Comprueba si la colección está vacía.
    * - contains(Object o): Comprueba si un elemento está en la colección. 
    * - containsAll(Collection<?>c): Comprueba si la colección contiene todos los elementos de otra colección.
    * - clear(): Elimina todos los elementos de la colección. 
    * - iterator(): Devuelve un iterador para recorrer la colección. 
    * - toArray(): Convierte la colección en un array. 
    * - stream(): Devuelve un flujo (stream) para procesar los elementos de la colección de manera funcional.

Las listas son colecciones ordenadas de elementos que permiten almacenar elementos de manera secuencial. A diferencia de los conjuntos, las listas pueden contener elementos duplicados y mantienen el orden de inserción.

Los principales métodos de la interfaz List son:
    - get(int index): Obtiene el elemento en la posición especificada.
    - set(int index, E element): Reemplaza el elemento en la posición especificada.
    - indexOf(Object o): Devuelve el índice del primer elemento igual al especificado.
    - lastIndexOf(Object o): Devuelve el índice del último elemento igual al especificado.

    - ArrayList:
        · asList: Puedes usar el método Arrays.asList(array) para crear una lista a partir de un array. Este método devuelve una lista fija, por lo que no puedes añadir o eliminar elementos.
        Pero sí puedes modificar elementos ya existentes.
        · list.Of: Si necesitas una lista dinámica, puedes crear un ArrayList a partir de la
        lista fija. Puedes usar List.of(array) para crear una lista mutable a partir de un array.
        Esta lista es dinámica, puedes añadir o eliminar elementos.
    - Las listas enlazadas(LinkedList):
        · Son una estructura de datos que consiste en nodos donde cada nodo contiene un valor y una referencia al siguiente nodo.
        · Implementan la interfaz List y la de Deque, que a su vez hereda de Queue.
        · A diferencia de las listas basadas en arrays, permiten una inserción y eliminación eficiente de elementos, ya que no requieren  mover otros elementos en la memoria. Sin embargo, el acceso a elementos específicos puede ser más lento, ya que se debe recorrer la lista desde el principio hasta el nodo deseado.

Los conjuntos(Set) son una colección de elementos únicos, sin orden específico.
Implementan la interfaz Collection y no permiten elementos duplicados.
    - HashSet:
        · Es una implementación de Set que utiliza una tabla hash para almacenar los elementos.
        · Permite operaciones rápidas de inserción, eliminación y búsqueda.
        · No garantiza el orden de los elementos.
    - LinkedHashSet:
        · Es una implementación de Set que mantiene el orden de inserción.
        · Utiliza una tabla hash y una lista doblemente enlazada para mantener el orden.
    - TreeSet:
        · Es una implementación de Set que almacena los elementos en orden ascendente. Utiliza un árbol.
        · Permite operaciones rápidas de inserción, eliminación y búsqueda.
        · No permite elementos duplicados y no permite elementos nulos.
        · Es útil cuando se necesita mantener los elementos ordenados.
