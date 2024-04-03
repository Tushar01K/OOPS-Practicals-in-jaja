package opps;

public class opps extends Pen {
	
	public void write() {
		System.out.println("oops class");
	}
	
	public void write(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		opps pen1 = new opps();
		
		pen1.write();
		pen1.write(10);
		
		
	}
	
}

class Pen {
	String color = "red";
	String type = "gel";

	public void write() {
		System.out.println("write a code");
		System.out.println(color);
		System.out.println(type);
	}

}
