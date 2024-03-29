package page001;    //package:包
		/*
		 * 紫色的代码是关键字
		 * 褐色的代码是方法的参数或者方法里的局部变量
		 * 蓝色的代码是成员变量，它的地位比局部变量高，地位同成员方法一样
		 * 黑色的代码是标识符:包名(com、page001)、类名(Class001)方法名(main、println)、整型字变量
		 * 
		 */
public class Class001 {		//class:类  public:修饰符 表示公有的
	byte b2=1;
	public static void main(String[] args) {
		//static:修饰符 表示静态的 void: 空的 表明该方法没有返回值
		byte b=1;
		short s=1;
		int i=1;
		long l=1;
		
		float f=1.0f;
		double d=1.0;
		
		boolean flag1=true;
		boolean flag2=false;
		
		char c='a';
	    char ci=97;
	    char cc=97;
	    System.out.println(c);
	    System.out.println(ci);
	    System.out.println(cc);
	    
	    
		
		System.out.println("字节型整数数据的长度是"+Byte.SIZE);
		System.out.println("短整型整数数据的长度是"+Short.SIZE);
		System.out.println("整型整数数据的长度是"+Integer.SIZE);
		System.out.println("长型整数数据的长度是"+Long.SIZE);
		System.out.println("单精度型数据的长度是"+Float.SIZE);
		System.out.println("双精度型数据的长度是"+Double.SIZE);
		System.out.println("字符型数据的长度是"+Character.SIZE);
		System.out.println("字节型整数数据的范围是"+Byte.MIN_VALUE+"_"+Byte.MAX_VALUE);
		System.out.println("短整型整数数据的范围是"+Short.MIN_VALUE+"_"+Short.MAX_VALUE);
		System.out.println("整型整数数据的范围是"+Integer.MIN_VALUE+"_"+Integer.MAX_VALUE);
		System.out.println("长型整数数据的范围是"+Long.MIN_VALUE+"_"+Long.MAX_VALUE);
		System.out.println("单精度型数据的范围是"+Float.MIN_VALUE+"_"+Float.MAX_VALUE);
		System.out.println("双精度型数据的范围是"+Double.MIN_VALUE+"_"+Double.MAX_VALUE);
		System.out.println("字符型数据的范围是"+(int)Character.MIN_VALUE+"_"+(int)Character.MAX_VALUE);
		System.out.println("布尔型数据的范围是"+Boolean.TRUE+"_"+Boolean.FALSE);
	}

}
