package SmartProgrammingOOPS;

public class constructors {
	int i;
	String s;
	// default constructors

	// no arguments constructor
	constructors() {
		System.out.println("no argument constructor");
	}
	 
//parameterised costructor
	
	constructors(int a){
		System.out.println("parameterised constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructors t = new constructors();
		System.out.println(t.i + " " + t.s);
		constructors a = new constructors(10);

	}

}
