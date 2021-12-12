package com.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.dao.LoginDaoImp;

/**

 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		boolean usuarioExiste = false;

		String correo = request.getParameter("email");// requere el atributo name="name" del input en el login.jsp
														// dentro del formulario
		String password = request.getParameter("password");
		LoginDaoImp loginDao = new LoginDaoImp();

		usuarioExiste = loginDao.usuarioRegistrado(correo, password);
		request.setAttribute("usuarioExiste", usuarioExiste);

		if (usuarioExiste) {
			System.out.println("El Usuario existe? ->" + usuarioExiste);
			HttpSession sesionUsuario = request.getSession(true);

			Cookie cookieN = new Cookie("email", correo);
			cookieN.setMaxAge(120);
			Cookie cookieP = new Cookie("password", password);
			cookieP.setMaxAge(120);
			
			Cookie[] cookies = request.getCookies();
			String cookieName = "";
			String cookiePass = "";
			if (cookies != null) {

				for (Cookie c : cookies) {
					System.out.println(c.getName() + ":" + c.getValue());
					if (c.getName().equals("email")) {
						cookieName = c.getValue();
						System.out.println(cookieName.toString());
					} else if (c.getName().equals("password")) {
						cookiePass = c.getValue();
						System.out.println(cookiePass);
					}

				}
			}

			sesionUsuario.setAttribute("correo", correo);
			request.setAttribute("correo", correo);
			// System.out.println(correo.toString());
			//response.sendRedirect("inicio");
			request.getRequestDispatcher("inicio").forward(request, response);
			return;
		}

		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		
	}

}
