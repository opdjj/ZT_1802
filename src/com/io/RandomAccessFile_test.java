package com.io;


import java.io.RandomAccessFile;

public class RandomAccessFile_test {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("time.txt","rw");
		int time=Integer.parseInt(raf.readLine())-1;
		if(time>0) {
			System.out.println("您还可以试用"+time+"次");
			raf.seek(0);
			raf.write((time+"").getBytes());			
	}else {
		System.out.println("试用次数已用完");
	}
	raf.close();
	}
}
