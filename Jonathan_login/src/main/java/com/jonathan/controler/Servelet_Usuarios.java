package com.jonathan.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jonathan.Datos.Dao.UsuarioDao;
import com.jonathan.model.RUsuario;

/**
 * Servlet implementation class Servelet_Usuarios
 */
public class Servelet_Usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servelet_Usuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	String us = request.getParameter("usuario");
	String contras= request.getParameter("contra");
	
	RUsuario ru=new RUsuario();
	
	UsuarioDao Dao= new UsuarioDao ();
	ru.setUsuario(us);
	ru.setContra(contras);
	
	int	verificarU= Dao.RE_Usuarios(ru).size();
	if (verificarU==1) {
		
		System.out.println("bienvenido");
		response.sendRedirect("Welcome.jsp");
	}else {
		System.out.println("problem");
		response.sendRedirect("index.jsp");
	}
	
	
	
	}

}
