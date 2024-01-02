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

## Desarrollo en Java

Por último quedaba realizar el desarrollo en java por lo que modificando el código puesto a disposición con lo aprendido en weka
realicé el modelo de predcción.

### Instalación

  

__1. Clonar este repositorio en su dispositivo para acceder al programa.__

  

```

git  clone https://github.com/roberccv/rcv_ArbolDecision.git

```

__2. Para inicializar el programa desde la terminal del ordenador cree el archivo JAR:__

 

```

 make jar

```

__3. Ejecute el programa:__

 

```

 java -jar aprendizaje.jar

```


## Modo de uso:

Para realizar consultas al modelo, se debe modificar el archivo "test_data/test.arff" indicando los atributos correspondientes y añadiendo una interrogación en el último, 
siendo el programa el que tras ejecutarse indicaría si ha detectado phishing en dicha página web.

## Licencia

  

[Apache](https://www.apache.org/licenses/LICENSE-2.0)

  

![Licencia](https://licensebuttons.net/l/by/3.0/88x31.png "Licencia")

  

## Autor

**Roberto Cinos Vega** (roberto.cinosvega@usp.ceu.es)


