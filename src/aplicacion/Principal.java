/*Copyright 2021 Pedro Bereilh Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless 
required by applicable law or agreed to inwriting, software distributed under the License is distributed on an "AS IS" 
BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language 
governing permissions andlimitations under the License.*/

package aplicacion;

import mates.*;

/**
 * La única responsabilidad de esta clase es iniciar el programa
 * mediante la interfaz de texto de la consola de Linux y recibir un valor que es el número de pasos o intentos.
 */

public class Principal{

public static void main(String[] args) {
	
	long pasos = Long.parseLong(args[0]);
	
	System.out.println("Pi es: " + Matematicas.generarPi(pasos)); 

	}
}