package page001;

import java.io.Serializable;

//修饰符+class+类名+extends(继承)+父类+implements(实现)+父接口
public class Lei extends Object implements Serializable{
	//定义四个内部类
	//class是关键子    class前面可以添加修饰符
	//第一种修饰符的作用范围：public公有的    protected受保护的  private私有的 什么都不写的叫空集
	//第一种修饰符是功能性的：static：静态的  final：最终的（表示该类不能被继承）
	public static final class A extends Object implements Serializable{}
	protected static final  class B extends Object implements Serializable{}
	static final class C extends Object implements Serializable{}
	private static final    class D extends Object implements Serializable{}
    //定义两个成员变量   修饰符+ 数据类型+ 成员变量名
	public static int age;
	public static String name;
	//定义两个成员变量方法  修饰符+ 返回值数据类型+ 成员方法名([参数类型 参数名]){}
	//修饰符可以多一个synchronized ：同步的   一般不要写
	//返回值类型为void(空的)，方法里不需要return语句
	//其他返回值类型，方法里都需要return语句，返回值的类型和方法声明中返回值类型一致
	public synchronized void setAge(int nianling) {}
	public synchronized double getAge() {return 0.0;}
}