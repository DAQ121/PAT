package com.daq.gread20_3;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 1014 ����Ħ˹��Լ�� (20��)
 * @author: ChangSheng
 * @date: 2019��12��15�� ����3:32:17
 */
public class main14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] weeks = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		String line01 = s.nextLine();
		String line02 = s.nextLine();
		String line03 = s.nextLine();
		String line04 = s.nextLine();
		// 1.�ҳ��ܼ��͵ڼ���ͷ
		boolean isFindWeek = false;
		boolean isFindHour = false;
		for (int i = 0; i < line01.length() && i < line02.length(); i++) {
			char ch1 = line01.charAt(i);
			char ch2 = line02.charAt(i);
			if (ch1 == ch2) { // �ַ���ͬ
				// 1.1 ���ܼ���
				if (!isFindWeek && ch2 >= 'A' && ch2 <= 'G') { // û�ҵ��ܼ�,���ַ���A-G֮��
					System.out.print(weeks[ch2 - 65] + " ");
					isFindWeek = true; // �ҵ����ܼ�
					continue; // ������ѭ��������line01�ĵ�ǰ��ĸ
				}
				// 1.2 ��Сʱ��
				if (isFindWeek && !isFindHour) { // �ҵ����ܼ�����û���ҵ�Сʱ
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
		// 2.�ҳ�����
		for (int i = 0; i < line03.length() && i < line04.length(); i++) {
			char ch = line03.charAt(i);
			char ch2 = line04.charAt(i);
			if (ch == ch2  ) { // ��ͬ��Ӣ����ĸ
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					System.out.printf("%02d", i); // ��һ���Ǹ�ʽ���������0
					return;
				}
			}
		}
	}
}
