package com.daq.gread15;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author
 * @description 1005 ¼ÌÐø(3n+1)²ÂÏë
 *
 */
public class main05 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (Object o : list) {
            judge(list, (Integer) o);
        }
        System.out.println(list.toString());
    }

    public static List judge(List list, int s){
        while (s!=1){
            if (s%2==0){
                s=s>>1;
                list.remove(s);
            }else{
                s=(s*3+1)>>1;
                list.remove(s);
            }
        }
        return list;
    }
}
