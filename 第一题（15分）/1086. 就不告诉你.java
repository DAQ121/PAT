package com.daq.gread15;

import java.util.Scanner;

/**
 * 1086 就不告诉你 (15分)
 * @author daq
 * 解题思路:
 * 1.算出结果，用StringBuilder的reverse()方法倒叙
 * 2.用正则表达式匹配
 *
 */
public class main86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		mutply(A, B);
	}
	
	public static void mutply(int A,int B) {
		String reverse = new StringBuilder().append(A*B).reverse().toString(); // 倒叙
		System.out.println(reverse.replaceAll("^0+", "")); // 去除前面的0输出
	}

}
