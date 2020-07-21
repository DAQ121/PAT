package com.daq.gread15;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 1041 考试座位号 (15分)
 * @author pc
 * 解题思路:将所有的准考证号放在一个list中，将需要查询的同学试机号放入一个数组中，左后遍历数组的时候做判断。
 * 注意事项:数组的初始化int[] arr = new int[m];以后不要再错了
 */
public class main41 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		Integer n= Integer.parseInt(sc.nextLine());// 考生人数
		for (int i = 0; i < n; ++i) {
			list.add(sc.nextLine());
		}
		Integer m= Integer.parseInt(sc.nextLine());// 待查人数
		int[] arr = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			get(list, arr[i]);
		}

	}

	static void get(ArrayList<String> list, int num) {
		for (String str : list) {
			if ((str.charAt(17) - '0') == num) {
				str = str.substring(0, 17) + str.charAt(19);
				System.out.println(str);
			}
		}
	}

}
