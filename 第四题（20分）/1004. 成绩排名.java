package com.daq.gread20_3;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 1004 成绩排名 (20分) 读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
 * 
 * @author daq 解题思路:用一个SortedMap来存储信息，key存储学生的成绩，value存学生的学号，姓名 
 *             然后利用sortedMap的方法，取得最大最小值。
 * 注意事项:
 *    1.自动导包:ctrl+shift+O 
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
