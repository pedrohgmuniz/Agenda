package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ResourcePersistence {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Agenda");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
