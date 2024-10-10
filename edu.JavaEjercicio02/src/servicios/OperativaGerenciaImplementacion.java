package servicios;

import java.awt.Menu;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;

public class OperativaGerenciaImplementacion implements OperativaGerenciaInterfaz {

	MenuInfertaz me = new MenuImplementacion();
	boolean esCerrar = false;
	
	public void opcionesGerencia(List<VentaDto>listaVentas) {
		
		do {
			
			int seleccionUsuario = me.menuGerencia();
			
			switch(seleccionUsuario) {
				case 0:
					System.out.println("[0] -> Subir un menu.");
					esCerrar = true;
					break;
				case 1:
					System.out.println("[1] -> Ventas Diarias.");
					ventasDiarias(listaVentas);
					break;
				case 2:
					System.out.println("[2] -> Crear nuevo pedido.");
					
					break;
				default:
					System.err.println("[ALERT] -> Seleccion no valida.");
					break;
			
			}
			
		}
		
		while(!esCerrar);
	}
	
	public void ventasDiarias(List<VentaDto>listaVentas) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una fecha (dd/MM/yyyy): ");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String entrada = sc.nextLine();
		
		LocalDate fecha = LocalDate.parse(entrada, formatter);
		
		for (VentaDto ventaDto : listaVentas) {
			if (fecha.getDayOfYear() == ventaDto.getHoy().getDayOfYear()) {
				System.out.println("Venta número: " + ventaDto.getId());
				System.out.println("Euros: " + ventaDto.getImporte());
				System.out.println("Instante de compra: " + ventaDto.getHoy());
			}
		}

		
	}
	
	
}
