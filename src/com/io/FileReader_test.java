package com.io;


import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d:\\poem.txt");
		FileWriter fw=new FileWriter ("poem1.txt");
		/*for( int i = 0;i<10000;i++) {
			fw.write("轻轻的我走了,\r\n");
			fw.write("正如我轻轻的来;\r\n");
			fw.write("我轻轻的招手,\r\n");
			fw.write("作别西天的云彩.\r\n");
		}*/				
		char[] buff=new char[1024];
		int b=fr.read(buff);
		while(b!=-1) {			
			System.out.print((char)b);
			fw.write(buff,0,b);
			b=fr.read();
		}
		fr.close();
		fw.close();
	}

}
