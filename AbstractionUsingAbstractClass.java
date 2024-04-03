package OppsProgrammingPractice;

abstract class abclass{
	public abstract void add();
	public abstract void sum();
	
	
	
}

public class AbstractionUsingAbstractClass extends abclass {
	
	int a=10;
	int b=20;
	@Override
	public void add() {
		System.out.println(a+b);
		
	}
	@Override
	public void sum() {
		System.out.println(a-b);
		
	}
	
	public static void main(String[]args) {
		AbstractionUsingAbstractClass ob = new AbstractionUsingAbstractClass();
		ob.add();
		ob.sum();
		
		
		
	}
	

}
