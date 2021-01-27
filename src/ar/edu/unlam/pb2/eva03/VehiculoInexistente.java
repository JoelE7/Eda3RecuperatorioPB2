package ar.edu.unlam.pb2.eva03;

public class VehiculoInexistente extends Exception{

	public VehiculoInexistente() {
		super("Este vehiculo no existe en la lista");
	}
	
	public VehiculoInexistente(String mensaje) {
		super(mensaje);
	}
	
	
	
}
