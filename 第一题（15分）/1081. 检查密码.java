package com.daq.gread15;

import java.util.Scanner;

/**
 * 1081 ������� (15��)
 * 
 * @author daq ����˼·:ʹ��������ʽ
 *
 */
public class main81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //����
		sc.nextLine();
		while (N-- > 0) {
			String password = sc.nextLine(); //һ������
			String print = null; //������
			
			// ����С��6,���Ϸ�
			if (password.length() < 6 && print == null)
				print = "Your password is tai duan le.";
			// û��ƥ�䵽��ĸ�����֡���
			if (!password.matches("[a-zA-Z0-9.]+") && print == null)
				print = "Your password is tai luan le.";
			// û��ƥ�䵽����һ������
			if (!password.matches(".*[0-9].*") && print == null)
				print = "Your password needs shu zi.";
			// û��ƥ�䵽����һ����ĸ
			if (!password.matches(".*[a-zA-Z].*") && print == null)
				print = "Your password needs zi mu.";
			// ��û������
			if (print == null)
				print = "Your password is wan mei.";
			
			System.out.println(print);
		}
	}
}
