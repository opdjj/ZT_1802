package com.chapter4;

class Animal{
	String name ="动物";
	//Field:成员变量
	//String name;
	//Method:成员方法
	void shout() {
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	String name ="犬类";
	//方法的重写
	@Override
	void shout() {
		System.out.println("汪汪..........");
	}
	//继承了Animal类所有的成员变量和成员方法
	public void printName() {
		System.out.println("name="+super.name);
	}
}
public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="哈士奇";
		dog.printName();
		dog.shout();

	}

}
