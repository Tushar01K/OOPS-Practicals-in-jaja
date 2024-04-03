package oppspackge;

import java.net.MulticastSocket;

class A {
	void show() {
		int a = 10;
		System.out.println(a);
	}
}

class B extends A {
	void display()
	{
		System.out.println("B");
	}
}

class C extends A
{
	void display1()
	{
		System.out.println("C");
	}
}
public class hirarchicalInheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		ob.display();
		ob.show();
        
		
		C ob1=new C();
		ob1.display1();
		ob1.show();
	}

}
