package com.daq.gread20_2;

import java.util.Scanner;

/**
 * 1008	����Ԫ��ѭ����������
 * @author daq
 * ����˼·: ������ѭ���������
 */
public class main08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		M = M % N;// ����M���ܱ�N��
		for (int i = N - M; i < N; i++) { // ���ȱ���ӡ����
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < N - M; i++) { // ��˳���ӡǰ�����

			if (i == N - M - 1) {
				System.out.println(arr[i]); // ��֤���һ����û�пո�
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
