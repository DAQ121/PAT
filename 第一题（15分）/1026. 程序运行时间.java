package com.daq.gread15;

import java.util.Scanner;

/**
 * 1026 ��������ʱ�� (15��)
 * @author daq
 * ����˼·:���������������100����������֮��õ�����������������3600���õ�Сʱ��������������60���õ���������ʣ�µ�������������
 * ע������:
 * 1.printf("%02d",2);
 * %d��ʾ��ӡ���͵ģ�%2d��ʾ���������ݴ�ӡ�����λ��
 * %02d��ʾ���������ݴ�ӡ�����λ�����������λ����0����,���Դ�ӡ��������02�� 
 */
public class main26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();//��ʼʱ���м�
		int n = sc.nextInt();//����ʱ��
		int p = Math.round((n-m)/100f);//�õ���������
		
		int x = p / 3600;//�õ�Сʱ��
		int y = (p % 3600)/60;//�õ�������
		int z = p-3600*x-60*y;//����
		
		System.out.printf("%02d:%02d:%02d", x, y, z);
	}

}
