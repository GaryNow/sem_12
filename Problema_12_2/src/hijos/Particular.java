package hijos;

import padre.Licencia;

public class Particular extends Licencia{
	// Atributo privado
	private int dni;

	// Constructor
	public Particular(String clase, String categoria, String fechaEmision, String fechaRenovacion, int dni) {
		super(clase, categoria, fechaEmision, fechaRenovacion);
		this.dni = dni;
	}
	
	public String datosLicenciaParticular() {
		return	datosDelBrevete() + "\n" +
				"2do Código\t: "+ segundoCodigo() ;
	}
	
	public String segundoCodigo() {
		return categoria + dni;
	}
}
