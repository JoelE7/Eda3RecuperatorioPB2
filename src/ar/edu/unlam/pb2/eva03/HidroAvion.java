package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Volador implements AcuaticoEspecialidad {

	private Double profundidad;

	public HidroAvion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

}
