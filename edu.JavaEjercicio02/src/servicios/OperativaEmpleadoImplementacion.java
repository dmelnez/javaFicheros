package servicios;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;

public class OperativaEmpleadoImplementacion implements OperativaEmpleadoInterfaz {

	MenuInfertaz me = new MenuImplementacion();
	boolean esCerrar = false;
	
	public void opcionesEmpleado(List<VentaDto>listaVentas) {
		
		do {
			
			int seleccionUsuario = me.menuEmpleado();
			
			switch(seleccionUsuario) {
				case 0:
					System.out.println("[0] -> Subir un menu.");
					esCerrar = true;
					break;
				case 1:
					System.out.println("[1] -> Calculo ventas diarias.");
					break;
				case 2:
					System.out.println("[2] -> Añadir nueva venta.");
					nuevaVenta(listaVentas);
					break;
				default:
					System.err.println("[ALERT] -> Seleccion no valida.");
					break;
			
			}
			
		}
		
		while(!esCerrar);
		
	}
	
	private void nuevaVenta(List<VentaDto>listaVentas) {
		
		Scanner sc = new Scanner(System.in);
		
		VentaDto nuevaVenta = new VentaDto();
		
		
		
		System.out.println("Importe venta: ");
		
		double importe = sc.nextDouble();
		
		nuevaVenta.setImporte(importe);
		
		long idGenerado = autonumericoId(listaVentas);
		
		nuevaVenta.setId(idGenerado);
		
		listaVentas.add(nuevaVenta);
		
		for (VentaDto ventaDto : listaVentas) {
			System.out.println(ventaDto.getImporte());
			System.out.println(ventaDto.getId());
			System.out.println(ventaDto.getHoy());
		}
				
	}
	
	private long autonumericoId(List<VentaDto>listaVentas) {

		long idGenerado = 0;
		
		int tamanioLista = listaVentas.size();
		
		if(tamanioLista == 0) {
			idGenerado = 1;
		}
		
		else {
			idGenerado = listaVentas.get(tamanioLista - 1).getId() + 1;
		}
		
		
		return idGenerado;
	}
	
}
