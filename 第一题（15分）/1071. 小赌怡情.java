package com.daq.gread15;

import java.util.Scanner;

/**
 * 1071 小赌怡情 (15分)
 * @author daq
 * 解题思路: 只需要判断赢还是输
 */
public class main71 {
	
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int money = cin.nextInt(); //总筹码
        int maxRound = cin.nextInt(); //玩几局
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxRound; i++) {
            int n1 = cin.nextInt(); 
            int b = cin.nextInt(); //赌大小
            int t = cin.nextInt(); //下注的筹码
            int n2 = cin.nextInt();
            
            // 如果玩家下注量大于自己有的钱
            if (t > money) {
                sb.append("Not enough tokens.  Total = " + money + ".");
            } else {
                // 如果玩家预测正确
                boolean status = b == 0 && n2 < n1 || b == 1 && n2 > n1;
                if (status) {
                    money += t;
                    sb.append("Win " + t + "!  Total = " + money + ".");
                } else {
                    money -= t;
                    sb.append("Lose " + t + ".  Total = " + money + ".");
                }
            }
            // 每次的换行符
            sb.append("\n");
            // 最后判断玩家金钱
            if (money <= 0) {
            	// 为了保证结果输出的一致性，在 Game Over 后 添加 换行符("\n")
                sb.append("Game Over.");
                sb.append("\n");
                break;
            }
        }
        System.out.println(sb.substring(0, sb.lastIndexOf("\n")));
    }
}
