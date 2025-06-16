crear un entregable
refactorización no tiene efectos "claros" sobre la funcionalidad, cambios para mejorar la estructura

iteraciones (bucles)

Dos maneras de controlar (bucle) "leer"
- Con un contador
	for(foreach): más utilizado en el contador
	while
	uso con arrays (iterable?)
	bucle infinito -> condición de salida
	
- Centinela (santinel o flag) -> que se repita hasta que "algo" se ponga hasta que uno quiera por ej, suele utilizarse con boolean hasta que salga true
	while (dowhile): más utilizado en centinela
	for


iteraciones condicionales


Para guardar varios datos:
- arrays -> longitud fija("espacios" guardados para escribir los datos)
	Ej: [2,3,4] 6 -> hay 3 espacios, por lo que el dato "6" no entraría en el array
	No se usan en java pero como ejemplo:
	Vector -> array[n] =[n1,n2,n3,..]
	Matriz -> array[n,m] =  [1 1 1]
							[1 1 1]
							[1 1 1]
- collection -> longitud variable
	List, Set, Map, Queue

	Tipos genéricos
	List(de qué)<"escribir el tipo">
		<String>
		<Integer(enteros)>
	List <String>
	
	Sentencia de asignación
	int number = 1
	1	2	   3 4
	= (es el operador de asignacion)

	4 partes de una asignación

	List<Integer> users = new ArrayList<Integer> ()
	() para ejecutar