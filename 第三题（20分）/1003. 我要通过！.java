package com.daq.gread20_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1003 ��Ҫͨ����
 * ע�������ס���ģ�壬����ӴӼ�������ܶ�ֵ����һ��ArrayList��ţ����ڱ����������Ĺ����У����Ƿ�����Ҫ��
 */
@SuppressWarnings("all")
public class main03 {
    public static void main(String[] args) {
        //��������
        ArrayList<String> List = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());//���������������ת��Ϊ����
        for (int i = 0; i < n; ++i) {
            List.add(sc.nextLine());//�������������ӵ�����������
        }
        // �������������ÿ���ַ����Ƿ���������
        for (String x : List) {
            judge(x);
        }
    }

    //�жϷ���
    public static void judge(String s) {
        String pattern = "A*PA+TA*";
        String pattern1 = "PA+T";
        if (s.matches(pattern)) {//����ַ����Ƿ�ƥ�������������ʽ
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