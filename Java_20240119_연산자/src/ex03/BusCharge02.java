package ex03;

import java.util.Scanner;

public class BusCharge02 {

	public static void main(String[] args) {

		/* 기본 버스요금 1500원
		 * 0~3 : 할인율 100%
		 * 4~13 : 할인율 75%
		 * 14~19 : 할인율 25%
		 * 20세이상 : 할인율 0%
		 * 65세이상 : 할인율 100%
		 * 나이 입력하면 할인율 기반해서 프로그램 작성
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		final int CHARGE = 1500;
		double fee = 0;
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		// if 안에 문장이 하나일 경우 중괄호 {} 생략해도됨. 문장이 2개이상일때는 중괄호 필수적으로 넣어줘야함.
		
		if (age >= 65) {
			fee = CHARGE * 1.0;
		}else if (age >= 20) {
			fee = CHARGE * 0.0;
		}else if (age >= 14) {
			fee = CHARGE * 0.25;
		}else if (age >= 4) {
			fee = CHARGE * 0.5;
		}else {
			fee = CHARGE * 1.0;
		}
		
		System.out.println("당신 요금은 " + (int)fee + "원");
	}

}
