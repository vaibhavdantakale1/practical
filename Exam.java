package Assignment;

public class Exam {
	int marks () {
		return 0;
	}}
   class comp extends Exam{
	   int marks () {
		   return 80;
	   }}
   class math extends Exam{
	   int marks () {
		   return 70;
	   }}
   class science extends Exam {
	   int marks () {
		   return 50;
		   
	   }}
   class eng extends Exam {
	   int marks () {
		   return 90;
		   
	   }}
   class Overriddinggen{
	   public static void main (String args[]) {
		   comp c = new comp();
		   math m =new math ();
		   science s= new science ();
		   eng e = new eng ();
		   System.out.println("computer marks is :"+c.marks ());
		   System.out.println("math mark is:"+m.marks());
		   s.marks();
		   e.marks();
		   
	   }
}
