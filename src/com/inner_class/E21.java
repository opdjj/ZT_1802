package com.inner_class;
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵");
		
	}
	
}
public class E21 {

	public static void main(String[] args) {
		//第一种方法，用集体cat累的对象调用shout 方法
		Cat cat=new Cat();
		cat.shout();
		//第二种方法，用匿名内部的方式调用shout 方法
		animalShout(new Animal() {

			@Override
			public void shout() {
				System.out.println("wangwang");
				
			}
			
		});
		//第三种方法，用lambda调用shout 方法
		animalShout(()->System.out.println("awo...."));
        showSum(10,20,(x,y)->x+y);
	}

	private static void showSum(int x, int y, Calculate c) {
		System.out.println(x+"+"+y+"的和为:"+c.sum(x,y));
		
	}

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

}
