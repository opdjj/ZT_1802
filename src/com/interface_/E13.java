package com.interface_;
//接口关键字  interface
interface Animal{
	//接口的成员变量声明时，可以省略public static final三个关键字
	int ID=1;
	//接口的普通成员方法声明时，可以省略public static 二个关键字
	 void shout();
	//接口内不能有普通方法，可以有静态方法
	 static int getID() {
		 return Animal.ID;
	 }
}

interface LandAnimal extends Animal{
	void run();
}
class Dog implements LandAnimal{
	int id;
	public Dog() {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void shout() {
		System.out.println("汪汪........");
	}

	@Override
	public void run() {
		System.out.println("小狗再跑");
		
	}
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵........");
	}
}
public class E13 {

	public static void main(String[] args) {
		System.out.println(Animal.getID());
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		Cat cat=new Cat();
		cat.shout();


	}

}

