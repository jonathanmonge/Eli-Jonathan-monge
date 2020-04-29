package com.Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Covid.Dao.Covid_Dao;
import com.Covid.Dao.TablaDao;
import com.Covid.Model.RDui;
import com.google.gson.Gson;



/**
 * Servlet implementation class ServeletTabla
 */
public class ServeletTabla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletTabla() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		RDui c= new RDui();
TablaDao tdao = new TablaDao();
		
		String id=null;
		String nombre=null;
		String apellido=null;
		String numero_Dui=null;
		
		
		try {
			
		
		 id= request.getParameter("Id");
		 nombre= request.getParameter("Nombre");
         apellido= request.getParameter("Apellido");
		 numero_Dui= request.getParameter("Dui");
		 
         c.setIdUsuarios(Integer.parseInt(id));
 		c.setNombre(nombre);
 		c.setApellido(apellido);
 		c.setNumero_Dui(numero_Dui);
 		}catch (Exception e) {
			// TODO: handle exception
		}
		String acction= request.getParameter("btn");
		
		if(acction.equals("Guardar")) {
			
		c.setIdUsuarios(Integer.parseInt(id));
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setNumero_Dui(numero_Dui);
		tdao.agregarD(c);
		}
		else if(acction.equals("Actualizar")) {
			c.setIdUsuarios(Integer.parseInt(id));
			c.setNombre(nombre);
			c.setApellido(apellido);
			c.setNumero_Dui(numero_Dui);
		
		tdao.Actualizar(c);
		}
		
		else if(acction.equals("ELIMINAR")) {
			c.setIdUsuarios(Integer.parseInt(id));
			tdao.EliminarD(c);
			
		}
			response.sendRedirect("index.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
TablaDao clien=new TablaDao();

Gson json= new Gson();
try {
	response.getWriter().append(json.toJson(clien.DuiLista()));
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
	
}
}
	}


