package com.daq.gread20_3;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 1014 福尔摩斯的约会 (20分)
 * @author: ChangSheng
 * @date: 2019年12月15日 下午3:32:17
 */
public class main14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] weeks = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		String line01 = s.nextLine();
		String line02 = s.nextLine();
		String line03 = s.nextLine();
		String line04 = s.nextLine();
		// 1.找出周几和第几钟头
		boolean isFindWeek = false;
		boolean isFindHour = false;
		for (int i = 0; i < line01.length() && i < line02.length(); i++) {
			char ch1 = line01.charAt(i);
			char ch2 = line02.charAt(i);
			if (ch1 == ch2) { // 字符相同
				// 1.1 找周几。
				if (!isFindWeek && ch2 >= 'A' && ch2 <= 'G') { // 没找到周几,且字符在A-G之间
					System.out.print(weeks[ch2 - 65] + " ");
					isFindWeek = true; // 找到了周几
					continue; // 跳过该循环，跳过line01的当前字母
				}
				// 1.2 找小时。
				if (isFindWeek && !isFindHour) { // 找到了周几，且没有找到小时
					if (ch2 >= '0' && ch2 <= '9') {
						System.out.printf("%02d:", (ch2 - 48));
						isFindHour = true;
					} else if (ch2 >= 'A' && ch2 <= 'N') {
						System.out.print((ch2 - 55) + ":");
						isFindHour = true;
					}
				}
			}
		}
		// 2.找出分钟
		for (int i = 0; i < line03.length() && i < line04.length(); i++) {
			char ch = line03.charAt(i);
			char ch2 = line04.charAt(i);
			if (ch == ch2  ) { // 相同的英文字母
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					System.out.printf("%02d", i); // 这一句是格式化输出，补0
					return;
				}
			}
		}
	}
}
