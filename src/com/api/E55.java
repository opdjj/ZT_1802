package com.api;

public class E55 {

	public static void main(String[] args) {
		String s="a我1b爱c2你a3中b5国cb7ac8d9ba";
		char[] zfse=s.toCharArray();
		System.out.println("字符串s的数字是：");
		for(char zf: zfse) {
			if(zf>'0'&&zf<'9') {
				System.out.print(zf+"");
			}
		}
		
		System.out.println();
		System.out.println("字符串s的汉字是：");
		for(char zf: zfse) {
			if(zf>'\u4E00'&&zf<'\u9FA5') {
				System.out.print(zf+"");
			}
		}
		
		/*System.out.println();
		System.out.println("字符串s的每个字符是：");		
		for(int i=0;i<zfse.length;i++) {
			char c=zfse[i];
			if(i==zfse.length-1) {
				System.out.println(c);
			}else
				System.out.print(c+",");
			
		}*/
		
		System.out.println();
		String s1="  http :// locahost : 8080  ";
		System.out.print("去除字符串两端空格后的结果是："+s1.trim());
		
		System.out.print("去除字符串所有空格后的结果是："+s1.replace(" ",""));

	}

}
