package ejecutable02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lanzarPrograma {

	public static void main(String[] args) throws IOException {
		
		//conectamos un reader (lector) a la salida del proceso
		Process proceso = Runtime.getRuntime().exec("ls");
		BufferedReader salida = new BufferedReader(
				new InputStreamReader(proceso.getInputStream()));

		//mientras haya datos en la salida, léelos de linea en linea
		//e imprimelos por la salid estandar
		while(salida.ready()) {
			System.out.println(salida.readLine());
		}
		
	}

}
