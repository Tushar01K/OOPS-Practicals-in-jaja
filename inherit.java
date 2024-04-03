package opps;

class C {

	int a = 10;
	int b = 20;

	void display() {
		System.out.println(a + b);
	}
}

class B extends C {

	void display() {

		System.out.println(40 + 78);
	}
}

public class inherit extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		obj.display();

	}

}
