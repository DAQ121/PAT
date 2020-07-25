package com.daq.gread15;

import java.util.Scanner;

public class main91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int temp[] = new int[N];
		String s1[] = new String[N];
		String s2[] = new String[N];
		
		for (int i = 0; i < N; i++) {
			boolean flag = true;
			for (int j = 1; j < 10; j++) {
				temp[i] = j * arr[i] * arr[i];
				s1[i] = String.valueOf(arr[i]);
				s2[i] = String.valueOf(temp[i]);
				if (s2[i].substring(s2[i].length() - s1[i].length(), s2[i].length()).equals(s1[i])) {
					System.out.println(j + " " + temp[i]);
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("No");
			}
		}
	}
}
