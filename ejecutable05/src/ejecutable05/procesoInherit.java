package ejecutable05;

import java.io.IOException;

public class procesoInherit {

	public static void main(String[] args) {
		
		try {
			
			ProcessBuilder constructor = new ProcessBuilder("cat", "/proc/timer_lis");
			constructor.inheritIO();
			//constructor.redirectError();
			Process p1 = constructor.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
			
	

	}

}
