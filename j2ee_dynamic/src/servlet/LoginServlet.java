package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pwd = req.getParameter("password");
		
		if ("lingjiu".equals(name) && "12345678".equals(pwd)) {
			req.getSession().setAttribute("userName", name);
			resp.sendRedirect("listHero");
		} else {
			resp.sendRedirect("login.html");
		}
	}
}
