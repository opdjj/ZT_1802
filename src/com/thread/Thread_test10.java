package com.thread;
class EmergencyTherad implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"输入:"+i);
		}
		
	}
	
}
public class Thread_test10 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new EmergencyTherad(),"线程1");
		t1.start();
		for(int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"输入:"+i);
			if(i==2) {
				t1.join();
			}
		}

	}

}
