package servicios;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FechasImplementacion implements FechasInterfaz {

	public void fechasCompletas() {
		
		List<Date>listaFecha = new ArrayList<Date>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una fecha en formato (dd/MM/yyyy)");
	    String fechaString = sc.nextLine();
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			 Date fecha = formatoFecha.parse(fechaString);
			 
			 listaFecha.add(fecha);
			 
			 String fechaFormateadaString = formatoFecha.format(fecha);
			
			 listaFecha.add(fecha);
			
				
				 System.out.println("Fecha a buscar (dd/MM/yyyy)");
				 String fechaIntro = sc.next();
				 
				 Date fechaABuscar = formatoFecha.parse(fechaIntro);
				 
				 for (Date fechaBuscada : listaFecha) {
					if(fechaBuscada.getDay() == fechaABuscar.getDay() & fechaBuscada.getMonth() == fechaABuscar.getMonth() & fechaBuscada.getYear() == fechaABuscar.getYear()) {
						
						System.out.println("fecha encontrada");
						System.out.println(fechaBuscada);
					}
				}
				 
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
