package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cbf=CharBuffer.allocate(6);
		 System.out.println("这个字段缓冲符的容量是"+cbf.capacity());
		 System.out.println("这个字段缓冲符的界限值是"+cbf.limit());
		 System.out.println("这个字段缓冲符的初始位置是"+cbf.position());
		 //添加3个元素
		 cbf.put("a");cbf.put("b");cbf.put("c");
		 System.out.println("添加3个元素之后这个字段缓冲符的容量是"+cbf.capacity());
		 System.out.println("添加3个元素之后这个字段缓冲符的界限值是"+cbf.limit());
		 System.out.println("添加3个元素之后这个字段缓冲符的初始位置是"+cbf.position());
		 //执行flip()方法
		 cbf.flip();
		 System.out.println("添加3个元素并反转之后这个字段缓冲符的容量是"+cbf.capacity());
		 System.out.println("添加3个元素并反转之后这个字段缓冲符的界限值是"+cbf.limit());
		 System.out.println("添加3个元素并反转之后这个字段缓冲符的初始位置是"+cbf.position());
		 //取出第1个元素
		 System.out.println("取出第1个元素是"+cbf.get());
		 System.out.println("添加3个元素并反转取出第1个元素之后这个字段缓冲符的容量是"+cbf.capacity());
		 System.out.println("添加3个元素并反转取出第1个元素之后这个字段缓冲符的界限值是"+cbf.limit());
		 System.out.println("添加3个元素并反转取出第1个元素之后这个字段缓冲符的初始位置是"+cbf.position());
         //执行clear()方法
		 cbf.clear();
		 System.out.println("执行clear()方法之后这个字段缓冲符的容量是"+cbf.capacity());
		 System.out.println("执行clear()方法之后这个字段缓冲符的界限值是"+cbf.limit());
		 System.out.println("执行clear()方法之后这个字段缓冲符的初始位置是"+cbf.position()); 
	}

}
