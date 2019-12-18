package com.jdbc;
import java.sql.*;


public class Gengxiin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
        //
        Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_test","root","123456");
        //
        Statement yuju=lianjie.createStatement();
        //
        String sql="UPDATE tb1_user SET email 'jack@qq.com' WHERE id=1";
        //
        yuju.execute(sql);
	}

}
