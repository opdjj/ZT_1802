package com.school;

public class Course {
     private String    id;//教师名
     private String  name;//课程名
     private String  book;//书名
     //如果没有任何构造方法，java VM会自动创建一个无参数的构造方法
     //如果创建了带参数的构造方法，java VM不会自动创建一个无参数的构造方法
     //因此，在创建类的时候，一定要写一个不带参数的构造方法
     
  
   public Course() {}
   
	public Course(String name, String book) {
	
	this.name = name;
	this.book = book;
}

	//读取教师名
     public String getId() {
		return id;
	}
   //设置教师名
	public void setId(String id) {
		this.id = id;
	}
	//读取课程名
	public String getName() {
		return name;
	}
	 //设置课程名
	public void setName(String name) {
		this.name = name;
	}
	//读取书名
	public String getBook() {
		return book;
	}
	 //设置书名
	public void setBook(String book) {
		this.book = book;
	}
	
     
     
     
     
}
