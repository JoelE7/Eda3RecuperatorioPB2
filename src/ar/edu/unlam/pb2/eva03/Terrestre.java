package ar.edu.unlam.pb2.eva03;

public class Terrestre extends Vehiculo {

	private Double velocidad;

	public Terrestre(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.velocidad = 0.0;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
