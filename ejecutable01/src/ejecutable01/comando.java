package ejecutable01;

import java.io.IOException;
import java.util.concurrent.Executors;

public class comando {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println(System.getProperty("os.name"));
		
		Process proceso;
			
		proceso = Runtime.getRuntime().exec("ls -l");
		
		StreamGobbler sg = new StreamGobbler(proceso.getInputStream(), 
				System.out::println);
		
		Executors.newSingleThreadExecutor().submit(sg);
		int exitCode = proceso.waitFor();

		System.out.println("Código de finalización de proceso: " + exitCode);
	}

}
