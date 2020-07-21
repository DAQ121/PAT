package com.daq.gread15;

import java.util.Scanner;

/**
 * 1036 跟奥巴马一起编程 (15分)
 * 
 * @author daiaoqi 
 * 解题思路:第一行和最后一行输出对应个数的字符，其他行第一个字符和最后一个字符输出即可，用for循环，输出中间的空格
 *         
 * 注意事项: 
 * 1.区分print(),printf(),println()的区别     
 * 2.使用Math.round(n/2.0)来进行四舍五入，里面的参数用double类型，不可以用位运算。得到的结果要进行强制类型转换。
 * 3.用trim()去除空格。
 *
 */

public class main36 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();//多少个数
		String C = s.next();//指定字符
		int column = (int) Math.round(N / 2.0);//行数
		
		for (int i = 0; i < column; i++) { // 行
			for (int j = 0; j < N; j++) { // 列
				if (i == 0 || i == column - 1) {
					System.out.print(C);
				} else {
					if (j == 0 || j == N - 1) {
						System.out.print(C);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
