package OppsProgrammingPractice;

public class compliPoly {

	void show() {
		System.out.println("without param");

	}

	void show(int a) {
		System.out.println(a);
	}

	void show(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		compliPoly ob = new compliPoly();

		ob.show();
		ob.show(10);
		ob.show(10, 20);

	}

}
