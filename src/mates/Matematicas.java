/*Copyright 2021 Pedro Bereilh Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless 
required by applicable law or agreed to inwriting, software distributed under the License is distributed on an "AS IS" 
BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language 
governing permissions andlimitations under the License.*/

package mates; 

/**
* Clase responsable de aproximar pi 
*/

public class Matematicas{

/**
* Función de aproximar o generar Pi(3.14) usando el método de Montecarlo y generando puntos aleatorios en un cuadrado 
* que contiene un círculo dentro y calculamos los aciertos dentro de ese círculo que al despejar la formula 
* obtenemos una aproximación de pi.
*@return estimación de pi   
*/
public static double generarPi(long pasos){

int aciertos = 0;

	for (int i = 0; i < pasos; i++) {

		double x = Math.random()*2 - 1;
		double y = Math.random()*2 - 1;
		double d = Math.sqrt(x*x + y*y);

			if (d <= 1) {

				aciertos++;

			}

		}
    //Simplificación de la formula para obtener pi radio = 1 y áreaCuadrado = 4
	return 4 * (aciertos/(double)pasos); //Radio es uno no cambia nada 

	}
}

