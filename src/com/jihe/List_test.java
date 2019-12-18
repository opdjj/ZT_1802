package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型，里面的类型是集合里元素的类型
		//有两个类型，前面一个是集合类，后面尖括号里的是元素类型
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("数组列表ArrayList集合的长度是:"+list.size());
		System.out.println("数组列表ArrayList第二个元素是:"+list.get(1));
        
		LinkedList<String> link=new LinkedList<String>();
		link.add("stu1");
		link.add("stu2");
		link.offer("offer");
		link.push("push");
		System.out.println("链表LinkedList集合的长度是:"+link.size());
		System.out.println("链表LinkedList最后一个元素是:"+link.getLast());
		System.out.println("链表LinkedList第一个元素是:"+link.getFirst());
		System.out.println(link);
		
		//获取元素
		Object object=link.peek();
		System.out.println(object);
		
		//删除元素
		link.removeFirst();
		link.pollLast();
		System.out.println(link);
	}

}
