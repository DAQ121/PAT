package com.daq.gread15;

import java.util.Scanner;

/**
 * 1076 Wifi���� (15��)
 * 
 * @˼·����Ϊÿ��ֻ��һ��T�������ҵ�T��λ�ú�����ǰ��λ���Ǳ���ˣ��õ����ֱ���ж�������С�
 * @author: daq
 */
public class main76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //����
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			int num = str.indexOf("T"); //��ȡT���±�
			char id = str.charAt(num-2); //T�±��ǰһλ�����Ƿ�����
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
