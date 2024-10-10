package servicios;



import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FicheroListasImplementacion implements FicheroListasInterfaz {

	Scanner sc = new Scanner(System.in);	
	public void listas() {
		
		List<Date>listaFechas = new ArrayList<Date>();
		
		System.out.println("Introduzca una fecha: ");
		String fechaIntro = sc.nextLine();
		
		System.out.println("Introduzca otra fecha: ");
		String fechaIntro01 = sc.nextLine();
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			Date fechaParseada = formatoFecha.parse(fechaIntro);
			
			Date fecha01 = formatoFecha.parse(fechaIntro01);
			listaFechas.add(fecha01);
			
			listaFechas.add(fechaParseada);
			
			System.out.println(fechaParseada);
			
			System.out.println("Fecha a Buscar: ");
			String fechaABuscar = sc.nextLine();
			
			Date fechaABuscarParseada = formatoFecha.parse(fechaABuscar);
			
			for (Date fech : listaFechas) {
				if (fech.getDay() == fechaABuscarParseada.getDay() & fech.getMonth() == fechaABuscarParseada.getMonth() & fech.getYear() == fechaABuscarParseada.getYear()) {
					System.out.println("Fecha encontrada.");
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void ficheroLog(String mensajeLog) {
		
		String rutaFichero = "C:\\Users\\david\\Desktop\\listas.txt";
		
		File fichero = new File(rutaFichero);
		
		try (FileWriter escribirFicher = new FileWriter(fichero, true))
		{
			
			escribirFicher.write(mensajeLog + "\n");
			escribirFicher.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
