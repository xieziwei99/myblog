package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ContextAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("add attribute  attribute=" + scae.getName() + ", value=" + scae.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("remove attribute");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("replace attribute");
	}

}
