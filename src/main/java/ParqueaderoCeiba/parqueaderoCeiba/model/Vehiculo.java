package ParqueaderoCeiba.parqueaderoCeiba.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo implements Serializable{
	@Id
	@Column(name="idvehiculo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idvehiculo;	
	@Column(name="placa")
	private String placa;
	@Column(name="cilindraje")
	private int cilindraje;	

	@ManyToOne
	@JoinColumn(name="tipo_vehiculo")
	private TipoVehiculo tipo;
	//@ManyToOne(optional= true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="parqueadero_idparqueadero")
	private Parqueadero parqueadero;

	
	public Vehiculo( String placa, int cilindraje, TipoVehiculo tipo) {
		super();
		this.placa = placa;
		this.cilindraje = cilindraje;
		this.tipo = tipo;
	
	}
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdvehiculo() {
		return idvehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	public TipoVehiculo getTipo() {
		return tipo;
	}

	
	
	
}
