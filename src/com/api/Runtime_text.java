package com.api;

public class Runtime_text {

	public static void main(String[] args) throws Exception{
		Runtime rt=Runtime.getRuntime();
		System.out.println("本机的处理器个数是"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小是"+rt.freeMemory()/1024/1024+"M");
		System.out.println("最大可用内存大小是"+rt.maxMemory()/1024/1024+"M");
		
				
		Process jincheng=rt.exec("notepad.exe");
		Thread.sleep(3000);
		jincheng.destroy();
		

	}

}
