package ParqueaderoCeiba.parqueaderoCeiba;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ParqueaderoCeiba.parqueaderoCeiba.model.TipoVehiculo;
import ParqueaderoCeiba.parqueaderoCeiba.model.Vehiculo;

@SpringBootApplication
public class ParqueaderoCeibaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParqueaderoCeibaApplication.class, args);
	
	
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		TipoVehiculo tipoVehiculo = new TipoVehiculo(1L,"carro");
		Vehiculo vehiculo = new Vehiculo("1234",200,new Date(),tipoVehiculo);
		session.beginTransaction();
		session.save(vehiculo);
		session.getTransaction().commit();
	}
}
