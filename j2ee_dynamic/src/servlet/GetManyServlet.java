package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import net.sf.json.JSONSerializer;

public class GetManyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Hero> heros = new ArrayList<>();
		for (int i = 0; i < 10; ++i) {
			Hero hero = new Hero(i, "name" + i, 100 + i, 0);
			heros.add(hero);
		}
		String result = JSONSerializer.toJSON(heros).toString();
		resp.setContentType("text/html; charset=utf-8");
		resp.getWriter().print(result);
	}
}
