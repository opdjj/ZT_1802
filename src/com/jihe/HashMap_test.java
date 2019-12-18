package com.jihe;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_test {

	public static void main(String[] args) {
		//赋值符号左边的类或接口可以是右边的类的上一代
		Map<String,String> hmap=new HashMap<String,String>();
		hmap.put("1", "Jake");
		hmap.put("2", "Rose");
		hmap.put("3", "Pete");
		System.out.println(hmap);
		
		if(hmap.containsKey("1")) {
			System.out.println("这双列集合包含键1");
			System.out.println("这双列集合包中键1的值是"+hmap.get("1"));
		}
	
		//将双列集合Map变成单列的键对象集合使用KeySet()方法
		//将双列集合Map变成单列的值对象集合使用values()方法
		System.out.println("这双列集合中所有键的集合是"+hmap.keySet());
		System.out.println("这双列集合中所有值的集合是"+hmap.values());
		//将键为1的值改为Tom2
		hmap.replace("1","Tom2");
		System.out.println(hmap);
		//删除键1对应的键Key值+value=对entry
		hmap.remove("1");
		System.out.println(hmap);
		
		System.out.println("用健集遍历双列集合的键合值");
		//将双列集合Map变成单列的键对象集合使用KeySet()方法
		Set<String> jianji=hmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while(diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println("用健值对集遍历双列集合的键合值");
		//将双列集合Map变成单列的键对象集合使用KeySet()方法
		Set<Entry<String, String>> entrySet=hmap.entrySet();
		Iterator<Entry<String, String>> it=entrySet.iterator();
		while(it.hasNext()){
			@SuppressWarnings("rawtypes")
			HashMap.Entry entry=(HashMap.Entry) (it.next());
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+":"+value);
		}
		
		System.out.println("用foreach健值对集遍历双列集合的键合值");
		hmap.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach健值对集遍历双列集合的所有值");
		Collection<String> values=hmap.values();
		values.forEach(value->System.out.println(value));
		
		Map<String,String> hmap2=new LinkedHashMap<String,String>();
		hmap2.put("2", "Jake");
		hmap2.put("1", "Rose");
		hmap2.put("3", "Pete");
		hmap2.forEach((key,value)->System.out.println(key+":"+value));
	}
}

