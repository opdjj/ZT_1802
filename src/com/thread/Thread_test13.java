package com.thread;

import java.util.concurrent.locks.*;

class TicketWindow5 implements Runnable{
	private int tickets=10;
	private final Lock lock=new ReentrantLock();
	@Override
	public void run() {
		while(true) {
			lock.lock();
			if(tickets>0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
		}
		
	}
	
}
public class Thread_test13 {

	public static void main(String[] args) {
		TicketWindow5 tw=new TicketWindow5();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();

	}

}
