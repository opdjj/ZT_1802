package page001;

public class Fibonacci {
	public static int f(int n) {
		if (n==1) {
			return 0;
		}
		if (n==2) {
			return 1;
		}
		else return f(n-1)+f(n-2);
	}

	public static void main(String[] args) {
		System.out.println("斐波那契数列的第5个数的数值是"+f(5));

	}

}
