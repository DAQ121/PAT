package com.daq.gread15;

import java.util.Scanner;

/**
 * 
 * @author pc
 * 1021 个位数统计 (15分)
 * 注意事项:单个字符用单引号，字符串用双引号
 * 
 */
public class main21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[10];
		
		for (int i = 0; i < str.length(); i++) {
			char s1 = str.charAt(i);
			if(str.charAt(i)=='0') {arr[0]++;}
			if(str.charAt(i)=='1') {arr[1]++;}
			if(str.charAt(i)=='2') {arr[2]++;}
			if(str.charAt(i)=='3') {arr[3]++;}
			if(str.charAt(i)=='4') {arr[4]++;}
			if(str.charAt(i)=='5') {arr[5]++;}
			if(str.charAt(i)=='6') {arr[6]++;}
			if(str.charAt(i)=='7') {arr[7]++;}
			if(str.charAt(i)=='8') {arr[8]++;}
			if(str.charAt(i)=='9') {arr[9]++;}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				System.out.println(i+":"+arr[i]);
			}
		}
		
		
	}
}
