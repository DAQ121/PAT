package com.daq.gread25;

import java.util.Scanner;

/**
 * 1010 一元多项式求导 (25分)
 * 
 * @author daq 注意事项: 从一行输入的数可以采用这种方法录入sc.hasNext()
 * 善于设置标志位
 */
public class main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flage = 0;
		while(sc.hasNext()) {
			int x = sc.nextInt(); //系数
			int n = sc.nextInt(); //指数
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
