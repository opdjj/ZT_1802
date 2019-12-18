package com.yichang;
/*class BlcException extends Excption{

	public BlcException() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public BlcException(String message) {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}*/

public class E31 {
	public static int divide(int x,int y) throws Exception {
		if(x==0) {
			throw new Exception("除数不能为0");
		}
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		int result;
		try {
			int result1=divide(4,0);
			System.out.println(result1);
		}catch (Exception e) {
			System.out.println("捕获的异常信息为："+e.getMessage());
		}

	}

}
