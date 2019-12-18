package page001;

public class e04 {

	public static void main(String[] args) {
		//逻辑运算符
		int x=0,y=0,z=0;
		boolean b1,b2;
		b1=x>0&y++>1;
		//&是逻辑与运算符，尽管&左边的值为false,右边也要进行判断
		System.out.println("b1="+b1);
		System.out.println("y="+y);
		
		
		b2=x>0&&z++>1;
		//&&是短路与运算符，只要&&左边的值为false,右边就不进行判断
		System.out.println("b2="+b2);
		System.out.println("z="+z);
		
		//条件运算符
		int store=85;
		System.out.println(store<=0?"没有库存了":(store>100?"库存量为:"+store:"库存少了"));


	}

}
