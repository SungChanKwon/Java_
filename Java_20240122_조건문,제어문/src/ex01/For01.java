package ex01;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10까지 합을 구하는 for문
		
		int su = 0;
		
		for(int i=1; i<=10; i++) 
			su = su + i;
			System.out.println("누적합 : " + su);
			
			
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		Scanner s = new Scanner(System.in);
		
		for (int n = 1; n <= 5; n++) {
			int num = s.nextInt();
			sum += num;
		}
			System.out.println("합계 : " + sum);
		
	}

}
