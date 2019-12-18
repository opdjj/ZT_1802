package com.jihe;

import java.util.*;


public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		list.add("stu5");
		System.out.println("数组列表ArrayList集合的长度是:"+list.size());
		System.out.println("数组列表ArrayList第二个元素是:"+list.get(1));
		
		//使用迭代读取集合中的每个元素
		Iterator<String> diedai=list.iterator();
		while(diedai.hasNext()) {
			//next方法读取下一个元素
			String days=diedai.next();
			System.out.println(days);
		}
		
		System.out.println("使用foreach循环输出每个元素是:");
		for(String mgys:list) {
			System.out.println(mgys);
		}
		
		System.out.println("利用列表集合对象使用jDK8的foreach循环输出每个元素是:");
		list.forEach(obj->System.out.println(obj));
		
		System.out.println("利用迭代集合对象使用jDK8的foreach循环输出每个元素是:");
		Iterator<String> it=list.iterator();
		it.forEachRemaining(obj->System.out.println(obj));
		
	}

}
