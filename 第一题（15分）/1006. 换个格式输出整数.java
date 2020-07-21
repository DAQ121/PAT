package com.daq.gread15;

import java.util.Scanner;

public class main06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=n%10;//个位数
		int j=n/10%10;//十位
		int k=n/10/10%10;//百位
		
		for (int a = 1; a <= k; a++) {
			System.out.print("B");
		}
		for (int b = 1; b <= j; b++) {
			System.out.print("S");
		}
		for (int c = 1; c <= i; c++) {
			System.out.print(c);
		}
	}

}
