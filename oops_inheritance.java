package opps;

class Parent {
	int eno = 101;
	String ename = "tej";

	void display() {
		System.out.println(eno);
		System.out.print(ename);

	}
}

public class oops_inheritance extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to child class");
		oops_inheritance ob = new oops_inheritance();
		ob.display();

	}

}
