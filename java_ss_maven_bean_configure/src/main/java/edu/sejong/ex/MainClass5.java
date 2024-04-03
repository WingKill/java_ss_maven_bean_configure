package edu.sejong.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass5 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		
		Student student2 = (Student)ctx.getBean("student2");
			
		Student student3 = (Student)ctx.getBean("student2");
		
		if(student2 == student3) {
			System.out.println("같다");
		}
		
		ctx.close();
	}
}
