package com.daq.gread25;

import java.util.Scanner;

/**
 * 1010 һԪ����ʽ�� (25��)
 * 
 * @author daq ע������: ��һ������������Բ������ַ���¼��sc.hasNext()
 * �������ñ�־λ
 */
public class main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flage = 0;
		while(sc.hasNext()) {
			int x = sc.nextInt(); //ϵ��
			int n = sc.nextInt(); //ָ��
			if(n!=0) {
				if(flage == 0) {
					System.out.print(x*n);
				}else {
					System.out.print(" "+x*n);
				}
				System.out.print(" "+(n-1));
				flage = 1;
			}
		}
		if(flage == 0) {
			System.out.print("0 0");
		}
	}

}
