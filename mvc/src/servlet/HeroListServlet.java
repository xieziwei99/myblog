package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import dao.HeroDAO;

public class HeroListServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String uesrName = (String) request.getSession().getAttribute("userName");
    	if (null == uesrName) {
    		response.sendRedirect("login.html");
    		return;
    	}
    	
    	response.setContentType("text/html; charset=UTF-8");
    	int start = 0;
    	int cnt = 2;
    	try {
    		start = Integer.parseInt(request.getParameter("start"));
    	} catch (Exception e) {
		}
    	
    	int next = start + cnt;
    	int pre = start - cnt;
    	int total = new HeroDAO().getTotal();
    	int last = total-1;
    	List<Hero> heros = new HeroDAO().list(start, cnt);
    	request.setAttribute("next", next);
    	request.setAttribute("pre", pre);
    	request.setAttribute("last", last);
        request.setAttribute("heros", heros);
        request.getRequestDispatcher("listHero.jsp").forward(request, response);
    }
    
}
