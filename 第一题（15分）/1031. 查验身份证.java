package com.daq.gread15;

import java.util.ArrayList;
import java.util.Scanner;

public class main31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); // 身份证 个数
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; ++i) {
			list.add(sc.nextLine());
		} // 加入链表中
		
		boolean isAllPassed = true;// 设置标志位
		for (String str : list) {
			if (!check(str.substring(0, 17), str.charAt(17))) {//将得到的Z与身份证最后一位对比
				isAllPassed = false;//只要有一位不合理，就将标志位设为false
				System.out.println(str);
			}
		}

		if (isAllPassed) {
			System.out.println("All passed");
		}
	}

	static boolean check(String sub, char m) {

		int[] value = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };// 权重
		char[] arr = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };// 对应检验码

		// 得到和
		int sum = 0;
		for (int i = 0; i < sub.length(); i++) {
			sum += value[i] * (sub.charAt(i) - '0');
		}

		// 模11，得到Z
		if (m == arr[sum % 11]) {
			return true;
		}
		return false;
	}

}
