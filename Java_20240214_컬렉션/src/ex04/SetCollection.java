package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {

		// 중복저장되지 않는다, 순서가 없다. 즉 입력된 순서대로 나오지않는다.
		Set<String> set = new HashSet<String>();

		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");

//		for(String s : set)
//			System.out.println(s);
			
		Iterator<String> it = set.iterator(); // set은 순서가 없기 때문에 iterator 사용

		while (it.hasNext()) {
			System.out.println(it.next() + '\t');
		}
		System.out.println();
	}

}
