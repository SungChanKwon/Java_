package ex03;

public class Magazine extends Book{

	Magazine(String title, String author, int publishYear){
		super(title, author, publishYear);
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + " : 발행주기";
	}

	
	
}
