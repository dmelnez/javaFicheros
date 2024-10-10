package servicios;

import java.util.List;

public interface MenuInfertaz {

	/***
	 * Menu inicial de la aplicacion y recogera la seleccion del usuario.
	 * @author dmn - 081024
	 * @return seleccion del usuario 
	*/
	public int menuGeneral();
	
	
	/***
	 * Menu de empleado y recogera la seleccion del usuario.
	 * @author dmn - 081024
	 * @return seleccion del usuario 
	*/
	public int menuEmpleado();
	
	
	/***
	 * Menu de Gerencia y recogera la seleccion del usuario.
	 * @author dmn - 081024
	 * @return seleccion del usuario 
	*/
	public int menuGerencia();
	
	
}
