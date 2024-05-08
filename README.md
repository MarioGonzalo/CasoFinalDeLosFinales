# CasoFinalDeLosFinales

https://github.com/MarioGonzalo/CasoFinalDeLosFinales.git

APELLIDOS Gonzalo Latorre  NOMBRE Mario  GRUPO Ingeniería informática   CALIFICACIÓN
Estructuras de Datos   DNI 54210043D

## Ejercicio 1

Se indicarán las preguntas y su única opción restante será la elegida.

### 1)     En relación al estado de un objeto, para preservar el principio de encapsulación:

b)    Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.

### 2)     Los métodos de una clase no pueden devolver objetos:

b)    Falso

### 3)     ¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?

b)    Herencia

### 4)     El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:

b)    O(1)

### 5)     Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:

b)    Falso

## Ejercicio 2

Las preguntas tipo test de este apartado se responderán igual que el del anterior, la pregunta que no se elegirá de las cinco es la número dos.

### 1) Debemos diseñar un programa para un sistema de dispositivos portables aplicados en telemedicina que contienen una cantidad de memoria muy limitada (4 KB). Tenemos diferentes alternativas que hacen diferente uso de la computación y la memoria.

a) La primera de ellas tiene un orden de complejidad computacional O(n) y va a ocupar un espacio S(1).

Debemos analizar la eficiencia computacional de las mismas y justificar la elección. Teniendo en cuenta que el programa va a tener un tamaño de datos de entrada de 64 KB.

Se ha elegido la opción "a)" debido a que es la única opción que puede llegar a almacenar los datos en un espacio de memoria de 4 KB.

### 3) Explica las diferencias entre una pila y una cola. ¿Cuándo conviene utilizar cada una de estas estructuras? ¿Cuál es el orden de complejidad computacional de estas estructuras? 

Una pila es un conjunto de datos en la que cada dato nuevo insertado se coloca en la primera posición de la lista mientras que en la cola estos nuevos datos se colocan en última posición. La pila conviene más para mientras que la cola es mejor si quieres hacer

### 4) Explica el método de ordenación denominado inserción y describe las iteraciones sobre el siguiente conjunto de datos: 50 20 84 13 22 16 89 85

El método de orenación denominado inserción consiste en obtener en orden ascendente los datos y compararlos con el dato anterior, si el dato anterior es menor se dejará como está, pero si es mayor se colocará el segundo dato por delante del primero en la lista ordenando así la lista completa.

