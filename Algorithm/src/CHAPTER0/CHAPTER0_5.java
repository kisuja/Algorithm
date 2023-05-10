package CHAPTER0;

import java.util.Scanner;

public class CHAPTER0_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			sum+=b;
		}
		System.out.printf("%d",sum);
		sc.close();

	}

}