package com.daq.gread20_3;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 1004 �ɼ����� (20��) ���� n��>0����ѧ����������ѧ�š��ɼ����ֱ�����ɼ���ߺͳɼ����ѧ����������ѧ�š�
 * 
 * @author daq ����˼·:��һ��SortedMap���洢��Ϣ��key�洢ѧ���ĳɼ���value��ѧ����ѧ�ţ����� 
 *             Ȼ������sortedMap�ķ�����ȡ�������Сֵ��
 * ע������:
 *    1.�Զ�����:ctrl+shift+O 
 */
public class main04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = sc.nextLine();
		}
		
		SortedMap<Integer,String> sm = new TreeMap<>();
		for (String s : str) {
			String[] items = s.split(" ");
			sm.put(Integer.parseInt(items[2]), items[0]+" "+items[1]);
		}
		System.out.println(sm.get(sm.firstKey()));
		System.out.println(sm.get(sm.lastKey()));
	}

}
