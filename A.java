package Assignment;

public class A {
	void run() {
		System.out.println("Parent class method");
		
	}

}
class B extends A{
	void run() {
		System.out.println("child class implementation");
		
	
	
	}
} 
 class Runtime_poly_upcasting {
	public static void main (String args[]) {
		A obj=new B();
		obj.run();
	}
}