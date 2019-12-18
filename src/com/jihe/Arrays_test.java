package com.jihe;

import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		int[] arr={9,8,3,5,2};
		System.out.print("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.print("\n排序后:");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr,3);
		System.out.println("\n元素3的索引是:"+index);
		//拷贝数组元素
		int[] copied=Arrays.copyOfRange(arr,1,7);
		System.out.println("\n被拷贝的数组是:");
		printArray(copied);
		//替换数组元素
		Arrays.fill(arr, 8);
		System.out.println("\n被替换成8以后的数组是:");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x !=arr.length-1) {
				System.out.print(arr[x]+",");
			}else {
				System.out.print(arr[x]+"]");
			}
		}
		
	}

}
