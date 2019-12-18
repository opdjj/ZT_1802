package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//如果往TreeSet里插入整数，由于整数所在的Integer类implements,Comparable
		//这个接口，所以TreeSet可以对它们进行排序
		ts.add(25);
		ts.add(8);
		ts.add(17);
		ts.add(13);
		ts.add(11);
		ts.add(1);
		System.out.println("创建的TreeSet集合为:"+ts);
		System.out.println("TreeSet集合首元素为:"+ts.first());
		System.out.println("TreeSet集合尾部元素为:"+ts.last());
		System.out.println("创建的TreeSet集合中小于等于9的为:"+ts.floor(9));
		System.out.println("创建的TreeSet集合大于9的最小一个元素为:"+ts.higher(9));
		
		Object first=ts.pollFirst();
		System.out.println("删除的第一个元素为:"+first);
		System.out.println("删除的第一个元素后TreeSet集合变为:"+ts);

	}

}
