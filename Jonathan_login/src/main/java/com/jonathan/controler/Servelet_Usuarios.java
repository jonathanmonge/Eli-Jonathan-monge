package com.jonathan.controler;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jonathan.Datos.Dao.HistoryDao;
import com.jonathan.Datos.Dao.UsuarioDao;
import com.jonathan.model.RUsuario;
import com.jonathan.model.TbHistorial;

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
	String cerrarseccion= request.getParameter("btn");
	if(cerrarseccion!=null) {
		
	
	if(cerrarseccion.equals("cerrar")) {
	
		HttpSession cerrarsecciones=(HttpSession) request.getSession();
		cerrarsecciones.invalidate();
		response.sendRedirect("index.jsp");
	}
	}else {
		
	
	RUsuario usuario=new RUsuario();
	
	UsuarioDao Dao= new UsuarioDao ();
	usuario.setUsuario(us);
	usuario.setContra(contras);
	
	int	verificarU= Dao.RE_Usuarios(usuario).size();
	if (verificarU==1) {
		TbHistorial h =new TbHistorial();
		HistoryDao hd= new HistoryDao();
		Date fecha = new Date();
		
		h.setFecha(fecha);
		usuario.setIdUsuarios(usuario.getIdUsuarios());
		h.setRUsuario(usuario);
		hd.agregarD(h);
		
	HttpSession seccion =request.getSession(true);
seccion.setAttribute("usuario", us);
		response.sendRedirect("Welcome.jsp");
	}else {
		System.out.println("problem");
		response.sendRedirect("index.jsp");
	}
	}

	
}
	}
