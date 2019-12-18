package page001;

public class condition {

	public static void main(String[] args) {
		//if else条件语句
		int age=11;
		if(age<12) 
			System.out.println("此人是儿童");
		else if(age<18)		
	    	System.out.println("此人未成年");
		//switch case条件语句
		int month=9;
		switch(month) {
		  case 12:
		  case 1:
		  case 2:
			  System.out.println("当前时间为冬季");
			  break;
		  case 3:
		  case 4:
		  case 5:
			  System.out.println("当前时间为春季"); 
			  break;
		  case 6:
		  case 7:
		  case 8:
			  System.out.println("当前时间为夏季");
			  break;
		  case 9:
		  case 10:
		  case 11:
			  System.out.println("当前时间为秋季");
			  break;
		  default:
			  System.out.println("输入的月份不正确！！！");
			  break;
			  
		} 
		

	}

}
