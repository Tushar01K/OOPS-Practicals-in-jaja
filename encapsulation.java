package opps;
class A{
	
	public int a =23;
	private int b =56;
	protected int c=89;
	void B(){
		System.out.println(b);
		
		
		
	}
	
	
}
public class encapsulation extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encapsulation ob = new encapsulation();
		System.out.println(ob.a);
		System.out.println(ob.c);
		
	}

}
