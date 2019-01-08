package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("session 增加属性  :attribute=" + se.getName() + ", value=" + se.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		 System.out.println("session 移除属性 ");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		 System.out.println("session 替换属性 ");
	}

}
