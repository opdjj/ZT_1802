package com.jihe;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();
	}
	
	@Override
	public String toString() {
		return id+":" + name ;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (!(obj instanceof Student)) {
			return false;
		}
		Student stu = (Student) obj;
		boolean b=this.id.equals(stu.id);
		return b;
	}
	
}


public class HashSet_test {

	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet<Student>();
		Student s1=new Student("1","Jack");
		Student s2=new Student("2","Rose");
		Student s3=new Student("3","Rose");
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		System.out.println(hset);

	}

}
