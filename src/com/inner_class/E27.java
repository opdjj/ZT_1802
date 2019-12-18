package com.inner_class;



//定义一个函数接口
@FunctionalInterface
interface _Printable{
	void print(StringUtils su,String str);
}
class _StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}

public class E27 {

	public static void main(String[] args) {
		
		printUpper(new StringUtils(),"Hello",(object,t)->object.printUpperCase(t));
		printUpper(new StringUtils(),"World",StringUtils::printUpperCase);
	}

	private static void printUpper(StringUtils su,String text, _Printable pt) {
		pt.print(su,text);
		
	}

}
