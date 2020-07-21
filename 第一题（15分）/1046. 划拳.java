package com.daq.gread15;

import java.util.Scanner;

/**
 * 1046 划拳 (15分)
 * 
 * @author daiaoqi
 * @date 2020.7.4
 * 解题思路:将每组数字添加到二维数组中，然后比较喊数之和与划数，谁相等谁就赢
 * 注意事项:在有一列知道的情况下，选用二维数组。
 */

public class main46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int a = 0;// 甲赢了
		int b = 0;// 乙赢了
		for (int i = 0; i < n; i++) {
			int sum = arr[i][0] + arr[i][2];
			if (sum == arr[i][1] && sum != arr[i][3]) {
				a++;
			} else if (sum == arr[i][3] && sum != arr[i][1]) {
				b++;
			}
		}

		System.out.println(b + " " + a);
	}

}
