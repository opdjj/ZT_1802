package com.api;

public class E54 {

	public static void main(String[] args) {
		String s="a1bc2a3b5cb7ac8d9ba";
		if(s.startsWith("a")) {
			System.out.println("字符串以a开头");
		}
		if(s.endsWith("dba")) {
			System.out.println("字符串以dba结尾");
		}
		if(s.contains("cba")) {
			System.out.println("字符串包含cba这个子串");
		}
		if(!s.isEmpty()) {
			System.out.println("字符串s不是空的");
		}
		System.out.println("字符串s的每个字符是：");
		char[] zfse=s.toCharArray();
		for(int i=0;i<zfse.length;i++) {
			char c=zfse[i];
			if(i==zfse.length-1) {
				System.out.println(c);
			}else
				System.out.print(c+",");
			
		}
		System.out.println("字符串s的数字是：");
		for(char zf: zfse) {
			if(zf>'0'&&zf<'9') {
				System.out.print(zf+"");
			}
		}
		
		



	}

}
