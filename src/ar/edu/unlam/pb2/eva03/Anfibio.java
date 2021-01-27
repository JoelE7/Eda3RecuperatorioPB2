package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Acuatico implements TerrestreEspecialidad {

	private Double velocidad;

	public Anfibio(Integer codigo, String modelo) {
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
