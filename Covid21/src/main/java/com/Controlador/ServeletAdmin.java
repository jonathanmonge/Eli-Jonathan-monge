package com.Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Covid.Dao.covid_administradorDao;
import com.Covid.Model.RAdministrador;


/**
 * Servlet implementation class ServeletAdmin
 */
public class ServeletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletAdmin() {
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
		doGet(request, response);
		String us = request.getParameter("usuario");
		String contras= request.getParameter("contra");
		
		RAdministrador ru=new RAdministrador();
		
		covid_administradorDao Dao= new covid_administradorDao ();
		ru.setUsuario(us);
		ru.setContrasenia(contras);
		
		
		
		int	verificarU= Dao.LoginUser(ru).size();
		if (verificarU==1) {
			
			System.out.println("Bienvenido homie " + us);
			response.sendRedirect("gestionar.jsp");
		}else {
			System.out.println("Usuario o contrasenia incorrecta homie");
			
		}
	}

}
