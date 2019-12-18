package com.jihe;

import java.util.*;
class CustomComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String) o1;
		String key2=(String) o2;		
		return key1.compareTo(key2);
	}
	
}

public class Bct_2 {

	public static void main(String[] args) {
		Map<String,String> tmap=new TreeMap<String,String>(new CustomComparator());
		tmap.put("2", "John");
		tmap.put("1", "Lucy");
		tmap.put("3", "Smilt");
		tmap.put("5", "Amanda");
		tmap.put("4", "Aimee");		
		System.out.println(tmap);
		
		System.out.println("用健集遍历双列集合的键合值");
		//将双列集合Map变成单列的键对象集合使用KeySet()方法
		Set<String> jianji=tmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while(diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}
		

	}

}
