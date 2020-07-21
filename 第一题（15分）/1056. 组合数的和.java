package com.daq.gread15;

import java.util.Scanner;

/**
 * 1056 组合数的和 (15分)
 * 
 * @author: ChangSheng 
 * @date:   2020年7月4日 
 * 解体思路:将输入的数字全部遍历一遍，组合求和
 * 知识点:
 * 1.数字转字符串String.valueOf()
 * 2.字符串转数字Integer.valueOf()
 * 3.字符串拼接直接用+
 * 4.continue终止本次循环,break跳出循环
 */
public class main56 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				String splice = String.valueOf(arr[i]) + String.valueOf(arr[j]);
				sum += Integer.valueOf(splice);
			}
		}
		
		System.out.print(sum);
	}
}

