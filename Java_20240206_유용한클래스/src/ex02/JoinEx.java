package ex02;

public class JoinEx {

	public static void main(String[] args) {

		String animals = "dog,cat,bear";
		
		String[] arr = animals.split(",");
	
		for(String a : arr)
			System.out.println(a);
		
		String str = String.join("-", arr);
		System.out.println(str);
		
		str = String.join("", arr);
		System.out.println(str);
	}

}
