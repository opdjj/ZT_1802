package com.yichang;

import java.security.DigestException;

public class E35 {
	public static int divide(int x,int y) throws DigestException {
		if(x==0) {
			throw new DigestException("除数不能为0");
		}
		int result=x/y;
		return result;
	}

	public static void main(String[] args) {
		try {
			int result=divide(4,0);
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("捕获的异常信息为："+e.getMessage());
		}

	}

}
