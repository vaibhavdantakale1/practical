package Super;

public class Shape_2 {
	String name= "circle";
	}
class size extends Shape_2{
	String name="NO size";
	void print() {
		System.out.println(name);
		
		System.out.println(super.name);
	}}
    
    class SuperIV{
    	public static void main(String args[]) {
    		size obj= new size();
    		obj.print();
    	}
    }