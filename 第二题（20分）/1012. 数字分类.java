package com.daq.gread20_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1012 数字分类 (20分)
 * 
 * @思路：输入个数后，将后面的数字输入一个处理一个
 *	 注意：最后一个测试点，A2交错求和可能求和结果就是0，所以需要单独判断下
 * @author: ChangSheng 
 * @date:   2019年12月30日 下午8:50:22
 */
public class main12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0, count = 0;
		boolean isMinus = true, isNotExist = true; // isMinus是否是奇数个数。isNotExist满足被5整除余1的数字是否不存在
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			int num = s.nextInt();
			if (num % 5 == 0 && num % 2 == 0) A1 += num;
			if (num % 5 == 1) {
				if (isMinus) A2 += num; // 交错求和
				else A2 -= num;
				isMinus = !isMinus; // 取反，交错求和
				isNotExist = false; // 存在满足A2的数字
			}
			if (num % 5 == 2) A3++;
			if (num % 5 == 3) {
				A4 += num;
				count++; // 满足被5整除余3的数字个数
			}
			if (num % 5 == 4 && num > A5) A5 = num; 
		}
		String print = (A1 == 0) ? "N " : A1+" ";
		print += (isNotExist) ? "N " : A2+" ";
		print += (A3 == 0) ? "N " : A3+" ";
		print += (A4 == 0) ? "N " : new DecimalFormat("0.0").format(A4*1.0/count) + " ";
		print += (A5 == 0) ? "N" : A5 + "";
		System.out.println(print);
	}
}
