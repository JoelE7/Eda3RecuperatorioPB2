package ar.edu.unlam.pb2.eva03;

public class VehiculoIncompatible extends Exception {

	public VehiculoIncompatible() {
		super("Este vehiculo es incompatible para esta batalla");
	}
	
	public VehiculoIncompatible(String mensaje) {
		super(mensaje);
	}
}
