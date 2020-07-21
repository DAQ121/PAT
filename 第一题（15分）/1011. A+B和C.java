package com.daq.gread15;

import java.util.Scanner;
 
/**
 * 
 * @author pc
 * 给定区间 [ ] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
 * 
 * 注意事项:从键盘接收数，可以采用二维数组
 */

public class main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long[][] lon = new long[a][3];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                lon[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < a; i++) {
            boolean boo = false;
            long num = lon[i][0]+lon[i][1];
            if (num>lon[i][2]) {
                boo = true;
            }
            int p = i+1;
            System.out.println("Case #"+p+":"+" "+boo);
        }
    }
}