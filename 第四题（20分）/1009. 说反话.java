package com.daq.gread20_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1009 说反话 (20分)
 * @author daq
 * 将输入的字符串，按空格分割，装进字符数组中,再将字符数组逆序输出
 */
public class main09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split(" ");//将输入的字符串，按空格分割，装进字符数组中
		for (int i = str.length - 1; i > 0; i--) {
			System.out.print(str[i] + " ");
		}
		System.out.print(str[0]);//输出最后一个字符
	}

}
