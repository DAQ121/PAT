package com.daq.gread15;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/**
 * 1041 考试座位号 (15分)
 * @author daiaoqi
 * 解题思路:用一个map来存放相关信息，准考证号，试机号，考机号用一个node结点存放，key值就是试机号
 * 最终根据key值，获取value
 * 
 * 注意事项:
 * 1.如何从键盘获取值并添加到数组中
 * 2.map要给泛型
 */

public class main41_01 {

    static class Node {
        private String id;// 准考证号
        private int tryNumber;// 试机号
        private int trueNumber;// 考试号
        public Node(String id, int tryNumber, int trueNumber) {
            this.id = id;
            this.tryNumber = tryNumber;
            this.trueNumber = trueNumber;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();//多少个准考证
        Map<Integer, Node> map = new HashMap<>();
        
        //往map中添加数据。
        for (int i = 0; i < nums; i++) {
            String id = sc.next();
            int tryNumber = sc.nextInt();
            int trueNumber = sc.nextInt();
            map.put(tryNumber, new Node(id, tryNumber, trueNumber));
        }

        // 需要查找的学生个数
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int tryNumber = sc.nextInt();
            Node node = map.get(tryNumber);
            System.out.println(node.id + " " + node.trueNumber);
        }
    }

}
