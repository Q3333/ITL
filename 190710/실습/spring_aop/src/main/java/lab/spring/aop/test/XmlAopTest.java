package lab.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.spring.aop.persist.UserVO;
import lab.spring.aop.service.UserService;

public class XmlAopTest {

	public static void main(String[] args) {
		String[] configs = new String[] {"xmlAop.xml"};
		//String[] configs = new String[] {"annotAop.xml"};
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(configs);
		UserService service =
				context.getBean("userService",UserService.class);
		UserVO vo = new UserVO();
		vo.setUserid("ㅎㅎㅎ2");
		vo.setUsername("^_^");
		System.out.println("Target객체의 핵심로직 수행: " 
				+ service.registMember(vo));
	}

}
