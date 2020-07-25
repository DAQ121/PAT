package com.daq.gread15;

import java.util.Scanner;

/**
 * 1026 程序运行时间 (15分)
 * @author daq
 * 解题思路:将两数相减，除以100，四舍五入之后得到秒数。用秒数除以3600，得到小时数。用余数除以60，得到分钟数，剩下的余数就是秒数
 * 注意事项:
 * 1.printf("%02d",2);
 * %d表示打印整型的，%2d表示把整型数据打印最低两位，
 * %02d表示把整型数据打印最低两位，如果不足两位，用0补齐,所以打印出来就是02了 
 */
public class main26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();//开始时运行间
		int n = sc.nextInt();//结束时间
		int p = Math.round((n-m)/100f);//得到程序秒数
		
		int x = p / 3600;//得到小时数
		int y = (p % 3600)/60;//得到分钟数
		int z = p-3600*x-60*y;//秒数
		
		System.out.printf("%02d:%02d:%02d", x, y, z);
	}

}
