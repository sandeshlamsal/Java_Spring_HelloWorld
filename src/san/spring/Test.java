package san.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]){
		Resource r=new ClassPathResource("spring.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Object o=factory.getBean("t");
		Hello h=(Hello)o; //won't call constructor.
		h.hello();
	}
}
