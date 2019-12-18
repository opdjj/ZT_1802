package page001;

public class Bubble_sort {

	public static void main(String[] args) { 
		int[] array={9,8,3,5,2};
		System.out.println("这个数组长度是"+array.length);
		//foreach循环
	    for(int szys:array) {
	    	System.out.println(szys+" ");
	    }
	    System.out.println();
	    /*冒泡排序第一趟:2835 9
	     * 冒泡排序第二趟:235 89
	     * 冒泡排序第三趟:23 589
	     * 冒泡排序第四趟:23589
	     */
	    //定意外循环   表示趟数
		for(int m=1;m<array.length;m++) {
			//定意内循环   比较第m趟要比较的两个数
			 for(int n=0;n<array.length-m;n++) {
				 if(array[n]>array[n+1])
				 {
					 int temp=array[n];
					 array[n]=array[n+1];
					 array[n+1]=temp;
				 }
			 }
		}
		//foreach循环
		for(int szys:array){
			System.out.println(szys+" ");
		}
	}
}