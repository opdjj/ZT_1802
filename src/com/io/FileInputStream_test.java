package com.io;

import java.io.*;

public class FileInputStream_test {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("d:\\tp.jpg");
		FileOutputStream fout=new FileOutputStream("d:\\tp.jpg");
		long kssj=System.currentTimeMillis();
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {			
			//System.out.print((char)b);
			fout.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.print("拷贝40kb的图片文件耗时"+(jssj-kssj)+"毫秒");
        fin.close();
        //fout.write(",come on".getBytes());
        fout.close();
	}

}
