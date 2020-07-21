package com.daq.gread15;

import java.util.Scanner;
/**
 * 
 * @author pc
 * 1016 部分A+B (15分)
 * 注意事项:有时候也可以从键盘一个一个的接收，并不一定非要使用数组啥的
 * 多使用String的方法和Integer.parseInt()方法
 */
public class main16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String da = sc.next();
		String b = sc.next();
		String db = sc.next();
		String sum1 = "", sum2 = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == da.charAt(0)) {
				sum1 += da;
			}
		}
		if (sum1.equals(""))
			sum1 = "0";
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == db.charAt(0)) {
				sum2 += db;
			}
		}
		if (sum2.equals(""))
			sum2 = "0";
		System.out.print(Integer.parseInt(sum1) + Integer.parseInt(sum2));
	}
}
