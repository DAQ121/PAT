package com.daq.gread15;

import java.util.Scanner;

/**
 * 1076 Wifi密码 (15分)
 * 
 * @思路：因为每行只有一个T，所以找到T的位置后再往前两位就是编号了，拿到编号直接判断输出就行。
 * @author: daq
 */
public class main76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //几行
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			int num = str.indexOf("T"); //获取T的下标
			char id = str.charAt(num-2); //T下标的前一位，就是分数了
			if (id == 'A') 
				System.out.print(1);
			if (id == 'B') 
				System.out.print(2);
			if (id == 'C') 
				System.out.print(3);
			if (id == 'D') 
				System.out.print(4);
		}
	}
}
