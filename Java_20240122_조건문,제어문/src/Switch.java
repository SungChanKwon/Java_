
public class Switch {

	public static void main(String[] args) {

		//switch는 정수, 문자, 문자열만 가능 ->문자는 '', 문자열은 ""
		//break문은 반복문 조건문에서 탈출하라는 의미임. 즉 switch 블록에서 빠져나오게 하는 처리문임.
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("매우 우수");
			break;
		case 'B':
			System.out.println("우수");
			break;
		case 'C':
			System.out.println("좋음");
			break;
		case 'D':
			System.out.println("좀 더 열심히");
			break;
		case 'F':
			System.out.println("미흡");
			break;
		default:
			System.out.println("잘못된 등급");
			
		}
		
		
	}

}
