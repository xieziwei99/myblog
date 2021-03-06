package listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnlineNumberListener
 *
 */
public class OnlineNumberListener implements HttpSessionListener {

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         ServletContext application = se.getSession().getServletContext(); 
         Integer online_number = (Integer) application.getAttribute("online_number");
         if (null == online_number) {
        	 online_number = 0;
         }
         online_number++;
         application.setAttribute("online_number", online_number);
         System.out.println("an user come online");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	ServletContext application = se.getSession().getServletContext(); 
        Integer online_number = (Integer) application.getAttribute("online_number");
        if (null == online_number) {
       	 online_number = 0;
        } else {
        	online_number--;
        }
        application.setAttribute("online_number", online_number);
        System.out.println("an user leave");
    }
	
}
