package com.Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Covid.Dao.Covid_Dao;
import com.Covid.Model.RDui;


/**
 * Servlet implementation class ServeletCovid
 */
public class ServeletCovid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletCovid() {
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
		
		String us = request.getParameter("Dui");
		
		
		RDui ru=new RDui();
		
		Covid_Dao c = new Covid_Dao();
		ru.setNumero_Dui(us);
		
		
		int	verificarU= c.VerficarDui(ru).size();
		if (verificarU==1) {
			
			System.out.println("Usted es Deneficiario del bono de  $300");
		}else {
			System.out.println("Usted se quedo con hambre ");
			
		}
		response.sendRedirect("index.jsp");
	}

}
