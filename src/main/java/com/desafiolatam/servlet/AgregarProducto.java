package com.desafiolatam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dao.CategoriaDao;
import com.desafiolatam.dao.CategoriaDaoImp;
import com.desafiolatam.dao.ProductoDao;
import com.desafiolatam.dao.ProductoDaoImp;
import com.desafiolatam.model.Categoria;
import com.desafiolatam.model.Producto;


@WebServlet("/agregar-producto")
public class AgregarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

		ProductoDao productoDao = new ProductoDaoImp();
		CategoriaDao categoriaDao = new CategoriaDaoImp();
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//enviamos la lista de las categorias a la vista para desplegarlas 
		List<Categoria> categorias = categoriaDao.listaCategoria();
		request.setAttribute("categorias", categorias);
		request.getRequestDispatcher("AgregarProducto.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String nombreProducto = request.getParameter("nombre_producto");
		Integer precio = Integer.parseInt(request.getParameter("precio"));
		String descripcion = request.getParameter("descripcion");
		Integer idCategorias = Integer.parseInt(request.getParameter("categorias"));
		
		Integer id =  productoDao.obtenerUltimoId() + 1;
		
		Producto p = new Producto();
		
		p.setId_producto(id);
		p.setNombre_producto(nombreProducto);
		p.setPrecio(precio);
		p.setDescripcion(descripcion);
		p.setId_categoria(idCategorias);
		
		productoDao.agregarProducto(p);
		response.sendRedirect("listar-producto");
		//request.getRequestDispatcher("Inicio.jsp").forward(request, response);
	}

}
