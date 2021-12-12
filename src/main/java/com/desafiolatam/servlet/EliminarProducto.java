package com.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dao.ProductoDao;
import com.desafiolatam.dao.ProductoDaoImp;

/**

 */
@WebServlet("/eliminar-producto")
public class EliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	ProductoDao productoDao = new ProductoDaoImp();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id_producto"));

		if (id <= 0) {
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}

		request.setAttribute("id", id);
		request.getRequestDispatcher("EliminarProducto.jsp").forward(request, response);
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));

		if (id <= 0) {
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		productoDao.eliminarProducto(id);
		response.sendRedirect("listar-producto");
		//request.getRequestDispatcher("Inicio.jsp").forward(request, response);
	}

}
