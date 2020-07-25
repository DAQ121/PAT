import java.util.Scanner;

/**
 * @author daq
 * @description  (3n+1)数问题
 * 解题思路：用一个while循环，判断输入的数是奇数还是偶数，然后做对应的操作，根据while循环的条件，终止循环
 * 总结：多使用位运算，使用while控制循环
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        while (n!=1) {
            if (n % 2 == 0) {
                n=n>>1;
                count++;
            }else{
                n=(n*3+1)>>1;
                count++;
            }
        }
        System.out.println(count);
    }
}
