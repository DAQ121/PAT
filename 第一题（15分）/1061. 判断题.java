package com.daq.gread15;

import java.util.Scanner;
/**
 * 1061 判断题 (15分)
 * @author pc
 *	解题思路：将所有信息录入一个二维数组，抛开前两行，循环判断后面的，跟答案作对比，并累计分值
 *  注意事项：遍历二维数组，在for循环外输出
 */ 
public class main61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//学生的数量
		int m = sc.nextInt();//题目数量
		int z =n + 2;
		//将所有录入一个二维数组
		int[][] arr = new int[z][m];
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum=0;
		for (int i = 2; i < z; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j]==arr[1][j]) {
					sum+=arr[0][j];
				}
			}
			System.out.println(sum);//每一行学生的成绩算出来之后，输出sum
			sum = 0;//，并将sum置位0，下一行计算
		}
	}

}
