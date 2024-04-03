package OppsProgrammingPractice;

class A {
	int a = 10;
	int b = 20;

	void show() {
		System.out.println(a + b);
	}
}

class B extends A {

	public static void main(String[] args) {
		B ob = new B();
		ob.show();
	}
}

public class hirachical extends A {
	int b = 20;
	int c = 40;

	void sum() {
		System.out.println(b + c);
	}

	public static void main(String[] args) {

		hirachical obj = new hirachical();
		obj.show();
		obj.sum();

	}

}
