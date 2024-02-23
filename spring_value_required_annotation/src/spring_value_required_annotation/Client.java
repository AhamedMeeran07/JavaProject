package spring_value_required_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
		Student student=context.getBean("student",Student.class);
		student.displayStudentInfo();
		
		
	}

}
