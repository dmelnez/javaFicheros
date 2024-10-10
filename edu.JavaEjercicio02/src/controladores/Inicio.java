package controladores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.AncestorEvent;

import dtos.VentaDto;
import servicios.FechasImplementacion;
import servicios.FechasInterfaz;
import servicios.FicheroListasImplementacion;
import servicios.FicheroListasInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInfertaz;
import servicios.OperativaEmpleadoImplementacion;
import servicios.OperativaEmpleadoInterfaz;
import servicios.OperativaGerenciaImplementacion;
import servicios.OperativaGerenciaInterfaz;
import servicios.ficherosImplementacion;
import servicios.ficherosInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInfertaz me = new MenuImplementacion();
		ficherosInterfaz fi = new ficherosImplementacion();
		FechasInterfaz fe = new FechasImplementacion();
		FicheroListasInterfaz fil = new FicheroListasImplementacion();
		
		OperativaEmpleadoInterfaz op = new OperativaEmpleadoImplementacion();
		OperativaGerenciaInterfaz opg = new OperativaGerenciaImplementacion();
		
		
		List<VentaDto>listaVentas = new ArrayList<VentaDto>();
		
		fil.listas();
		
		String mensajeLog = "a";
		
		mensajeLog = "Realizacion de fechas";
		
		fil.ficheroLog(mensajeLog);
		
		boolean esCerrar = false;
		
		String mensaje = "a";
		
		
		
		do {
			
			int seleccionUsu = me.menuGeneral();
			
			switch(seleccionUsu) {
			
			case 0:
				System.out.println("[INFO] -> Se cerrara la aplicacion");
				fe.fechasCompletas();
				
				mensaje = "Se cerrara la aplicaciones";
				fi.escribirFichero(mensaje);
				esCerrar = true;
				break;
				
			case 1:
				System.out.println("[INFO] -> Menu Empleado.");
				mensaje = "Menu Empleado";
				fi.escribirFichero(mensaje);
				op.opcionesEmpleado(listaVentas);
			
				break;
			case 2:
				System.out.println("[INFO] -> Menu Gerencia.");
				mensaje = "Menu Gerencia";
				fi.escribirFichero(mensaje);
				opg.opcionesGerencia(listaVentas);
			
				break;
				
			default:
				System.err.println("[ALERT] -> Seleccion no valida.");
				break;
			}
			
			
		}
		
		while(!esCerrar);
		
	}

}
