package oppspackge;

class parent {
	private int a = 10;
	public int f = 20;
	protected int c = 30;

	void display() {
		
		System.out.println(f);
	}
	/*public static void main(String[] args) {
		parent ob1 = new parent();
		System.out.println(ob1.f);
	}*/
}

public class Accessspecifier1 extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accessspecifier1 ob = new Accessspecifier1();
		System.out.println(ob.c);
		ob.display();

	}
}
