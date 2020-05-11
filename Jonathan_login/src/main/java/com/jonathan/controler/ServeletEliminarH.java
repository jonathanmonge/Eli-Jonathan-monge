package com.jonathan.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jonathan.Datos.Dao.HistoryDao;
import com.jonathan.model.TbHistorial;

/**
 * Servlet implementation class ServeletEliminarH
 */
public class ServeletEliminarH extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletEliminarH() {
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
		TbHistorial t= new TbHistorial();
		HistoryDao h=new HistoryDao();
String acction= request.getParameter("btn");
		
		if(acction.equals("ELIMINAR")) {
			String id=null;
			 id= request.getParameter("Id");
			t.setIdHistorial(Integer.parseInt(id));
			h.EliminarD(t);
			
		}
			response.sendRedirect("Historial.jsp");
	}

}
