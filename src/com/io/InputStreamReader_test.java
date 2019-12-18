package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		//定义标准字节输入流
		//InputStream jpsr=System.in;
		//将标准字节输入流转换成字符流
		//InputStreamReader ir=new InputStreamReader(jpsr);
		//将字符流包装成缓冲字符流
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));	
		
		/*System.out.println("请输入您的年龄:");
		String line=br.readLine();
		int age=Integer.parseInt(line);
		System.out.println("您明年的年龄是:"+(age+1)+"岁");*/
		
		System.out.println("自我介绍:");
		String line2=br.readLine();
		System.out.println(line2);
		int i=1;
		while(i!=3) {
			if(i==1) {
				System.out.println("请输入您的姓名:");
				line2=br.readLine();
				bw.write("您叫:"+line2);
				i++;
			}else if(i==2) {
				System.out.println("请输入您的年龄:");
				line2=br.readLine();
				int age2=Integer.parseInt(line2);
				bw.write("您明年的年龄是:"+(age2+1)+"岁");
			}	
			System.out.println("介绍完成:");
			br.close();
			bw.close();
			bw.flush();
		}

	}

}
