package com.jonathan.Datos.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jonathan.model.TbHistorial;




public class HistoryDao {
	public List<Object> ListaHistorial(){
		
		List<Object> listah= new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		
		emf= Persistence.createEntityManagerFactory("Jonathan_login");
	     em=emf.createEntityManager();
		try {
			
	 em.getTransaction().begin();
	 listah=em.createQuery("SELECT t.idHistorial,t.RUsuario.idUsuarios,t.fecha, "
	 		+ " r.nombre_usuario"
			 +" FROM TbHistorial  AS t"
			 +" INNER JOIN RUsuario AS  r ON r.idUsuarios = t.RUsuario.idUsuarios").getResultList();
	 
	 em.getTransaction().commit();
	 
	} catch (Exception e) {
		// TODO: handle exception
	System.out.println("saludos"+e);
	}
	return listah;
	}
	
	public void agregarD(TbHistorial h) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("Jonathan_login");
	     em=emf.createEntityManager();
		
	     em.getTransaction().begin();
			em.persist(h);
			em.flush();
			em.getTransaction().commit();
	
	}
	
	public void EliminarD(TbHistorial h) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("Jonathan_Crud");
		   em=emf.createEntityManager();
		   h= em.getReference(TbHistorial.class,h.getIdHistorial());
		   em.getTransaction().begin();
		em.remove(h);
		
		em.flush();

		em.getTransaction().commit();
	}
}
