package com.daq.gread20_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1009 ˵���� (20��)
 * @author daq
 * ��������ַ��������ո�ָװ���ַ�������,�ٽ��ַ������������
 */
public class main09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split(" ");//��������ַ��������ո�ָװ���ַ�������
		for (int i = str.length - 1; i > 0; i--) {
			System.out.print(str[i] + " ");
		}
		System.out.print(str[0]);//������һ���ַ�
	}

}
