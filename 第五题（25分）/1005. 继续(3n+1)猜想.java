package com.daq.gread25;

import java.util.*;

public class main05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = Integer.parseInt(in.nextLine());
		String[] strings = in.nextLine().split(" ");
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> setCover = new HashSet<>();
		//���������������װ��һ��set��
		for (String s : strings) {
			set.add(Integer.parseInt(s));
		}
		//�������set���ϣ����Ұ�����ֵ������set�Ĳ����ظ����������������ּ��������������ֵ����setCover�С�
		for (Integer n : set) {
			if (!setCover.contains(n)) {
				while (n != 1) {
					if (n % 2 == 0) {
						n = n / 2;
					} else {
						n = (3 * n + 1) / 2;
					}
					setCover.add(n);
				}
			}
		}
		
		set.removeAll(setCover);//����set��removeAll()�����������е�setCover���е�ֵɾ������
		Integer[] res = set.toArray(new Integer[0]);//��setת��Ϊ����
		Arrays.sort(res);//����������
		for (int i = res.length-1; i > 0; i--) {//�������
			System.out.print(res[i]+" ");
		}
		System.out.println(res[0]);//��֤�����һ����û�пո�
	}
}