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


@WebServlet("/modificar-producto")
public class ModificarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ProductoDao productoDao = new ProductoDaoImp();
	CategoriaDao categoriaDao = new CategoriaDaoImp();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		Integer id = Integer.parseInt(request.getParameter("id_producto"));
		System.out.println(id);

				if (id <= 0) {
					request.getRequestDispatcher("Error.jsp").forward(request, response);
				}
				Producto producto = productoDao.BuscarProducto(id);

				if (producto.getId_producto() == 0) {
					request.getRequestDispatcher("Error.jsp").forward(request, response);
				}

				List<Categoria> categorias = categoriaDao.listaCategoria();
				request.setAttribute("categorias", categorias);
				request.setAttribute("producto", producto);
				request.getRequestDispatcher("ModificarProducto.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String nombreProducto = request.getParameter("nombre_producto");
		Integer precio = Integer.parseInt(request.getParameter("precio"));
		String descripcion = request.getParameter("descripcion");
		Integer idCategorias = Integer.parseInt(request.getParameter("id_categoria"));
		
		Integer id = Integer.parseInt(request.getParameter("id_producto"));
		
		if (id <= 0) {
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		Producto p = new Producto();
		
		p.setId_producto(id);
		p.setNombre_producto(nombreProducto);
		p.setPrecio(precio);
		p.setDescripcion(descripcion);
		p.setId_categoria(idCategorias);
		System.out.println(p);
		productoDao.modificarProducto(p);
		
		response.sendRedirect("listar-producto");
		//request.getRequestDispatcher("/ListarProducto.jsp").forward(request, response);
	}

}
