package ar.edu.unlam.pb2.eva03;

public abstract class Vehiculo {

	protected String modelo;
	protected Integer codigo;
	
	public Vehiculo(Integer codigo,String modelo) {
		this.codigo=codigo;
		this.modelo=modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
