package oppspackge;

class parent1 {

	void display() {
		int a = 10;
		System.out.println(a);

	}
}

class parent2 extends parent1 {

	void display2() {
		int b = 20;
		System.out.println(b);

	}
}

public class multilevelInheritance extends parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multilevelInheritance ob = new multilevelInheritance();
		ob.display2();
		ob.display();

	}

}
