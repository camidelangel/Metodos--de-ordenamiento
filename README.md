# Tarea 2 - Unidad 5
## Conclusión de QuickSort y Complementación de ShellSort

## Descripción

Este proyecto contiene la implementación en Java de dos
algoritmos de ordenamiento interno: QuickSort y ShellSort.

El objetivo es concluir la implementación del algoritmo
QuickSort y completar el código base de ShellSort,
comprobando que ambos métodos ordenen correctamente
un arreglo de números enteros de forma ascendente.

## Algoritmos implementados

### 1. QuickSort

Utiliza la técnica divide y vencerás. Selecciona un pivote,
divide el arreglo en dos partes y ordena recursivamente
los elementos menores o iguales y los mayores al pivote.

Se implementa utilizando el esquema de partición Lomuto,
seleccionando como pivote el último elemento del subarreglo.

### 2. ShellSort

Es una optimización del ordenamiento por inserción.
Compara elementos separados por intervalos (gaps),
los cuales se reducen progresivamente hasta llegar a 1.

Se utiliza un intervalo inicial de n/2 que se divide
entre 2 en cada iteración.

## Estructura del proyecto

```text
src/
│   └── Metodos_de_ordenamiento/
│       ├── QuickSort.java
│       ├── ShellSort.java
│       └── Main.java
│
└── README.md
```

## Requisitos

- Tener instalado Java JDK.
- Contar con un IDE o terminal para compilar y ejecutar Java.
- Tener Git instalado para clonar el repositorio.

## Clonar el repositorio

Abrir una terminal y ejecutar:

```bash
git clone https://github.com/camidelangel/Metodos--de-ordenamiento.git
```

Entrar a la carpeta del proyecto:

```bash
cd Metodo_de_ordenamiento
```

## Compilación

Desde la carpeta principal del proyecto, ejecutar:

```bash
javac -d out src/Metodos_de_ordenamiento/*.java
```

## Ejecución

Ejecutar la clase principal con el siguiente comando:

```bash
java -cp out Metodos_de_ordenamiento.Main
```

## Pruebas realizadas

Se utiliza el siguiente arreglo inicial:

```text
[60, 11, 52, 83, 34, 25, 76, 47]
```

Los dos algoritmos deben producir el siguiente resultado:

```text
[11, 25, 34, 47, 52, 60, 76, 83]
```

## Conclusión

La práctica permitió implementar y comprobar dos algoritmos
de ordenamiento interno. QuickSort utiliza particiones
y recursividad, mientras que ShellSort utiliza intervalos
que se reducen progresivamente.

Ambos algoritmos lograron ordenar correctamente el arreglo
de prueba, permitiendo observar sus diferencias en cuanto
a funcionamiento, complejidad y uso de memoria.
