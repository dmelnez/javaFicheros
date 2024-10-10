package servicios;

import java.io.File;
import java.io.FileWriter;


public class ficherosImplementacion implements ficherosInterfaz {

	public void escribirFichero(String mensajeLog) {
		
		File fichero = new File("C:\\Users\\david\\Desktop\\ficheroLog.txt");
		
		try (FileWriter escribir = new FileWriter(fichero, true))
		{
			
			escribir.write(mensajeLog + "\n");
			escribir.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
