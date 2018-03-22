package ParqueaderoCeiba.parqueaderoCeiba;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ParqueaderoCeiba.parqueaderoCeiba.dao.VehiculoDaoImpl;
import ParqueaderoCeiba.parqueaderoCeiba.model.TipoVehiculo;
import ParqueaderoCeiba.parqueaderoCeiba.model.Vehiculo;

@SpringBootApplication
public class ParqueaderoCeibaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParqueaderoCeibaApplication.class, args);
	
	
		
		TipoVehiculo tipoVehiculo = new TipoVehiculo(1L,"moto");
		Vehiculo vehiculo = new Vehiculo("5525",125,new Date(),tipoVehiculo);
		VehiculoDaoImpl vehiculoDaoImpl = new VehiculoDaoImpl();
		vehiculoDaoImpl.guardarVehiculo(vehiculo);
		
		List<Vehiculo> vehiculos = vehiculoDaoImpl.obtenerTodosLosVehiculos();
		
		for (Vehiculo v : vehiculos) {
			
			System.out.println("Placa "+ v.getPlaca());
		}
		
	}
}
