package OppsProgrammingPractice;

interface abstractMethods {

	public void add();

	public void sub();
}

public class interfaces implements abstractMethods {
	int a = 10;
	int b = 20;

	@Override
	public void add() {

		System.out.println(a + b);
	}

	@Override
	public void sub() {
		System.out.println(a - b);

	}

	public static void main(String[] args) {
		interfaces ob = new interfaces();
		ob.add();
		ob.sub();

	}
}
