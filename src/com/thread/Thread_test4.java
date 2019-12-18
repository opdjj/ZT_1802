package com.thread;
class TicketWindow extends Thread{
	private int tickets=100;
	public void run() {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
		}
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();

	}

}
