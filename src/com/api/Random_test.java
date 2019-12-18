package com.api;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		//生成[0,1)之间的浮点数
		System.out.println("生成一个[0,1)之间的浮点值"+Math.random());
		Random r=new Random();
		System.out.println("生成一个[0,1)之间的浮点值"+r.nextDouble());
		//生成整数
		System.out.println("生成一个-21亿至21亿之间的整数值"+r.nextInt());
		System.out.println("生成一个[0,10)之间的整数值"+r.nextInt(10));

	}

}
