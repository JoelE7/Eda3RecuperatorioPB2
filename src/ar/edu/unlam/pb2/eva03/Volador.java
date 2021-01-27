package ar.edu.unlam.pb2.eva03;

public class Volador extends Vehiculo {

	private Double altura;

	public Volador(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.altura = 0.0;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
