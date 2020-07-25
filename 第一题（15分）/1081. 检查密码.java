package com.daq.gread15;

import java.util.Scanner;

/**
 * 1081 检查密码 (15分)
 * 
 * @author daq 解题思路:使用正则表达式
 *
 */
public class main81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //几行
		sc.nextLine();
		while (N-- > 0) {
			String password = sc.nextLine(); //一行密码
			String print = null; //输出语句
			
			// 长度小于6,不合法
			if (password.length() < 6 && print == null)
				print = "Your password is tai duan le.";
			// 没有匹配到字母、数字、点
			if (!password.matches("[a-zA-Z0-9.]+") && print == null)
				print = "Your password is tai luan le.";
			// 没有匹配到任意一个数字
			if (!password.matches(".*[0-9].*") && print == null)
				print = "Your password needs shu zi.";
			// 没有匹配到任意一个字母
			if (!password.matches(".*[a-zA-Z].*") && print == null)
				print = "Your password needs zi mu.";
			// 都没有问题
			if (print == null)
				print = "Your password is wan mei.";
			
			System.out.println(print);
		}
	}
}
