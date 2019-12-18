package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(8900);
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		System.out.println("等待接受信息.......");
		while(true) {
			ds.receive(dp);
			String str=new String(dp.getData(),0,dp.getLength());
			System.out.println(dp.getAddress()+":"+dp.getPort()+"发送消息:"+str);
		}

	}

}
