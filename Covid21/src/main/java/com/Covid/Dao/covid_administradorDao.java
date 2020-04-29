package com.Covid.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Covid.Model.RAdministrador;

public class covid_administradorDao {
	
		public List<RAdministrador> LoginUser(RAdministrador adm){
			
			
			List<RAdministrador> ListaUser = new ArrayList<>();
			EntityManager em;
			EntityManagerFactory emf;
			
			emf= Persistence.createEntityManagerFactory("Covid21");
		     em=emf.createEntityManager();
			try {
				
		 em.getTransaction().begin();
		 ListaUser=em.createQuery("FROM  RAdministrador r where r.usuario='"+adm.getUsuario()+"' and r.contrasenia='"+adm.getContrasenia()+"'").getResultList();
		 
		 
		 em.getTransaction().commit();
		 
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("Error"+e);
		}
		return ListaUser;
		}
	}

	


