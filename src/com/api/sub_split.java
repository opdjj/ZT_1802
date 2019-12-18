package com.api;

public class sub_split {

	public static void main(String[] args) {
		String str="2019-10-12";
		//字符串的截取
		System.out.println("今天是"+str.substring(8)+"日");
		System.out.println("本月是"+str.substring(5,7)+"月");
		System.out.println("今年是"+str.substring(0,4)+"年");
		String[] zfcsz=str.split("-");
		System.out.println("今天是"+zfcsz[0]+"年"+zfcsz[1]+"月"+zfcsz[2]+"日");
		
		
		//字符串的分割
		System.out.println("分割后的字符串的元素依次是：");
		String[] strArray=str.split("-");
		for(int i=0;i<strArray.length;i++) {
			if(i!=strArray.length-1) {
				System.out.println(strArray[i]+",");
			}else {
				System.out.println(strArray[i]);
			}
		}

	}

}
