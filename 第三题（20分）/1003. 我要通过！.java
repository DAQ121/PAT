package com.daq.gread20_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1003 我要通过！
 * 注意事项：记住这个模板，如果从从键盘输入很多值，用一个ArrayList存放，并在遍历这个链表的过程中，看是否满足要求。
 */
@SuppressWarnings("all")
public class main03 {
    public static void main(String[] args) {
        //数组链表
        ArrayList<String> List = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());//将键盘输入的数字转换为整数
        for (int i = 0; i < n; ++i) {
            List.add(sc.nextLine());//将键盘输入的添加到数组链表中
        }
        // 遍历这个链表，看每行字符串是否满足条件
        for (String x : List) {
            judge(x);
        }
    }

    //判断方法
    public static void judge(String s) {
        String pattern = "A*PA+TA*";
        String pattern1 = "PA+T";
        if (s.matches(pattern)) {//检测字符串是否匹配给定的正则表达式
            if (s.matches(pattern1)) {
                System.out.println("YES");
            } else {
                String temp[] = s.split("P|T");
                int aLength = temp[0].length();
                int bLength = temp[1].length();
                int cLength = temp[2].length();
                if ((cLength - aLength) / aLength == (bLength - 1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } else {
            System.out.println("NO");
        }
    }
}