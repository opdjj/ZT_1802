package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input_shili {
    static Connection lianjie=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");	        
        lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
		File file=new File("d:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for(File file2 : wenjian_jihe) {
			System.out.println(file2);
			if(file2.getName().endsWith("xlsx")) {
				dwj_xlsx(file2);
			}else if(file2.getName().endsWith("xlsx")) {
				dwj_xls(file2);
			}
			
		}

	}
	public static void  dwj_xlsx(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream(wjm);
		//@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for(int i=0;i<rows;i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			if(xuehao.equals("学号")) {
				continue;
			}
			//System.out.println(xuehao);
			XSSFCell cell16=row.getCell(19);
			if(cell16!=null) {
			String zuo_shili=cell16.getStringCellValue();
			//System.out.println(zuo_shili);
			XSSFCell cell17=row.getCell(20);
			String you_shili=cell17.getStringCellValue();
			//System.out.println(yuo_shili);
			
				
	        //Statement yuju=lianjie.createStatement();
			
	        PreparedStatement ydy_yuju=lianjie.prepareStatement(""
	        		+"update sheet1 set ``=?,``=? where ``=?");
	       ydy_yuju.setString(1,zuo_shili);
	       ydy_yuju.setString(2,you_shili);
	       ydy_yuju.setString(3,xuehao);
	       //ydy_yuju.executeUpdate();
	        //yuju.execute(sql);
			}
		}
	
	}
	public static void  dwj_xls(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream(wjm);
		//@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for(int i=0;i<rows;i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			if(xuehao.equals("学号")) {
				continue;
			}
			//System.out.println(xuehao);
			XSSFCell cell16=row.getCell(19);
			if(cell16!=null) {
			String zuo_shili=cell16.getStringCellValue();
			//System.out.println(zuo_shili);
			XSSFCell cell17=row.getCell(20);
			String you_shili=cell17.getStringCellValue();
			//System.out.println(yuo_shili);
			
				
	        //Statement yuju=lianjie.createStatement();
			
	        PreparedStatement ydy_yuju=lianjie.prepareStatement(""
	        		+"update sheet1 set ``=?,``=? where ``=?");
	       ydy_yuju.setString(1,zuo_shili);
	       ydy_yuju.setString(2,you_shili);
	       ydy_yuju.setString(3,xuehao);
	       //ydy_yuju.executeUpdate();
	        //yuju.execute(sql);
			}
		}
	
	}
}
