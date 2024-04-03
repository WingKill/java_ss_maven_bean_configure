package edu.sejong.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// 컴파일된 class 파일을 다이렉트로 지정 
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		System.out.println("취미 : " + student1.getHobbys());
		System.out.println("신장 : " + student1.getHeight());
		System.out.println("몸무게 : " + student1.getWeight());
		
		Student student2 = (Student)ctx.getBean("student2");
		
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		System.out.println("취미 : " + student2.getHobbys());
		System.out.println("신장 : " + student2.getHeight());
		System.out.println("몸무게 : " + student2.getWeight());
		
		Student student3 = (Student)ctx.getBean("student6");
		
		System.out.println("이름 : " + student3.getName());
		System.out.println("나이 : " + student3.getAge());
		System.out.println("취미 : " + student3.getHobbys());
		System.out.println("신장 : " + student3.getHeight());
		System.out.println("몸무게 : " + student3.getWeight());
		
		Grade grade = (Grade)ctx.getBean("grade");
		System.out.println("성적 : " + grade.grade());
		System.out.println("총점 : " + grade.avg());
		System.out.println("평균 : " + grade.sum());
		
		ctx.close();
	}
}
