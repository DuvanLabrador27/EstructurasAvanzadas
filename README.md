# Estructuras de Datos Avanzadas 💻

![Version](https://miro.medium.com/max/1200/1*Ut55XNszCQPxCG9qaEQfAw.png)

## Tabla de Contenido
* [Ejercicios :memo:](#Ejercicios)
* [Herramientas Utilizadas :memo:](#Herramientas)
* [Link Documentacion :memo:](#LinkDocumentacion)
* [Autores :memo:](#Autores) 
* [Conclusiones :memo:](#Conclusiones)
* [Bibliografia :memo:](#Bibliografia)

## Ejercicios
_Los ejercicios fueron extraidos de plataformas como LeetCode, CodeForces, AtCoder y Online Judge_
* <b> Complete Binary Tree Inserter </b>
¿Qué es un Árbol Binario Completo?
Un árbol binario completo es aquel donde todo sus nodos terminales  u hojas tiene la misma altura, además que en todos sus niveles, (a excepción del último nivel) están completamente llenos, es decir, tiene sus 2 hijos nodo, un ejemplo de un árbol binario completo es el siguiente:

[![1.png](https://i.postimg.cc/XYwWNcpv/1.png)](https://postimg.cc/WdbCXZmR)

Es importante destacar su peculiar característica es que ademas tener todos sus niveles completos, excepción de ultimo,  este último nivel también debe tener por lo menos, un nodo completo como la imagen anterior, es decir, tenga 2 hijos (sub izquierdo – sobre derecho), la siguiente ilustración, es un árbol que no es un árbol binario completo.

[![2.png](https://i.postimg.cc/prhNwKwR/2.png)](https://postimg.cc/D4TYs4fM)

La anterior gráfica, no se puede considerar como árbol binario porque el nodo 5 no está completo, solo tiene 1 hijo y es el sub nodo derecho 9.

Dado una clase CBT Inserter   se debe insertar un nuevo nodo al árbol binario completo con la finalidad que siempre vele por que se cumpla dicha característica

A continuación se ve gráficamente el flujo de trabajo para el siguiente caso de Prueba:
["CBTInserter", "insert", "insert", "get_root"]
[[[1, 2]], [3], [4], []]
Recalquemos la definición de los siguientes métodos:

	CBT Inserter(TreeNode root) : Arranca la estructura de datos con la raiz  de arbol binario completo
	TreeNode getroot(): Retorna el nodo raíz del árbol completo

[![3.png](https://i.postimg.cc/0jL6sZg0/3.png)](https://postimg.cc/0K05GYyz)

[![4.png](https://i.postimg.cc/fLPyc5bQ/4.png)](https://postimg.cc/gXvGdVRg)


* <b> Binary Tree Inorder Traversal </b>
-Descripción: Dada la root de un árbol binario, devuelve el recorrido en inorden de los valores de sus nodos.

[![1.png](https://i.postimg.cc/QCcvrTK1/1.png)](https://postimg.cc/PvrSWN45)

-Restricciones:
El número de nodos en el árbol está en el rango [0, 100].
-100 <= Node.val <= 100

-Solución: 
A diferencia de las estructuras de datos lineales (matriz, lista enlazada, colas, pilas,
etc.) que solo tienen una forma lógica de atravesarlos, los árboles se pueden recorrer de diferentes maneras.
 
En el problema, se menciona claramente que tenemos que hacer el recorrido a través de la forma Inorder .
Primero entendamos qué es Inorder .
1. Atraviesa el subarbol izquierdo
2. atraviesa la raiz
3. atraviesa el subarbol derecho.

Solución en LEETCODE:
[![2.png](https://i.postimg.cc/P5ff2t02/2.png)](https://postimg.cc/1fTZzZmq)

* <b> Validate Binary Search Tree </b><br>
-Para el desarrollo de este ejercicio debemos tener en cuenta que un árbol(BST) es válido si: 

1. El árbol debe estar ordenado, porque estamos trabajando con búsqueda binaria<br>
2. La izquierda de un subárbol de un nodo contiene solo claves menores que la raíz<br>
3. La derecha de un subárbol de un nodo contiene solo claves mayores que la raíz<br>

-Restricciones:<br>
1. Debe estar en el rango [1,10^4]<br>
## SOLUCIÓN EN LEETCODE

_Se anexa el metodo utilizado en VSCODE y caso de prueba aceptado:_
<p align="center">
 <img src="https://github.com/DuvanLabrador27/EstructurasAvanzadas/blob/main/img/code.png" width="500" height="700" margin-right: 20px><br>
 
</p>
<b> Caso de prueba TRUE </b><br>
-Para este primer caso de prueba TRUE y válido cumpliendo con los requisitos anteriores, se muestra un gráfico en donde se evidencia el porqué este nos da True como respuesta.<br>

-Tenemos que:<br>
Input: root = [2,1,3]<br>
Output: true<br>
<p align="center">
 <img src="https://github.com/DuvanLabrador27/EstructurasAvanzadas/blob/main/img/CASO1_ACCEPTED.png" width="1000" height="700" margin-right: 20px><br>
 
</p>
<p align="center">
 <img src="https://github.com/DuvanLabrador27/EstructurasAvanzadas/blob/main/img/c1.png" width="500" height="700" margin-right: 20px><br>
 
</p>
<b> Caso de prueba FALSE </b><br>
-Para este segundo caso de prueba FALSE, se muestra un gráfico en donde se evidencia el porqué este nos da False como respuesta.<br>

-Tenemos que:<br>
Input: root = [5,1,3,null,null,4,10]<br>
Output: false<br>
<p align="center">
 <img src="https://github.com/DuvanLabrador27/EstructurasAvanzadas/blob/main/img/CAS2_ACCEPTED.png" width=800" height="700" margin-right: 20px><br>
 
</p>
</p>
<p align="center">
 <img src="https://github.com/DuvanLabrador27/EstructurasAvanzadas/blob/main/img/c2.png" width="500" height="700" margin-right: 20px><br>
 
</p>
														 

* <b> Minimum Height Trees </b>

Un árbol es un gráfico no dirigido en el que dos vértices cualesquiera están conectados  exactamente por  un camino. En otras palabras, cualquier gráfico conexo sin ciclos simples es un árbol.

Dado un árbol de nnodos etiquetados de 0a n - 1, y una matriz de  n - 1 edgesdonde indica que hay un borde no dirigido entre los dos nodos  y  en el árbol, puede elegir cualquier nodo del árbol como raíz. Cuando selecciona un nodo como raíz, el árbol de resultados tiene altura . Entre todos los árboles enraizados posibles, aquellos con altura mínima (ie ) se denominan árboles de altura mínima (MHT).edges[i] = [ai, bi]aibixhmin(h)

Devuelve una lista de las etiquetas raíz de todos los MHT . Puede devolver la respuesta en cualquier orden .

La altura de un árbol con raíces es el número de aristas en el camino descendente más largo entre la raíz y una hoja.

[![1.png](https://i.postimg.cc/x1t2bj3r/1.png)](https://postimg.cc/Sn25BhPV)	
		
[![2.png](https://i.postimg.cc/LswGzJqW/2.png)](https://postimg.cc/Jy3T8453)		
												
														 
Restricciones: 

1 <= n <= 2 * 104
edges.length == n - 1
0 <= ai, bi < n
ai != bi
Todos los pares son distintos.(ai, bi)
Se garantiza que la entrada dada sea un árbol y no habrá bordes repetidos.

Solucion LeetCode:

[![1.png](https://i.postimg.cc/FswT1Qgh/1.png)](https://postimg.cc/vcLrSkNK)
														 
Una forma de encontrar el nodo medio del árbol es comenzar desde cada uno de los nodos hoja y eliminarlos iterativamente hasta que quede con 1 o 2 nodos finales que serán los nodos medios.
														 
Podemos encontrar los nodos hoja en cada iteración utilizando el grado interior del nodo, es decir, el número de aristas que están conectadas al nodo.
Un nodo hoja tendrá un grado de entrada de 1.
														 
El algoritmo utilizado será similar a BFS. En cada nivel de BFS, sacaremos el nodo de hoja y empujaremos los nuevos nodos que se convierten en hojas después de la eliminación de los nodos de hoja en la iteración actual.
														 
Esto continuará hasta que nos queden solo 1 o 2 nodos, que serían nuestros nodos intermedios finales que forman los MHT.
Ejemplo:

[![2.png](https://i.postimg.cc/VsTD7bZY/2.png)](https://postimg.cc/4n66ynTM)
[![3.png](https://i.postimg.cc/nzrG2Hvj/3.png)](https://postimg.cc/ygqRYCps)	
														 
						
* <b> Find a Corresponding Node of a Binary Tree in a Clone of That Tree </b>

Descripción:

Dados dos árboles binarios original y cloned dada una referencia a un nodo target en el árbol original.
El cloned árbol es una copia del árbol original.
Devuelve una referencia al mismo nodo en el cloned árbol.
Tenga en cuenta que no puede cambiar ninguno de los dos árboles o el target nodo y la respuesta debe ser una referencia a un nodo en el cloned árbol.

Restricciones:

El número de nodos en tree está en el rango [1, 104].
Los valores de los nodos de tree son únicos.
targetnode es un nodo del original árbol y no lo es null.

Solucion LeetCode:

[![2.jpg](https://i.postimg.cc/FFBCgnf1/2.jpg)](https://postimg.cc/mh7STjyG)
	
[![4.png](https://i.postimg.cc/rsb2WV49/4.png)](https://postimg.cc/Pvm7nk2L)
														 
Explicación: 
Para realizar la explicación de este ejercicio, vamos a usar el siguiente árbol 
(Árbol original):

[![1.png](https://i.postimg.cc/qvY1F9kh/1.png)](https://postimg.cc/k2QN6YRq)
														 
nuestro objetivo será encontrar el elemento [8]:								
														 
[![2.png](https://i.postimg.cc/sDLPf7bb/2.png)](https://postimg.cc/rKSRQ0V9)		
[![3.png](https://i.postimg.cc/28gvNmZD/3.png)](https://postimg.cc/MvbX1C5P)		
[![4.png](https://i.postimg.cc/rpNt4rYV/4.png)](https://postimg.cc/7Cb68fkd)
											
* <b> Find if Path Exists in Graph </b>
Este problema nos daba como entrada un arreglos de arreglos donde estos últimos contienen parejas de números las cuales serán nuestros nodos, contaremos con un nodo inicio y un nodo destino los cuales serán números; teniendo en cuenta cuenta que nuestro inicio será 0 y nuestro destino será cualquier número del array que mayor a 0, donde secuencialmente tendremos que seguir un camino desde nuestro inicio hasta el destino, por ejemplo:

[![1.png](https://i.postimg.cc/6pT90nD9/1.png)](https://postimg.cc/rDXXy0Vb)

tenemos un grafo tal que: (0 → 1),(1 →2), (2 → 0)
teniendo como a 0 como nuestro inicio y 2 como nuestro destino 
vemos que tenemos 2 posibles caminos: 0 → 1 → 2 y 0→ 2
por lo cual nuestra respuesta será: TRUE

[![2.png](https://i.postimg.cc/2SqDvmZy/2.png)](https://postimg.cc/rDL3XBg2)

como podemos ver tenemos un grafo tal que: [0 → 1],[0 → 2],[3 →  5],
[5 →  4],[4 → 3].
teniendo inició = 0 y destino = 5 
vemos que no hay un camino por lo tanto nuestra respuesta será: FALSE

[![3.png](https://i.postimg.cc/tTqv3tMk/3.png)](https://postimg.cc/XZPg3F3B)

para resolver este problema hice uso del algoritmo DFS(Deepth First Search ) el cual recorre un grafo de manera recursiva, marcando los nodos ya visitados y asi permitiendo dar  con un camino si existe tal 

vemos que: (0 → 1)(1 → 2)(2 → 3)(3 → 3)(0 → 1)(0 → 2)(2→ 0)(2 → 0)(0 → 1)(0 → 1)

vemos que si el nodo tiene el color verde es que aun no ha sido visitado
si está en rojo es nuestro nodo actual 
si esta en naranja esta en la pila de recursión, por ende se marca como nodo visitado 

lo que hace la solución en pocas palabras es recorrer el grafo de manera recursiva mintra en una lista guardamos los nodos visitados, así tenemos que este algoritmo seguirá iterando mientras no encontremos el destino o terminemos dicho grafo.

![ezgif com-gif-maker61](https://user-images.githubusercontent.com/62295706/205413188-f36aebfe-3bf0-4883-9560-3306e215414c.gif)


* <b> Relative Ranks </b>

El ejercicio consta de una competición, la cual de acuerdo al orden que se registre o se dé, este se va asignando a su debido Ranking.

Solución: 

![codigo](https://user-images.githubusercontent.com/101369022/205574329-88160258-2bd9-452f-a461-42d175c1e452.png)



Explicación:

Principalmente lo que se realiza en el código, de cierta manera se guardan los números y el índice. De tal manera que ordene los resultados y arroje un orden de posiciones y su respectiva premiación. 

El tamaño del arreglo puede ser mayor o igual a 1 de tal manera que pueden haber 100 competidores y transformará a un String el cual marcará el de mayor puntaje ( Medalla de Oro, Plata y Bronce). Lo demás lo pondrá en Enteros con su respectivo orden.
Entonces, se explicará los casos de prueba:



![Casos](https://user-images.githubusercontent.com/101369022/205574376-de9c6465-8f50-4519-9605-65b8b9df7ba2.png)



![GRAFICA](https://user-images.githubusercontent.com/101369022/205574768-045448cc-c1db-45fb-94c8-4c32b28196cb.png)



														 
* <b> Heap Operations </b>
														 
														 
[![aceptado.png](https://i.postimg.cc/mZ01P1Py/01.png)](https://postimg.cc/Z0x5gRFW)
														 
														 
														 
Este ejercicio maneja los montones binarios, que son un caso particular y sencillo de la estructura de datos Montículo, y está basada en un árbol binario balanceado, que puede verse como un árbol binario con dos restricciones adicionales: Propiedad de montículo.
En cualquier momento el montón contiene varios números enteros (posiblemente ninguno), algunos de ellos pueden ser iguales.

<b>COLA DE PRIORIDAD USANDO EL MONTÓN BINARIO</b><br>
Priority Queue es una extensión de la cola con las siguientes propiedades: 
- Cada elemento tiene una prioridad asociada.
- Un elemento con alta prioridad se quita de la cola antes que un elemento con baja prioridad.
- Si dos elementos tienen la misma prioridad, se sirven según su orden en la cola.
														 
Un montón binario es un árbol binario con las siguientes propiedades:  
- Es un árbol completo . Esta propiedad de Binary Heap los hace adecuados para ser almacenados en una matriz .
- Un montón binario es Min Heap o Max Heap .
- En un montón binario mínimo , la clave en la raíz debe ser mínima entre todas las claves presentes en el montón binario. La misma propiedad debe ser verdadera de forma recursiva para todos los nodos del árbol binario .
- De manera similar, en un montón binario máximo , la clave en la raíz debe ser la máxima entre todas las claves presentes en el montón binario. La misma propiedad debe ser verdadera de forma recursiva para todos los nodos del árbol binario.


<b>Explicación</b><br>
La función que realiza este código es completar el número de instrucciones manteniendo la coherencia secuencialmente, de modo que no falte ninguna instrucción impidiendo la ejecución de todas las instrucciones.
	
														 
input 
la primera línea contiene un número entero n ( 1 ≤  n  ≤ 100 000 )
Las siguientes n líneas son las instrucciones a verificar en el orden en que se aplican. Se utiliza el formato descrito en la declaración. Todos los números en la entrada son números enteros que no excedan 10^9 por su valor absoluto.

														 
output
La primera línea de la salida debe contener un solo entero m  : el número mínimo posible de registros en la secuencia modificada y completa de operaciones.
Las próximas líneas deben contener la secuencia corregida de registros siguiendo el formato de la entrada (descrito en la declaración), uno por línea y en el orden en que se aplican. Todos los números en la salida deben ser números enteros que no excedan 10^9 por su valor absoluto.

														 
														 
<b>Casos:</b><br>														 
Caso normal
Ejemplo #1:

- que se cumplan los parámetros de entrada
[![case.png](https://i.postimg.cc/DfWbfPwz/Screenshot-1.png)](https://postimg.cc/Z0x5gRFW)
														 
														 
														 
En el primer caso, después de insertar el número 3 en el montón, el número mínimo es 3. Para que el resultado del primer getMin sea igual a 4, primero se debe eliminar el número 3 del montón y luego agregar el número 4 al montón.
														 
														 
Ejemplo #2
<table>
        <tr>
            <th>Input</th>
            <th>Output</th>
        </tr>
        <tr>
            <td>
		<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/pVwB3bhW/Screenshot-3.png' border='0' alt='Screenshot-3'/></a>	
            </td>
            <td>
               <a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/MZMDsKG3/Screenshot-2.png' border='0' alt='Screenshot-2'/></a>
            </td>
        </tr>
</table>
														 
Proceso:

Video: https://youtu.be/qHxUeeQkKO8
					
														 
[![case.png](https://i.postimg.cc/KvBkBcLS/02.png)](https://postimg.cc/xcj1S2tt)

	
														 
<b>Casos Desborde</b><br>
Caso desborde #1
El caso de desborde #1 es admitido en el caso de n superar el número de instrucciones establecidas que es de 1 ≤  n  ≤ 100 000.
														 
<table>
        <tr>
            <th>Input</th>
            <th>Output</th>
        </tr>
        <tr>
            <td>
		<a href="https://postimages.org/" target="_blank"><img src="https://i.postimg.cc/W1GFzx17/03.png" alt="03"/></a>		 
            </td>
            <td>
               <a href="https://postimages.org/" target="_blank"><img src="https://i.postimg.cc/Bn9PqJ46/04.png" alt="04"/></a>
            </td>
        </tr>
</table>

[![case.png](https://i.postimg.cc/QNcH0RpZ/05.png)](https://postimg.cc/qgMJ7Db1)

														 

<b>Caso desborde #2</b><br>														 
El caso de desborde es admitido admitiendo números son números enteros que excedan 10^9= 1.000.000.000 por su valor absoluto.

<table>
        <tr>
            <th>Input</th>
            <th>Output</th>
        </tr>
        <tr>
            <td>
		<a href="https://postimages.org/" target="_blank"><img src="https://i.postimg.cc/D0cGDD46/06.png" alt="06"/></a>		 
            </td>
            <td>
               <a href="https://postimages.org/" target="_blank"><img src="https://i.postimg.cc/J73jGyYX/07.png" alt="07"/></a>
            </td>
        </tr>
</table>														 
														 

<b>Codigo</b><br>														 
														 
[![case.png](https://i.postimg.cc/HxtMVRWM/cod.png)](https://postimg.cc/CBz52vqM)									 
														 

															 
* <b> Count Distinct Integers </b>
Este problema narra que dado un número de n donde n es la cantidad de un conjunto de números, se debe imprimir la cantidad de números distintos del conjunto de número de entrada, es decir, se debe enviar como salida el conteo de números distintos dentro de un conjunto de datos.

Ejemplo 1:
* Entrada
* * <b> Cantidad:  6 </b>
* * <b> Numeros: 1 4 1 2 2 1 </b>
* * <b> Salida: 3 </b>

Ejemplo 2:
* Entrada
* * <b> Cantidad:  4 </b>
* * <b> Numeros: 1 1 2 1 </b>
* * <b> Salida: 2 </b>

Viendo el enunciado respecto a las salidas esperadas, ¿cómo se puede resolver este problema?

 Hash Set al Rescate

HashSet es una colección de estructura de datos de Set Interface, cuya característica destacada son:
HashSet no permite valores duplicados
HashSet no dispone de un criterio de ordenación para los valores almacenados

 ¿Cual es la ventaja?
Usando HashSet solo basta con preguntar cada uno de los elementos de la lista o entrada de datos que nos llegue para que únicamente almacene aquellos datos que no sean repetidos dentro de la colección


** Código de Java respecto a la solución del Ejercicio

[![1.jpg](https://i.postimg.cc/MKpD9pt6/1.jpg)](https://postimg.cc/qgWyR09S)


Hay que tener en cuenta que una vez agregado cada uno de los datos respecto al recorrido de este, se imprime como resultado el tamaño (Cantidad de datos) de la estructura HashSet.

Criterios de Aceptación

Para este Ejercicio, se define las siguientes restricciones:
Ell total de elementos respecto a los números que se desea contar debe ser 1≤N≤1000
Cada uno de los números de esta secuencia debe cumplir que su tamaño sea mayor o igual a 1 e inferior a 10-9.
Todos los valores de las entrada debe ser datos enteros
Desborde: Serán todos aquellos entradas que incumpla los criterios de aceptación-
Error: Si se envia una entrada vacía





* <b> Exact Sum </b>



## Herramientas

_Las herramientas utilizadas para el desarrollo del trabajo fueron:_
* [Java](https://www.java.com/es/) - Lenguaje de Programación
* [LeetCode](https://leetcode.com) - Plataforma Web
* [CodeForces](https://codeforces.com) - Plataforma Web
* [AtCoder](https://atcoder.jp/home) - Plataforma Web
* [OnlineJudge](https://onlinejudge.org/index.php) - Plataforma Web
* [Visual Studio Code](https://code.visualstudio.com) - Entorno de Desarrollo
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) - Entorno de Desarrollo
* [Netbeans](https://netbeans.apache.org) - Entorno de Desarrollo

<p
   align="center"><img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="64" height="64" margin-right: 20px><img src="https://cdn.cdo.mit.edu/wp-content/uploads/sites/67/2021/01/0_zuhXdNAIUoxEem4-.png" width="80" height="64" ><img src="https://codeforces.org/s/45303/images/codeforces-sponsored-by-ton.png" width="80" height="64" ><img src="https://img.atcoder.jp/assets/atcoder.png" width="80" height="64" ><img src="https://onlinejudge.org/templates/hm_yaml_2_5/img/ojlogo2.svg.png" width="80" height="64" ><img src="https://www.comparasoftware.com/wp-content/uploads/2018/08/logovisualstudiocode.png" width="80" height="64" ><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/250px-IntelliJ_IDEA_Icon.svg.png" width="80" height="64" ><img src="https://allpcworld.com/wp-content/uploads/2016/08/netbeans-free-download.png" width="80" height="64" >
</p>

## LinkDocumentacion
_Puedes visualizar la documentacion en el siguiente enlace:_
* [Estructuras de Datos Avanzadas](https://drive.google.com/file/d/1U7MBuLDSsiCenIQ1NFury-s4lbEC6bdO/view?usp=sharing)

## Autores
* CARLOS DUVAN LABRADOR H        - 1151808
* JUAN DIEGO CELIS BLANCO        - 1151876
* MARLON STIVEN PRADO R          - 1151914
* DOUGLAS ARLEY ALVAREZ O        - 1151923
* SAID FERNANDO LOPEZ G          - 1151925
* FREDDY SEBASTIAN CHIA VERA     - 1151494
* JUAN DIEGO BUITRAGO MARQUEZ    - 1151688
* JUAN DAVID CONTRERAS PABÓN     - 1151668


## Conclusiones
-El tener claros los conceptos y la información a trabajar, además de generar un análisis exhaustivo de las necesidades que debe cumplir los ejericicios y por qué medio se van a cumplir, son características fundamentales previo a la creación de código, si no se tiene claro que se va a realizar y que se ve gráficamente, no se puede tener claro cómo se va a ejecutar.

-La ventaja mas poderosa de los arboles binarios ordenados radica en la eficiencia de buscar elementos en él, dado que el recorrido siempre es directo hacia la rama donde se encuentra el elemento y asi se evita recorrer ramas que no aporten valor a la busqueda.





## Bibliografia
* Ejercicio tomado de tomado de la plataforma web <b> [LeetCode](https://leetcode.com/problems/complete-binary-tree-inserter/).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [LeetCode](https://leetcode.com/problems/binary-tree-inorder-traversal/).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [LeetCode](https://leetcode.com/problems/validate-binary-search-tree/).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [LeetCode](https://leetcode.com/problems/minimum-height-trees/).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [LeetCode](https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [LeetCode](https://leetcode.com/problems/find-if-path-exists-in-graph/).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [LeetCode](https://leetcode.com/problems/relative-ranks/).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [CodeForces](https://codeforces.com/problemset/problem/681/C).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [AtCoder](https://atcoder.jp/contests/abc240/tasks/abc240_b?lang=en).</b>
* Ejercicio tomado de tomado de la plataforma web <b> [OnlineJudge](https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1998).</b>
