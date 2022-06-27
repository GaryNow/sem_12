package hijos;

import padre.Vehiculo;

public class Camioneta extends Vehiculo{
	// Atributo privado
	private double precio;

	// Constructor
	public Camioneta(String marca, String modelo, String placa, double precio) {
		super(marca, modelo, placa);
		this.precio = precio;
	}
	
	public String datosCompletos() {
		return super.datosCompletos() + "\n" +
				"Precio\t\t:  " + precio + "\n" +
				"Pagar\t\t:  " + aPagar();
	}
	
	public double aPagar() {
		return precio*0.8;
	}
}
