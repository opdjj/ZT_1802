package com.school;

public class Student_text {

	public static void main(String[] args) {
		//对象的创建  类名 对象名称  = new 类名() 也就是new +构造方法
		Student s1=new Student();
		s1.setName("mike");
		s1.setScore(600);
		Student s2=new Student("serena",590);
		System.out.println(s1.getName()+"考了"+s1.getScore()+"分");
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
		
		Course c1=new Course();
		c1.setName("java程序设计");
		c1.setBook("java基础入门");
		System.out.println(c1.getName()+"这门课程使用的教材是《"+c1.getBook()+"》");
		
		
		
	}

}
