package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import net.sf.json.JSONObject;

public class GetOneServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Hero hero = new Hero(0, "lala", 200, 0);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("hero", JSONObject.fromObject(hero));
		resp.setContentType("text/html; charset=utf-8");
		resp.getWriter().print(jsonObject);
	}
}
