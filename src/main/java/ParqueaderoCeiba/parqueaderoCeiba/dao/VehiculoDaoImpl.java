package ParqueaderoCeiba.parqueaderoCeiba.dao;

import java.util.List;

import ParqueaderoCeiba.parqueaderoCeiba.model.Vehiculo;

public class VehiculoDaoImpl extends ParqueaderoSession implements VehiculoDao {

	private ParqueaderoSession parqueaderoSession;
	
	
	public VehiculoDaoImpl() {
		
		parqueaderoSession = new ParqueaderoSession();
	}

	@Override
	public void guardarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		parqueaderoSession.getSession().persist(vehiculo);
		parqueaderoSession.getSession().getTransaction().commit();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> obtenerTodosLosVehiculos() {
	
		
		return parqueaderoSession.getSession().createQuery("from Vehiculo").getResultList();
	}

	@Override
	public void eliminarVehiculoPorId(Long idVehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo obtenerVehiculoPorId(Long idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo obtenerVehiculoPorCilindraje(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

}
