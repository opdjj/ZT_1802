package com.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMondel_test {

	public static void main(String[] args) {
		List<PersonMondel> list=new ArrayList<>();
		PersonMondel p1=new PersonMondel("wnag yu",18,"男");
		PersonMondel p2=new PersonMondel("zhang san",20,"男");
		PersonMondel p3=new PersonMondel("li si",22,"女");
		PersonMondel p4=new PersonMondel("zhao qian",28,"男");
		/*list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);*/
		list=Arrays.asList(p1,p2,p3,p4);
		
		//old
		for(PersonMondel pm : list) {
			System.out.println(pm.getName());
		}
		
		//new 1
		List<String> list2=list.stream().map(pm->pm.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		//new 2
		List<String> list3=list.stream().map(PersonMondel::getName).collect(Collectors.toList());
		System.out.println(list3);
				
		//new 3
		/*List<String> list4=list.stream().map(pm->{
			System.out.println(pm.getName());
			return pm.getName();
		}).collect(Collectors.toList());
		}*/
		

	}
}



