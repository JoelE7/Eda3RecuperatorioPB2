package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private String nombreBatalla;
	Set<Vehiculo> vehiculosEnLaBatalla;

	public Batalla(String nombreBatalla, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.tipo = tipo;
		this.nombreBatalla = nombreBatalla;
		this.latitud = latitud;
		this.longitud = longitud;
		vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}
	
	public Boolean enviar(Vehiculo vehiculo) {
		return vehiculosEnLaBatalla.add(vehiculo);
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public String getNombreBatalla() {
		return nombreBatalla;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public void setNombreBatalla(String nombreBatalla) {
		this.nombreBatalla = nombreBatalla;
	}

	
}
