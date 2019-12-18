package com.net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatRoom {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(5000);
		new Thread(new ChatReceiver(ds),"接受服务").start();
		new Thread(new ChatSend(ds,3000),"发送服务").start();

	}

}
