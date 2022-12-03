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

[![1.png](https://i.postimg.cc/htMS8MCZ/1.png)](https://postimg.cc/bZDcp0f1)

Es importante destacar su peculiar característica es que ademas tener todos sus niveles completos, excepción de ultimo,  este último nivel también debe tener por lo menos, un nodo completo como la imagen anterior, es decir, tenga 2 hijos (sub izquierdo – sobre derecho), la siguiente ilustración, es un árbol que no es un árbol binario completo.

[![2.png](https://i.postimg.cc/Qx25GNhZ/2.png)](https://postimg.cc/YhxjQHvd)

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



* <b> Validate Binary Search Tree </b>



* <b> Minimum Height Trees </b>



* <b> Find a Corresponding Node of a Binary Tree in a Clone of That Tree </b>


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


* <b> Heap Operations </b>


* <b> Count Distinct Integers </b>
Este problema narra que dado un número de n donde n es la cantidad de un conjunto de números, se debe imprimir la cantidad de números distintos del conjunto de número de entrada, es decir, se debe enviar como salida el conteo de números distintos dentro de un conjunto de datos.

Ejemplo 1:
 Entrada
	<b> Cantidad:  6 </b>
	<b> Numeros: 1 4 1 2 2 1 </b>
	<b> Salida: 3 </b>

Ejemplo 2:
 Entrada
 	<b> Cantidad:  4 </b>
	<b> Numeros: 1 1 2 1 </b>
	<b> Salida: 2 </b>

Viendo el enunciado respecto a las salidas esperadas, ¿cómo se puede resolver este problema?

 Hash Set al Rescate

HashSet es una colección de estructura de datos de Set Interface, cuya característica destacada son:
HashSet no permite valores duplicados
HashSet no dispone de un criterio de ordenación para los valores almacenados

 ¿Cual es la ventaja?
Usando HashSet solo basta con preguntar cada uno de los elementos de la lista o entrada de datos que nos llegue para que únicamente almacene aquellos datos que no sean repetidos dentro de la colección












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

## Link Documentacion
_Puedes visualizar la documentacion en el siguiente enlace:_
* [Estructuras de Datos Avanzadas](https://docs.google.com/document/d/1Ma7m8LJi-to-mIbwQUqiZn7nPVZ15DTNiw-7SEFUoU4/edit?usp=sharing)

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
