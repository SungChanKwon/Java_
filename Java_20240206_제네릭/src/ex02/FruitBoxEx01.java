package ex02;

/*
 * 이 코드 문제점(?)
 * 1. 이 박스에는 사과, 오린제만 담고싶은데.. 다른것이 담겨도 제거 불가
 * 2. get할 때 형변환 해야한다. (다운케스팅 해야한다)
 */
class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am an orange";
	}
}

class Box { // 사과, 오렌지 담는 상자
	private Object obj;

	void setObj(Object obj) {
		this.obj = obj;
	}

	Object getObj() {
		return obj;
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {

		Box abox = new Box();
		Box bbox = new Box();

		abox.setObj(new Apple()); // 사과 담음
		bbox.setObj(new Orange()); // 오렌지 담음

		Apple ap = (Apple) abox.getObj();
		Orange op = (Orange) bbox.getObj();

		System.out.println(ap);
		System.out.println(op);

	}
}
