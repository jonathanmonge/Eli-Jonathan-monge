 package com.Jonathan.Dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com_Jonathan_model.Cliente;
public class ClienteDao {
public List<Cliente> clienteLista(){
	
	List<Cliente> listaCl = new ArrayList<>();
	EntityManager em;
	EntityManagerFactory emf;
	
	emf= Persistence.createEntityManagerFactory("Jonathan_Crud");
     em=emf.createEntityManager();
	try {
		
 em.getTransaction().begin();
 listaCl=em.createQuery("from Cliente").getResultList();
 
 em.getTransaction().commit();
 
} catch (Exception e) {
	// TODO: handle exception
System.out.println(e);
}
return listaCl;
}
public void agregarD(Cliente c) {
	EntityManager em;
	EntityManagerFactory emf;
	emf= Persistence.createEntityManagerFactory("Jonathan_Crud");
     em=emf.createEntityManager();
	
     em.getTransaction().begin();
		em.persist(c);
		em.flush();
		em.getTransaction().commit();
	

	
	
}
public void Actualizar(Cliente c) {
	EntityManager em;
	EntityManagerFactory emf;
	emf= Persistence.createEntityManagerFactory("Jonathan_Crud");
	   em=emf.createEntityManager();
	c.getId();
	c.getNombre();
	c.getApellido();
	c.getEdad();
	c.getDireccion();
	c.getDui();
	c.getNit();
	c.getGrupoDeClaseProgramacion3Alquepertenece();
	c.getUltimaNotaObtenidaEnProgramacion2();
	
	em.getTransaction().begin();
		em.merge(c);
		
		em.flush();
	
		em.getTransaction().commit();
	
}

public void EliminarD(Cliente c) {
	EntityManager em;
	EntityManagerFactory emf;
	emf= Persistence.createEntityManagerFactory("Jonathan_Crud");
	   em=emf.createEntityManager();
	   c= em.getReference(Cliente.class,c.getId());
	   em.getTransaction().begin();
	em.remove(c);
	
	em.flush();

	em.getTransaction().commit();
}
}
