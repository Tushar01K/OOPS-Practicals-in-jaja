package OppsProgrammingPractice;

class Parent {

	void show(int a, int b) {
		System.out.println(a + b);
	}

}

public class RunTimePoly extends Parent {

	void show(int a, int b) {
		super.show(20, 30);
		System.out.println(a - b);

	}

	public static void main(String[] args) {

		RunTimePoly ob = new RunTimePoly();
		ob.show(10, 20);

	}

}