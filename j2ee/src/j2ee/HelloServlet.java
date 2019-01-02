package j2ee;
import java.io.IOException;
import java.util.Date;
//import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        System.out.println("init if Hello Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration<String> headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            String header = (String) headerNames.nextElement();
//            String value = req.getHeader(header);
//            System.out.printf("%s\t%s%n",header,value);
//        }
        
        //resp.setContentType("text/lol");
        resp.getWriter().println("<h1>Hello Servlet !</h1>");
        resp.getWriter().println(new Date().toString());
    }
    
}
