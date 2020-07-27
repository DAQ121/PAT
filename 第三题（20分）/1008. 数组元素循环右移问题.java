package com.daq.gread20_2;

import java.util.Scanner;

/**
 * 1008	数组元素循环右移问题
 * @author daq
 * 解题思路: 用两个循环输出即可
 */
public class main08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		M = M % N;// 由于M可能比N大
		for (int i = N - M; i < N; i++) { // 最先被打印的数
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < N - M; i++) { // 按顺序打印前面的数

			if (i == N - M - 1) {
				System.out.println(arr[i]); // 保证最后一个数没有空格
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
