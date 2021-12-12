package com.desafiolatam;

import java.util.List;

import com.desafiolatam.dao.CategoriaDao;
import com.desafiolatam.dao.CategoriaDaoImp;
import com.desafiolatam.dao.CategoriaProductoDao;
import com.desafiolatam.dao.CategoriaProductoDaoImp;
import com.desafiolatam.dao.ProductoDao;
import com.desafiolatam.dao.ProductoDaoImp;
import com.desafiolatam.model.CategoriaProducto;
import com.desafiolatam.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CategoriaDao cat = new CategoriaDaoImp();
//		System.out.println(cat.listaCategoria());
//		
//		System.out.println(cat.buscarCategoria(31));
		
		
		//ProductoDao p = new ProductoDaoImp();
		//System.out.println(p.BuscarProducto(2));
		
		//System.out.println(p.listarProducto());
		
		//Producto p2 = new Producto(5,"OMO",790,"OLOR A LAVANDA",28);
		
		//p.agregarProducto(p2);
		//p.eliminarProducto(5);
		
		CategoriaProductoDao cPDao = new CategoriaProductoDaoImp();
		
		cPDao.listarCategoriaProducto();
	}

}
