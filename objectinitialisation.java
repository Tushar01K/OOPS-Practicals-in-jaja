package SmartProgrammingOOPS;

public class objectinitialisation {

	String color;
	int age;

	void intObj(String c, int a) {
		color = c;
		age = a;

	}

	void display() {
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectinitialisation a = new objectinitialisation();
		a.intObj("black", 20);
		a.display();
	}

}
