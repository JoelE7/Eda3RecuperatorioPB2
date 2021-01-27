package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		convoy = new TreeSet<Vehiculo>();
		batallas = new HashMap<String, Batalla>();
	}

	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		return convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String nombreBatalla, TipoDeBatalla batalla, Double latitud, Double longitud) {
		batallas.putIfAbsent(nombreBatalla, new Batalla(nombreBatalla, batalla, latitud, longitud));
	}

	public Batalla getBatalla(String nombreBatalla) {
		return batallas.get(nombreBatalla);
	}

	public Boolean enviarALaBatalla(String nombreBatalla, Integer codigoVehiculo)
			throws VehiculoInexistente, VehiculoIncompatible {
		Vehiculo aenviar = null;
		Batalla batalla = batallas.get(nombreBatalla);
		for (Vehiculo vehiculo : convoy) {
			if (vehiculo.getCodigo().equals(codigoVehiculo)) {
				aenviar = vehiculo;
				break;
			}
		}
		if (aenviar != null) {
			switch (batalla.getTipo()) {
			case TERRESTRE:
				if (aenviar instanceof Terrestre
						|| aenviar instanceof Terrestre && aenviar instanceof AcuaticoEspecialidad
						|| aenviar instanceof Acuatico && aenviar instanceof TerrestreEspecialidad) {
					return batalla.enviar(aenviar);
				} else {
					throw new VehiculoIncompatible();
				}
			case NAVAL:
				if (aenviar instanceof Acuatico
						|| aenviar instanceof Terrestre && aenviar instanceof AcuaticoEspecialidad
						|| aenviar instanceof Acuatico && aenviar instanceof TerrestreEspecialidad
						|| aenviar instanceof Volador && aenviar instanceof AcuaticoEspecialidad) {
					return batalla.enviar(aenviar);
				} else {
					throw new VehiculoIncompatible();
				}
			case AEREA:
				if (aenviar instanceof Volador
						|| aenviar instanceof Volador && aenviar instanceof AcuaticoEspecialidad) {
					return batalla.enviar(aenviar);
				} else {
					throw new VehiculoIncompatible();
				}
			default:
				break;
			}
		} else {
			throw new VehiculoInexistente();
		}

		return false;
	}

}
