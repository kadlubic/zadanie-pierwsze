package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.Test;
import writer.Writer;
import writer.*;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		BeanFactory factory = (BeanFactory) context;
		Test test = (Test) factory.getBean("test");

		//Test test = new Test(new Writer(), "Ohoho");
		test.run();

		//Test test1 = new Test();
		//test1.setMyName("x");
		//test1.setWriter(new Writer());

	}


}
