package page001;

public class e01 {

	public static void main(String[] args) {
		//自动类型转换：隐形类型转换   从小类型转换到大类型
		byte b=3;
		int i=b;
		System.out.println(i);
		//强制类型转换：显形类型转换   从大类型转换到小类型
		//一定要加上（小类型）（）是强制类型转换算符
		int i1=3;
		byte b1=(byte)i1;
		System.out.println(b1);

	}

}
