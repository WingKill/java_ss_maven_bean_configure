package edu.sejong.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//Indicates that a class declares one or more @Bean methods 
//and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime
@Configuration
@ImportResource("classpath:appCTX.xml")
public class ApplicationConfig3 {
	//Indicates that a method produces a bean to be managed by the Spring container. 
	//The names and semantics of the attributes to this annotation 
	//are intentionally similar to those of the <bean/> element in the Spring XML schema
	@Bean
	public Student student1(){
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
	
	@Bean
	public Student student2(){
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("글쓰기");
		hobbys.add("독서");
		
		Student student = new Student("홍길순", 18, hobbys);
		student.setHeight(160);
		student.setWeight(55);
		
		return student;
	}
	
//  @Bean(name={"b1","b2"}) // bean available as 'b1' and 'b2', but not 'myBean'
//  public MyBean myBean() {
//      // instantiate and configure MyBean obj
//      return obj;
//  }
	
	// student6는 나오지만, student는 안나온다.
	@Bean(name = {"student6"})
	public Student student(){
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("숨바꼭질");
		hobbys.add("수면");
		
		Student student = new Student("홍난아", 13, hobbys);
		student.setHeight(170);
		student.setWeight(59);
		
		return student;
	}
	
	@Bean
	public Grade grade() {
		Grade grade = new Grade();
		grade.setKor(89);
		grade.setEng(88);
		grade.setMath(95);
		
		return grade;		
	}
}
