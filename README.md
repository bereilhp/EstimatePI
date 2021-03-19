# README #

Copyright 2021 Pedro Bereilh Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless 
required by applicable law or agreed to inwriting, software distributed under the License is distributed on an "AS IS" 
BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language 
governing permissions andlimitations under the License.

# Notas para los usuarios

## Compilación del programa

Se ejecuta la siguiente instrucción:

~~~~
make jar
~~~~

## Como aproximar pi 

Permite ejecutar las instrucciones que se muestran a continuación:

1. Aproximar Pi: 

~~~~
 java -jar mates.jar (introducir un número como el ejemplo siguiente)
~~~~

~~~~
 java -jar mates.jar 100000
~~~~

Este es un ejemplo pero podemos introducir cualquier número. El número introducido es el número de intentos o de pasos que sera pasado a la función entre más grande más nos aproximamos a pi con mayor precisión.

# Notas para los desarrolladores

## Generación de Javadoc

Se ejecuta la siguiete instrucción:

~~~~
make javadoc
~~~~

## Inspección de Javadoc

Suponiendo que tiene instalado `firefox`, se ejecuta:

~~~~
firefox html/index.html
~~~~

O también se puede usar 

~~~~
open html/index.html
~~~~


## Sobre el fichero _makefile_

Se han utilizado sentencias específicas de Linux, por tanto, sólo
ejecuta en este sistema operativo.
