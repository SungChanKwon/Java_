package ex03;

import java.util.Scanner;

public class BusCharge20240122 {

	public static void main(String[] args) {
		
		
		/* 기본 버스요금 1500원
		 * 0~3 : 할인율 100%
		 * 4~13 : 할인율 75%
		 * 14~19 : 할인율 25%
		 * 20세이상 : 할인율 0%
		 * 나이 입력하면 할인율 기반해서 프로그램 작성
		 */
		Scanner sc = new Scanner(System.in);
		
		final int CHARGE = 1500; 
		double fee = 0;
		
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			fee = CHARGE * 1.0;
		}else if (age >= 14) {
			fee = CHARGE * 0.75;
		}else if(age >= 4) {
			fee = CHARGE * 0.5;
		}else {
			fee = CHARGE * 0;
		}
		
		System.out.println("당신 요금은 : " + (int)fee + "원");
	}

}
