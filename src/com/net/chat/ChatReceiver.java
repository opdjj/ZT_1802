package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable{
    private DatagramSocket ds;
	public ChatReceiver(DatagramSocket ds) {
		this.ds=ds;
	}

	@Override
	public void run() {	
		
		
		while(true) {
			try {
				byte[] buf=new byte[1024];
			    DatagramPacket dp=new DatagramPacket(buf,buf.length);
		        //System.out.println("等待接受信息.......");		       
				ds.receive(dp);
				String xinxi=new String(dp.getData(),0,dp.getLength());
			    System.out.println(dp.getAddress()+":"+dp.getPort()+"发送消息:"+xinxi);
		        
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		}	
}


