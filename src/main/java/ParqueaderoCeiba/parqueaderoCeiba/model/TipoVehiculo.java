package ParqueaderoCeiba.parqueaderoCeiba.model;

import java.io.Serializable;


public class TipoVehiculo implements Serializable {

	private Long idTipo;
	private String tipo;
	
	
	public TipoVehiculo(Long idTipo, String tipo) {
		super();
		this.idTipo = idTipo;
		this.tipo = tipo;
	}
	public TipoVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
