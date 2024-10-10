package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInfertaz {

	
	Scanner sc = new Scanner(System.in);
	
	public int menuGeneral() {
		
		System.out.println("MENU GENERALA");
		System.out.println("[0] -> Cerrar Aplicacion.");
		System.out.println("[1] -> Menu Empleado.");
		System.out.println("[2] -> Menu Gerencia.");

		int seleccionUsu = sc.nextInt();
		
		return seleccionUsu;
		
	}
	
	public int menuEmpleado() {
		System.out.println("MENU Empleado");
		System.out.println("[0] -> Subir un menu.");
		System.out.println("[1] -> Calculo ventas diarias.");
		System.out.println("[2] -> Añadir venta.");
		
		int seleccionUsu = sc.nextInt();
		
		return seleccionUsu;
	}
	
	
	public int menuGerencia() {
		System.out.println("MENU GERENCIA");
		System.out.println("[0] -> Subir un menu.");
		System.out.println("[1] -> Ventas Diarias.");
		System.out.println("[2] -> Crear nuevo pedido.");
		
		int seleccionUsu = sc.nextInt();
		
		return seleccionUsu;
	}
	
}
