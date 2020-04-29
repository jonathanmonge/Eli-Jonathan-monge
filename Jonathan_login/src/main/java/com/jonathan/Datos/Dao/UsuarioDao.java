package com.jonathan.Datos.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jonathan.model.RUsuario;



public class UsuarioDao {
public List<RUsuario> RE_Usuarios(RUsuario usu){
	
	
	List<RUsuario> listaUsser = new ArrayList<>();
	EntityManager em;
	EntityManagerFactory emf;
	
	emf= Persistence.createEntityManagerFactory("Jonathan_login");
     em=emf.createEntityManager();
	try {
		
 em.getTransaction().begin();
 listaUsser=em.createQuery("FROM RUsuario as  r where r.usuario='"+usu.getUsuario()+"' and r.contra='"+usu.getContra()+"'").getResultList();
 
 
 em.getTransaction().commit();
 
} catch (Exception e) {
	// TODO: handle exception
System.out.println("saludos"+e);
}
return listaUsser;
}
		
}
