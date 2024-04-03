package opps;

abstract class Operation{
	
	
	abstract void  sum();
	abstract void sub();
	abstract void mul();
	abstract void div();
	
	
}
public class test extends Operation{
	int n1=5;
	int n2=8;
	test t1 =new test();
	@Override
	void sum() {
		// TODO Auto-generated method stub
		System.out.println(n1+n2);
		
	}
	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println(n1-n2);
		
	}
	@Override
	void mul() {
		// TODO Auto-generated method stub
		System.out.println(n1*n2);
		
	}
	@Override
	void div() {
		// TODO Auto-generated method stub
		System.out.println(n1/n2);
		
	}
	
	
	
}