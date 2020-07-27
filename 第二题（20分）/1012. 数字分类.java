package com.daq.gread20_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1012 ���ַ��� (20��)
 * 
 * @˼·����������󣬽��������������һ������һ��
 *	 ע�⣺���һ�����Ե㣬A2������Ϳ�����ͽ������0��������Ҫ�����ж���
 * @author: ChangSheng 
 * @date:   2019��12��30�� ����8:50:22
 */
public class main12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0, count = 0;
		boolean isMinus = true, isNotExist = true; // isMinus�Ƿ�������������isNotExist���㱻5������1�������Ƿ񲻴���
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			int num = s.nextInt();
			if (num % 5 == 0 && num % 2 == 0) A1 += num;
			if (num % 5 == 1) {
				if (isMinus) A2 += num; // �������
				else A2 -= num;
				isMinus = !isMinus; // ȡ�����������
				isNotExist = false; // ��������A2������
			}
			if (num % 5 == 2) A3++;
			if (num % 5 == 3) {
				A4 += num;
				count++; // ���㱻5������3�����ָ���
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
