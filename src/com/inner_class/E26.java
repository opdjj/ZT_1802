package com.inner_class;
@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class E26 {

	public static void main(String[] args) {
		printName("张杰",new PersonBuilder() {

			@Override
			public Person buildPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
			
		});
		printName("赵丽颖",name->new Person(name));
		printName("张杰",Person::new);
	}

	private static void printName(String name,PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
		
	}

}
