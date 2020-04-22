package com.Jonathan.Controlador;

import java.io.IOException;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.Jonathan.Dao.ClienteDao;
import com.google.gson.Gson;

import com_Jonathan_model.Cliente;

/**
 * Servlet implementation class ServeletControler
 */
public class ServeletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cliente c= new Cliente();
		ClienteDao cli = new ClienteDao();
		
		String id=null;
		String nombre=null;
		String apellido=null;
		String edad=null;
		String direcion=null;
		String dui=null;
		String nit=null;
		String grupoDeClaseProgramacion3Alquepertenece=null;
		String ultimaNotaObtenidaEnProgramacion2=null;
		
		try {
			
		
		 id= request.getParameter("Id");
		 nombre= request.getParameter("Nombre");
         apellido= request.getParameter("Apellido");
		 edad= request.getParameter("Edad");
		 direcion= request.getParameter("Direcion");
		 dui= request.getParameter("Dui");
		 nit= request.getParameter("Nit");
		 grupoDeClaseProgramacion3Alquepertenece= request.getParameter("grupoDeClaseProgramacion3Alquepertenece");
         ultimaNotaObtenidaEnProgramacion2= request.getParameter("ultimaNotaObtenidaEnProgramacion2");
         
         c.setId(Integer.parseInt(id));
 		c.setNombre(nombre);
 		c.setApellido(apellido);
 		c.setEdad(Integer.parseInt(edad));
 		c.setDireccion(direcion);
 		c.setDui(dui);
 		c.setNit(nit);
 		c.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
 		c.setUltimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		}catch (Exception e) {
			// TODO: handle exception
		}
		String acction= request.getParameter("btn");
		
		if(acction.equals("Guardar")) {
			
		c.setId(Integer.parseInt(id));
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setEdad(Integer.parseInt(edad));
		c.setDireccion(direcion);
		c.setDui(dui);
		c.setNit(nit);
		c.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
		c.setUltimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		cli.agregarD(c);
		}
		else if(acction.equals("Actualizar")) {
		c.setId(Integer.parseInt(id));
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setEdad(Integer.parseInt(edad));
		c.setDireccion(direcion);
		c.setDui(dui);
		c.setNit(nit);
		c.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
		c.setUltimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		

		
		cli.Actualizar(c);
		}
		
		else if(acction.equals("ELIMINAR")) {
			c.setId(Integer.parseInt(id));
			cli.EliminarD(c);
			
		}
			response.sendRedirect("index.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
ClienteDao clien=new ClienteDao();

Gson json= new Gson();
try {
	response.getWriter().append(json.toJson(clien.clienteLista()));
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
	
}
}
}
