package Abstraction1;

public interface Shape {
	void shape_name ();
	
 public void Shape_name() {
	 System.out.println("Draw a circle");
 }
	

}
 class User_Tringle implements Shape{
	 
	 @Override
	 public void shape_name() {
		 System.out.println("Draw a tringle");
	 }
 }
  class Interface2{
	 public static void main(String args[]) {
		 Shape object = new User_Tringle();
		 object.shape_name();
	 }
 }