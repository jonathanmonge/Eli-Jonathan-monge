package com.Covid.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Covid.Model.RAdministrador;
import com.Covid.Model.RDui;



public class TablaDao {

	public List<RAdministrador> DuiLista(){
		
		List<RAdministrador> listaCl = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		
		emf= Persistence.createEntityManagerFactory("Covid21");
	     em=emf.createEntityManager();
		try {
			
	 em.getTransaction().begin();
	 listaCl=em.createQuery("from RDui").getResultList();
	 
	 em.getTransaction().commit();
	 
	} catch (Exception e) {
		// TODO: handle exception
	System.out.println("saludos"+e);
	}
	return listaCl;
	}
	public void agregarD(RDui c) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("Covid21");
	     em=emf.createEntityManager();
		
	     em.getTransaction().begin();
			em.persist(c);
			em.flush();
			em.getTransaction().commit();
		

		
		
	}
	public void Actualizar(RDui c) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("Covid21");
		   em=emf.createEntityManager();
		c.getNombre();
		c.getApellido();
		c.getIdUsuarios();
		c.getNumero_Dui();
		
		
		
		em.getTransaction().begin();
			em.merge(c);
			
			em.flush();
		
			em.getTransaction().commit();
		
	}

	public void EliminarD(RDui c) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("Covid21");
		   em=emf.createEntityManager();
		   c= em.getReference(RDui.class,c.getIdUsuarios());
		   em.getTransaction().begin();
		em.remove(c);
		
		em.flush();

		em.getTransaction().commit();
	}
}