package ex03;

public class Computer extends Product{

	Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer [toString()=" + super.toString() + "]";
	}
	
	
}
