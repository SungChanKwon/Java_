package ex01;

import java.util.Scanner;

public class For_switch01 {

	public static void main(String[] args) {
		
		int bankBalance = 0;
		int tmp;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		
		for(; flag == true;) {
			System.out.println("------------------------------");
			System.out.println("1.예금\t|2.출금\t|3.잔고\t|4.종료");
			System.out.println("------------------------------");
			int num = Integer.parseInt(sc.nextLine()); //문자열을 정수로 바꿔주는 처리문
			switch(num) {
				case 1:
					System.out.println("예금액>>");
					tmp = Integer.parseInt(sc.nextLine());
					bankBalance += tmp;
					break;
				case 2:
					System.out.println("출금액>>");
					tmp = Integer.parseInt(sc.nextLine());
					bankBalance -= tmp;
					break;
				case 3:
					System.out.println("잔고>>" + bankBalance + "\n");
					break;
				default:
					flag = false;
					break;
			}
		}
			System.out.println("프로그램 종료");
		
	}

}
