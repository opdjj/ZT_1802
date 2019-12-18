package com.api;

public class E53 {

	public static void main(String[] args) {
		String str="java";
		/*char [] charArray=str.toCharArray();
		System.out.print("将字符串转为字符数组的遍历结果：");
		for(int i=1;i<charArray.length;i++) {
			if(i !=charArray.length-1) {
				System.out.println(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}*/
		System.out.println("将int值转换为String类型之后的结果："+String.valueOf(12));
		System.out.println("将字符串转为大写之后的结果："+str.toUpperCase());
        
		String s1="  http :// locahost : 8080  ";
		System.out.print("去除字符串两端空格后的结果是："+s1.trim());	
		System.out.println();
		System.out.print("去除字符串所有空格后的结果是："+s1.replace(" ",""));
		System.out.println();
		System.out.print("去除字符串所有空格后的结果是："+s1.replaceAll("\\s+",""));
	}

}
