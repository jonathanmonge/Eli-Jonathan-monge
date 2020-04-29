package com.Covid.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Covid.Model.RDui;



public class Covid_Dao {

	public List<RDui> VerficarDui(RDui usu){
		
		
		List<RDui> listaUsser = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		
		emf= Persistence.createEntityManagerFactory("Covid21");
	     em=emf.createEntityManager();
		try {
			
	 em.getTransaction().begin();
	 listaUsser=em.createQuery("FROM  RDui r where r.numero_Dui='"+usu.getNumero_Dui()+"'").getResultList();
	 
	 
	 em.getTransaction().commit();
	 
	} catch (Exception e) {
		// TODO: handle exception
	System.out.println("saludos"+e);
	}
	return listaUsser;
	}
}
