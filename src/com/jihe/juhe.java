package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张阳");
		
		//集合流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.println("集合里所有张姓的人:");
		liu3.forEach(j->System.out.println(j));
		
		System.out.println("集合里第二和第三个张姓的人:");
		list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("集合里第二和第三个张姓的人用和连接:");
		System.out.println(list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).collect(Collectors.joining(",")));
	}

}
