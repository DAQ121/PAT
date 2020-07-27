package com.daq.gread20_2;

import java.util.Scanner;

public class main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10005];
        int M = sc.nextInt();
        int N = sc.nextInt();
        int i, j = 0;
        int k;
        for (i = 2; j <= N; i++) {
            double n = Math.sqrt(i);
            for (k = 2; k <= n; k++) {
                if (i % k == 0)
                    break;
            }
            if (k > n) {
                num[j] = i;
                j++;
            }
        }
        int count = 0;
        for (i = M - 1; i < N; i++) {
            if (!(count % 10 == 0)) {
                System.out.print(" ");
            }
            System.out.print(num[i]);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }

        }
    }
}
