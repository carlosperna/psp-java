package ejecutable03;

import java.io.IOException;

public class Processbuilder {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ProcessBuilder constructor = new ProcessBuilder("firefox");
		Process firefox = constructor.start();
		
		//sleep: detiene la ejecución (sin afectar al procesador)
		Thread.sleep(3000); 
		
		if(firefox.isAlive()) {
			System.out.println("El proceso esta vivo y con el pid: " + firefox.pid());
		} else {
			System.out.println("El proceso esta muerto");
		}
		
		firefox.destroy();
		
	}

}
