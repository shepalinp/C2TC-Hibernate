package com.cg.jpacrud.Dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

private static EntityManagerFactory factory;
private static EntityManager entityManager;

static {
	factory=Persistence.createEntityManagerFactory("JPA-PU");
}
	public static EntityManager getEntitymanager()
	{
		if(entityManager==null||!entityManager.isOpen()) {
			entityManager=factory.createEntityManager();
		}
		return entityManager;
	}
	

	}

