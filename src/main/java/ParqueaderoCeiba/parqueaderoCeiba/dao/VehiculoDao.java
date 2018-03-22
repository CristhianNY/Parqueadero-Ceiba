package ParqueaderoCeiba.parqueaderoCeiba.dao;

import java.util.List;

import ParqueaderoCeiba.parqueaderoCeiba.model.Vehiculo;

public interface VehiculoDao {

	void guardarVehiculo(Vehiculo vehiculo);
	
	List<Vehiculo> obtenerTodosLosVehiculos();
	
	void eliminarVehiculoPorId(Long idVehiculo);
	
	void actualizarVehiculo(Vehiculo vehiculo);
	
    Vehiculo obtenerVehiculoPorId(Long idVehiculo);
    
    Vehiculo obtenerVehiculoPorCilindraje(String  placa );
	
}
