package com.daq.gread15;

import java.util.Scanner;

/**
 * 1071 С������ (15��)
 * @author daq
 * ����˼·: ֻ��Ҫ�ж�Ӯ������
 */
public class main71 {
	
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int money = cin.nextInt(); //�ܳ���
        int maxRound = cin.nextInt(); //�漸��
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxRound; i++) {
            int n1 = cin.nextInt(); 
            int b = cin.nextInt(); //�Ĵ�С
            int t = cin.nextInt(); //��ע�ĳ���
            int n2 = cin.nextInt();
            
            // ��������ע�������Լ��е�Ǯ
            if (t > money) {
                sb.append("Not enough tokens.  Total = " + money + ".");
            } else {
                // ������Ԥ����ȷ
                boolean status = b == 0 && n2 < n1 || b == 1 && n2 > n1;
                if (status) {
                    money += t;
                    sb.append("Win " + t + "!  Total = " + money + ".");
                } else {
                    money -= t;
                    sb.append("Lose " + t + ".  Total = " + money + ".");
                }
            }
            // ÿ�εĻ��з�
            sb.append("\n");
            // ����ж���ҽ�Ǯ
            if (money <= 0) {
            	// Ϊ�˱�֤��������һ���ԣ��� Game Over �� ��� ���з�("\n")
                sb.append("Game Over.");
                sb.append("\n");
                break;
            }
        }
        System.out.println(sb.substring(0, sb.lastIndexOf("\n")));
    }
}
