package ParqueaderoCeiba.parqueaderoCeiba.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="parqueadero")
public class Parqueadero implements Serializable{
	@Id
	@Column(name="parqueadero")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idParqueadero;
	@Column(name="fecha_entrada")
	private Date fechaEntrada;
	@Column(name="fecha_salida")
	private Date fechaSalida;
	//@OneToMany(cascade= CascadeType.ALL)
	@OneToMany(mappedBy="parqueadero")		
	private Set<Vehiculo> vehiculos;
	
	public Parqueadero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parqueadero(Date fechaEntrada, Date fechaSalida) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
	
		
	}
	public Long getIdParqueadero() {
		return idParqueadero;
	}
	public void setIdParqueadero(Long idParqueadero) {
		this.idParqueadero = idParqueadero;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	
	
	
	
	
	

}
