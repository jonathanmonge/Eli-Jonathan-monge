package com.jonathan.Datos.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jonathan.model.TbHistorial;


public class HistoryDao {
	public List<TbHistorial> ListaHistorial(){
		
		List<TbHistorial> listaCl = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		
		emf= Persistence.createEntityManagerFactory("Jonathan_login");
	     em=emf.createEntityManager();
		try {
			
	 em.getTransaction().begin();
	 listaCl=em.createQuery("select from TbHistorial").getResultList();
	 
	 em.getTransaction().commit();
	 
	} catch (Exception e) {
		// TODO: handle exception
	System.out.println("saludos"+e);
	}
	return listaCl;
	}
}
