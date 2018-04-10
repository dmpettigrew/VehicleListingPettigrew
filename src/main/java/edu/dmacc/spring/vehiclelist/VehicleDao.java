package edu.dmacc.spring.vehiclelist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class VehicleDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("VehicleList");
	
	public void insertVehicle(Vehicles vehicleToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(vehicleToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Vehicles> getAllVehicles() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select v from Vehicles v";
		TypedQuery<Vehicles> typedQuery = em.createQuery(q, Vehicles.class);
		List<Vehicles> all = typedQuery.getResultList();
		return all;
	}

}
