import java.io.IOException;

public class ejecutarBash {

	public static void main(String[] args) throws InterruptedException {
		
		
		try {
			
			ProcessBuilder constructor = 
				new ProcessBuilder("bash", "/home/alumno/repos/psp-test/retorno.sh", "3");
			Process proceso = constructor.start(); 
			
			int retorno = proceso.waitFor();
			
			System.out.println(retorno);
			
			Thread.sleep(2000);
			
			constructor = 
				new ProcessBuilder(
				"bash", "/home/alumno/repos/psp-test/retorno.sh", Integer.toString(retorno));
			Process proceso2 = constructor.start();
			
			int retorno2 = proceso2.waitFor();
			
			System.out.println(retorno2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
