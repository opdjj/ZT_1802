package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		list.add("stu5");
		Iterator<String> diedai=list.iterator();
		while(diedai.hasNext()) {
			String string=(String) diedai.next();
			if(string.equals("stu2")) {
				diedai.remove();			
			}
		}
		System.out.println(list);

	}

}
