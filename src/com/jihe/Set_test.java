package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		list.add("stu4");
		System.out.println("来自数组列表的输出:");
		list.forEach(obj->System.out.println(obj));
		
		//hashset能够去掉重复元素，是因为hashset里的string类已将重写了object类的hashcode()以及equals()方法
		HashSet<String> hset=new HashSet<String>();
		hset.add("Jack");
		hset.add("Eva");
		hset.add("Rose");
		hset.add("Rose");
		hset.add("Pete");
		System.out.println("来自哈希列表的输出:");
		hset.forEach(obj->System.out.println(obj));
		
		//hashset能够去掉重复元素，是因为hashset里的string类已将重写了object类的hashcode()以及equals()方法
		hset.removeAll(hset);
		HashSet<Integer> hset2=new HashSet<Integer>();
		hset2.add(1);
		hset2.add(2);
		hset2.add(3);
		hset2.add(4);
		hset2.add(5);
		hset2.add(5);
		System.out.println("来自哈希列表的输出:");
		hset.forEach(obj->System.out.println(obj));
		

	}

}