Las iteraciones de este conjunto serán: 
50 comparado con 20, 20 se moverá al puesto [0] de la lista [20 50 84 13 22 16 89 85]
50 comparado con 84, ambos se quedarán en la posición [1] y [2] de la lista respectivamente [20 50 84 13 22 16 89 85]
84 comparado con 13, 13 se moverá al puesto [2] de la lista [20 50 13 84 22 16 89 85]
84 comparado con 22, 22 se moverá al puesto [3] de la lista [20 50 13 22 84 16 89 85]
84 comparado con 16, 16 se moverá al puesto [4] de la lista [20 50 13 22 16 84 89 85]
84 comparado con 89, ambos se quedarán en la posición [5] y [6] de la lista respectivamente [20 50 13 22 16 84 89 85]
89 comparado con 85, 85 se moverá al puesto [6] de la lista [20 50 13 22 16 84 85 89]
Se alcanza el final de la lista y se vuelve a empezar
20 comparado con 50, ambos se quedarán en la posición [0] y [1] de la lista respectivamente [20 50 13 22 16 84 85 89]
50 comparado con 13, 13 se moverá al puesto [1] de la lista [20 13 50 22 16 84 85 89]
50 comparado con 22, 22 se moverá al puesto [2] de la lista [20 13 22 50 16 84 85 89]
50 comparado con 16, 16 se moverá al puesto [3] de la lista [20 13 22 16 50 84 85 89]
50 comparado con 84, ambos se quedarán en la posición [4] y [5] de la lista respectivamente [20 13 22 16 50 84 85 89]
84 comparado con 85, ambos se quedarán en la posición [5] y [6] de la lista respectivamente [20 13 22 16 50 84 85 89]
85 comparado con 89, ambos se quedarán en la posición [6] y [7] de la lista respectivamente [20 13 22 16 50 84 85 89]
Se alcanza el final de la lista y se vuelve a empezar
20 comparado con 13, 13 se moverá al puesto [0] de la lista [13 20 22 16 50 84 85 89]
20 comparado con 22, ambos se quedarán en la posición [1] y [2] de la lista respectivamente [13 20 22 16 50 84 85 89]
22 comparado con 16, 16 se moverá al puesto [2] de la lista [13 20 16 22 50 84 85 89]
22 comparado con 50, ambos se quedarán en la posición [3] y [4] de la lista respectivamente [13 20 16 22 50 84 85 89]
50 comparado con 84, ambos se quedarán en la posición [4] y [5] de la lista respectivamente [13 20 16 22 50 84 85 89]
84 comparado con 85, ambos se quedarán en la posición [5] y [6] de la lista respectivamente [13 20 16 22 50 84 85 89]
85 comparado con 89, ambos se quedarán en la posición [6] y [7] de la lista respectivamente [13 20 16 22 50 84 85 89]
Se alcanza el final de la lista y se vuelve a empezar
13 comparado con 20, ambos se quedarán en la posición [0] y [1] de la lista respectivamente [13 20 16 22 50 84 85 89]
20 comparado con 16, 16 se moverá al puesto [1] de la lista [13 16 20 22 50 84 85 89]
20 comparado con 22, ambos se quedarán en la posición [2] y [3] de la lista respectivamente [13 16 20 22 50 84 85 89]
22 comparado con 50, ambos se quedarán en la posición [3] y [4] de la lista respectivamente [13 16 20 22 50 84 85 89]
50 comparado con 84, ambos se quedarán en la posición [4] y [5] de la lista respectivamente [13 16 20 22 50 84 85 89]
84 comparado con 85, ambos se quedarán en la posición [5] y [6] de la lista respectivamente [13 16 20 22 50 84 85 89]
85 comparado con 89, ambos se quedarán en la posición [6] y [7] de la lista respectivamente [13 16 20 22 50 84 85 89]
Se volverá a hacer este bucle y al no haber cambios se considerará la lista como ordenada.


### 5) Dadas dos funciones y su número de operaciones: A = 1024 n B = 16 n^3 Calcular a partir de qué tamaño de entrada n A es más eficiente que B.

A partir del tamaño de entrada 8 A será más eficiente que B ya que con este valor de n ambos serán iguales pero B disminuye la eficiencia más rápido.

## Ejercicio 3

El código da un error ya que la recursividad lineal no final empleada disminuye b con el objetivo de que llegue a 0 y terminar el bucle, pero este al ser negativo nunca llegará a 0 creando un bucle infinito del que se acaba saliendo con un error. Esto se podrá solucionar o bien no permitiendo que se introduzcan números negativos o sumando en vez de restar cuando b se trate de un número negativo.

La recursividad, como se ha mencionado anteriormente, es lineal no final. La operación ejecutada en este código es la de elevar un número a otro, siendo "a" la base y "b" el exponente.

## Ejercicio 4

El código de este ejercicio se puede encontrar en la carpeta "CFFEjercicio4". En el readme se contestará a las preguntas:

### ¿Qué tipo de recursividad se está empleando? ¿Qué complejidad computacional tiene el algoritmo?

Se está empleando una recursividad lineal que tiene una complejidad computacional de O(n)

## Ejericicio 5

El código de este apartado se encuentra en la carpeta "CFFEjercicio5" aquí se responderán las preguntas planteadas en este ejercicio las cuales son:

### ¿Deberá modificar los atributos timeline y tweets de la clase UserAccount (definida en el ejercicio 1) para que contenga elementos de la clase hija Retweet? Justifique su razonamiento y, si cree que hay que modificarlos, explique también cómo lo haría.

No, estos atributos no deberán modificarse ya que al poder almacenar objetos de la clase Tweet puede hacer lo mismo con sus hijos.

### ¿Deberá modificar el método tweet(Tweet tweet1) de la clase UserAccount (definida en el ejercicio 1) para que pueda enviar también objetos de tipo Retweet? Justifique su razonamiento y, si cree que hay que modificarlo, explique también cómo lo haría.

Si, se tendrá que hacer un método para cada acción ya que son clases diferentes que poseen atributos distintos.
