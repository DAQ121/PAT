import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=n%10;//¸öÎ»Êý
		int j=n/10%10;//Ê®Î»
		int k=n/10/10%10;//°ÙÎ»
		
		for (int a = 1; a <= k; a++) {
			System.out.print("B");
		}
		for (int b = 1; b <= j; b++) {
			System.out.print("S");
		}
		for (int c = 1; c <= i; c++) {
			System.out.print(c);
		}
	}

}
