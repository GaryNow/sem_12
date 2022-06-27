package padre;

public class Vehiculo {
	// Atributos Protegidos
	protected String marca,modelo,placa;

	// Constructor
	public Vehiculo(String marca, String modelo, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	// Datos del Vehículo
	public String datosCompletos() {
		return "Marca\t\t:  " + marca + "\n" +
			   "Modelo\t\t:  " + modelo + "\n" +
			   "Placa\t\t:  " + placa + "\n"+
			   	"Código generado\t:  " + codigoGenerado();
	}
	
	// Código generado
	private String codigoGenerado() {
		return marca+placa+modelo;
	}
}
