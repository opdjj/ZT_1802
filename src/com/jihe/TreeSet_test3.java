package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{

	@Override//比较字符串的长度，如果长度相同。自不允许进入
	public int compare(Object obj1, Object obj2) {
		String s1=(String) obj1;
		String s2=(String) obj2;
		return s1.length()-s2.length();
	}
	
}
public class TreeSet_test3 {

	public static void main(String[] args) {
		//在构造TreeSet时，指明要用到的比较器
		TreeSet<String> ts=new TreeSet<String>(new MyComparator());
		ts.add("Jack");
		ts.add("Eve");
		ts.add("Rose");
		ts.add("Helena");
		System.out.println(ts);
		
		TreeSet<String> ts2=new TreeSet<String>((obj1,obj2) ->{
			String s1=(String) obj1;
			String s2=(String) obj2;
			return s1.length()-s2.length();
		});
		ts2.add("Jack");
		ts2.add("Eve");
		ts2.add("Rose");
		ts2.add("Helena");
		System.out.println(ts);
		
}
}
