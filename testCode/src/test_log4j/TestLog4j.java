package test_log4j;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * The Class TestLog4j.
 */
public class TestLog4j {
	
	/** The logger.
	 * 基于类的名称获取日志对象 */
	static Logger logger = Logger.getLogger(TestLog4j.class);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InterruptedException the interrupted exception
	 */
	public static void main(String[] args) throws InterruptedException {
//		BasicConfigurator.configure();		// 进行默认配置
//		PropertyConfigurator.configure("log4j.properties");		// 指定配置文件进行配置
		DOMConfigurator.configure("log4j.xml");
		
//		logger.setLevel(Level.DEBUG);		// 设置日志输出级别
		
		logger.trace("跟踪信息");
		logger.debug("调试信息");
		logger.info("输出信息");
		logger.warn("警告信息");
		logger.error("错误信息");
		logger.fatal("致命信息");
	}
}
