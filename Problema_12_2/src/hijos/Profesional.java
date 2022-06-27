package hijos;

import padre.Licencia;

public class Profesional extends Licencia{
	private String ruc;

	public Profesional(String clase, String categoria, String fechaEmision, String fechaRenovacion, String ruc) {
		super(clase, categoria, fechaEmision, fechaRenovacion);
		this.ruc = ruc;
	}
	
	public String datosLicenciaProfesional() {
		return	datosDelBrevete() + "\n" +
				"2do Código\t: "+ segundoCodigo() ;
	}
	
	public String segundoCodigo() {
		return categoria + ruc;
	}
}
