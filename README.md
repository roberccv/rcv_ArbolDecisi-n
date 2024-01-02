## Práctica Árboles de Decisión

## Pasos Previos

En primer lugar debía modificar el data-set (.csv) ya que tenía muchos atributos, por lo que para quedarme con
los más importantes utilicé la herramienta "Select attributes" de weka, obteniendo una lista dordenada por la importancia
de todos los atributos en el resultado. 
![image text](https://github.com/roberccv/rcv_ArbolDecision/blob/main/imagenes/selección.png)

Por lo tanto me quede con los 15 más importantes:
![image text](https://github.com/roberccv/rcv_ArbolDecision/blob/main/imagenes/atributos.png)

Una vez realizados esto paso quedaba decidir cual era el mejor árbol de decisión por lo que tras probar con weka,
el algoritmo con menor indice de error (atributo "Incorrectly Classified Instances") era Random Forest (siendo por consecuencia
"Correctly Classified Instances", la tasa de éxito la más alta).
Estos indices de error eran:

J48 -> 3,14%
**RandomForest -> 2,39%**
RandomTree -> 4,1%
LMT -> 3,42%
REPtree -> 3,74%
DecisionStump -> 22,83%
HoeffdingTree -> 13,69%


