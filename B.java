package SmartProgrammingOOPS;

class B {

	void showA() {

		System.out.print("A method");
	}
}

class A extends B {

	void showB() {

		System.out.println("B method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1 = new B();
		ob1.showA();
		B ob2 = new B();
		ob2.showA();
		ob2.showA();

	}
}