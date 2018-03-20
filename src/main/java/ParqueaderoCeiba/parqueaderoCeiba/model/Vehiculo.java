package ParqueaderoCeiba.parqueaderoCeiba.model;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	private Long idCarro;
	private String placa;
	private int cilindraje;	
	
	public Vehiculo(Long idCarro, String placa, int cilindraje) {
		super();
		this.idCarro = idCarro;
		this.placa = placa;
		this.cilindraje = cilindraje;
	}
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Long idCarro) {
		this.idCarro = idCarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	
	
}
