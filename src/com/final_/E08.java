package com.final_;

class Animal{
	//如果一个成员变量被final修饰，则该变量在本类中不能再次被赋值
	final String name="动物";
	public void shout() {}
	@Override
	//重写object类的toString()方法
	public String toString() {
		return "这是一只动物";
	}
}
class Dog extends Animal{
	//String name="小狗";
	@Override//重写父类
    public void shout() {}
	@Override
	//重写Animal类的toString()方法
	public String toString() {
		return "这是一只小狗";
	}
}

public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
		System.out.println(dw);
		System.out.println(xg);

	}

}
