package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("-5的绝对值是"+Math.abs(-5));
		System.out.println("-5的正弦值是"+Math.sin(-5));
		System.out.println("-5的余弦值是"+Math.cos(-5));
		System.out.println("-5的正切值是"+Math.tan(-5));
		System.out.println("4的平方根是"+Math.sqrt(4));
		System.out.println("9的立方根是"+Math.cbrt(9));
		System.out.println("5的乘方是"+Math.pow(5,2));
		System.out.println("大于参数的最小整数是"+Math.ceil(-5));
		System.out.println("小于参数的最小整数是"+Math.floor(-5));
		System.out.println("对小数进行四舍五入的结果是是"+Math.round(5.3));
		System.out.println("对小数进行取整是"+(int)(-3.5));
		System.out.println("-5，5的较大值是"+Math.max(-5,5));
		System.out.println("-5，5的较小值是"+Math.min(-5,5));
		System.out.println("生成一个大于等于0.0小于1.0的随机值"+Math.random());

	}

}
