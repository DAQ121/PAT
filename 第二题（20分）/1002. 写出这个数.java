package com.daq.gread20_1;

import java.util.Scanner;

/**
 * @author
 * @description
 * ����һ�������� n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�
 * ע������⣺���ַ���ת�����ʱ��ע��ʹ�õ�sum = sum + s.charAt(i) - '0'
 */
public class main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }

    public static String solution(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        int sum = getsum(s);
        String result = "";
        while (sum != 0) {
            int k = sum % 10;
            sum = sum / 10;
            String temp = getcorsspond(k);
            result = temp + " " + result;
        }
        return result.trim();
    }

    //�õ���
    public static int getsum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + s.charAt(i) - '0';
        }
        return sum;
    }


    //��Ӧƴ�����
    public static String getcorsspond(int x) {
        String result = "";
        switch (x) {
            case 0:
                result = "ling";
                break;
            case 1:
                result = "yi";
                break;
            case 2:
                result = "er";
                break;
            case 3:
                result = "san";
                break;
            case 4:
                result = "si";
                break;
            case 5:
                result = "wu";
                break;
            case 6:
                result = "liu";
                break;
            case 7:
                result = "qi";
                break;
            case 8:
                result = "ba";
                break;
            case 9:
                result = "jiu";
                break;
            default:
                break;
        }
        return result;
    }


}
