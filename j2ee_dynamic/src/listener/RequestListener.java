package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("add attribute in request: attribute=" + srae.getName() + ", value=" + srae.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("request 移除属性 ");
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		 System.out.println("request 替换属性 ");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("销毁了一个Request ");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("创建了一个Request ");
	}

}
