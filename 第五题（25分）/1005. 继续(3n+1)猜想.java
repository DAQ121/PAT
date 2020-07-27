package com.daq.gread25;

import java.util.*;

public class main05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = Integer.parseInt(in.nextLine());
		String[] strings = in.nextLine().split(" ");
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> setCover = new HashSet<>();
		//将所有输入的数字装入一个set中
		for (String s : strings) {
			set.add(Integer.parseInt(s));
		}
		//遍历这个set集合，并且挨个求值，利用set的不可重复，将所有输入数字计算过程中遇到的值放入setCover中。
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
		
		set.removeAll(setCover);//利用set的removeAll()方法，将所有的setCover中有的值删除掉。
		Integer[] res = set.toArray(new Integer[0]);//将set转化为数组
		Arrays.sort(res);//给数组排序
		for (int i = res.length-1; i > 0; i--) {//逆序输出
			System.out.print(res[i]+" ");
		}
		System.out.println(res[0]);//保证了最后一个数没有空格
	}
}