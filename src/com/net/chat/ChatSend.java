package com.net.chat;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatSend implements Runnable{
	private DatagramSocket ds;
	private int port;
	public ChatSend(DatagramSocket ds,int port) {
		this.ds=ds;
		this.port=port;
	}

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true) {
		try {
			System.out.println("我说:");
			String str=sc.nextLine();
		    byte[] zjsz;
			zjsz = str.getBytes("UTF-8");
			System.out.println("这条信息发送给那个ip:");
		    DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.49"),8900);
		    ds.send(dp);
			
		    //System.out.println("开始发送信息.......");		    		
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}				
		
	}
	}
}
