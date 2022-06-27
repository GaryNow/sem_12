package padre;

public class Licencia {
	// Atributos protegidos
	protected String clase,categoria,fechaEmision,fechaRenovacion;

	// Constructor
	public Licencia(String clase, String categoria, String fechaEmision, String fechaRenovacion) {
		this.clase = clase;
		this.categoria = categoria;
		this.fechaEmision = fechaEmision;
		this.fechaRenovacion = fechaRenovacion;
	}
	
	public String datosDelBrevete() {
		return "Clase\t\t: " + clase + "\n" +
				"Categoria\t\t: " + categoria + "\n" +
				"Fecha de Emisión\t: " + fechaEmision + "\n" +
				"Código generado\t: " + codigoGenerado();
	}
	
	private String codigoGenerado() {
		return clase + fechaEmision;
	}
}
