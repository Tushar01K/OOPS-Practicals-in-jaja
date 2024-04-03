package oppspackge;

class variable {

	private int a = 10;/* accesible only in that class */
	public int b = 20;/* Accesible in all class */
	protected int c = 30; /*
							 * accesible in same class and class in same package and class which is derived
							 * form that class
							 */

	void display() {

		System.out.println(a);
		
	}
	public static void main(String[] args)
	{
		variable ob1=new variable();
		System.out.println(ob1.a);
	}

}

public class AccessSpecifire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		variable ob = new variable();
		System.out.println(ob.b);
		ob.display();

	}

}
