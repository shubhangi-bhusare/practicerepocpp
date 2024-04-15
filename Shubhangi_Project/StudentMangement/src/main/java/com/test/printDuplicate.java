package com.test;

import java.util.Arrays;

public class printDuplicate {
	public static void main(String[] args) {

		
		
		//input=abbccd
		//ouput =b
		
		String str="abbccdde";
		
		char[] arr=str.toCharArray();	
		
		
		
//		char[] duplicate;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j]&& i!=j) {
					System.out.println("first duplicate element is "+arr[i]);
					break;
				}
				break;
			}
			
		}
		
//		String duplicate=Arrays.str
		
//		Arrays.stream(str)
	
	}
}
