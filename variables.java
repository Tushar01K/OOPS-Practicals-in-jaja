package oppspackge;

public class variables {

	// Instannce variable

	int a = 10;

	static int b = 20; // static variable

	public void display() {

		int c = 30; // local variable

		System.out.println(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		variables ob = new variables();
		System.out.println(ob.a);
		System.out.println(b);
		ob.display();

	}

}
