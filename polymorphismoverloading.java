package opps;
class d{
	
	void display() {
		
		System.out.println("good morning");
	}
	void display( int a) {
		System.out.println(a);
	}
	void display( int a, int b) {
		
		System.out.println(a +" "+ b);
	}
	void display(String a,int b) {
		
		System.out.println(a +" "+ b );
	}
	
}
public class polymorphismoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d ob = new d();
		ob.display(45);
		ob.display(43,67);
		ob.display("abcd",76);
		ob.display();

	}

}
