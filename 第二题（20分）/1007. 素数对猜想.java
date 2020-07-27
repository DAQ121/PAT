package com.daq.gread20_1;

import java.util.Scanner;

/**
 * 1007 素数对猜想 (20分)
 * @author daq
 * 解题思路:可以开平方的，偶数，都不是素数
 */
public class main07 {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		int j,count = 0;
		int pre = 2;
		
		for (int i = 3; i <= n; i+=2) {
			for (j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0)
					break;
			}
			if (j > Math.sqrt(i)) {
				if (i - pre == 2) {
					count++;
				}
				pre = i;
			}
		}
		System.out.print(count);
	}

}
