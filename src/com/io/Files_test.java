package com.io;



import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		//定义一个目录路径的对象
		Path lujing=Paths.get("D:\\360Downloads");
		//根据Path对象创建多级目录
		Files.createDirectories(lujing);
		System.out.println("目录创建成功");
		//定义一个文件的对象
		Path wj=Paths.get("D:\\360Downloads\\Software\\444\\test.txt");
		//根据Path对象创建多级目录
		//Files.createFile(wj);
		//
		List<String>list=new ArrayList<String>();
		list.add("这是一个测试文件");
		Files.write(wj,list,StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(wj);
		System.out.println("文件的大小为"+Files.size(wj)+"的大小");
		System.out.println("文件的内容为"+lines);
		

	}

}
