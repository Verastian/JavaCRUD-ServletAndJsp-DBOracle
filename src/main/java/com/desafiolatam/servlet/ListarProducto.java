package com.desafiolatam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dao.CategoriaProductoDao;
import com.desafiolatam.dao.CategoriaProductoDaoImp;
import com.desafiolatam.model.CategoriaProducto;

@WebServlet("/listar-producto")
public class ListarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CategoriaProductoDao catProdDao = new CategoriaProductoDaoImp();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<CategoriaProducto> listaCP = catProdDao.listarCategoriaProducto();
		
		request.setAttribute("productos", listaCP);
		request.getRequestDispatcher("ListarProducto.jsp").forward(request, response);
		
	}

	


}
