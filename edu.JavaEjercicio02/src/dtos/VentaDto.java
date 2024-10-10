package dtos;

import java.sql.Date;
import java.time.LocalDateTime;


/***
 * 
 */

public class VentaDto {
	
	long id;
	
	double importe = 99999;
	
	LocalDateTime hoy = LocalDateTime.now();
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public LocalDateTime getHoy() {
		return hoy;
	}


	public void setHoy(LocalDateTime hoy) {
		this.hoy = hoy;
	}


	
	public VentaDto(long id, double importe, LocalDateTime hoy) {
		super();
		this.id = id;
		this.importe = importe;
		this.hoy = hoy;
	}
	

	public VentaDto() {
		super();
	}
	

}
