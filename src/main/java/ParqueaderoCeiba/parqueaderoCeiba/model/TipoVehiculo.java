package ParqueaderoCeiba.parqueaderoCeiba.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_vehiculo")
public class TipoVehiculo {

	@Id
	@Column(name="idTipo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTipo;
	
	@Column(name="tipo")
	private String tipo;
	@OneToMany(mappedBy="tipo")		
	private Set<Vehiculo> vehiculos;
	public TipoVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoVehiculo(String tipo) {
		super();
		this.tipo = tipo;
		
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
