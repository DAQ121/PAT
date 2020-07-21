package com.daq.gread15;

import java.util.Scanner;

public class main71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// 玩家筹码数
		int K = sc.nextInt();// 几轮游戏

		int[][] arr = new int[K][4];
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int num;
		for (int i = 0; i < K; i++) {

			// 判断筹码是否够
			if (T > 0 && T < arr[i][2]) {// 有筹码，但是不够玩
				System.out.println("Not enough tokens.  Total = " + T + ".");
				continue;
			} else if (T == 0) {// 一个筹码都没有了
				System.out.println("Game Over.");
				break;// 直接结束循环
			}

			// 判断大小
			if (arr[i][0] > arr[i][3]) {
				num = 0;
			}else{
				num = 1;
			}
				// 看玩家赌的大小是否正确
				if (arr[i][1] == num) {
					T = T + arr[i][2];
					System.out.println("Win " + arr[i][2] + "!  Total = " + T + ".");
				} else if (arr[i][1] != num) {
					T = T - arr[i][2];
					System.out.println("Lose " + arr[i][2] + ".  Total = " + T + ".");
				}

			}
		}

	}
