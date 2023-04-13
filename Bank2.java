package Abstraction;

abstract class Bank2 {
	abstract int rateofinterest();
}
class RBI extends Bank2{
	 int rateofinterest() {
		 return 8;
		 
	 }
}
class PNB extends Bank2{
	 int rateofinterest() {
		 return 9;
	 }
}
class BOB extends Bank2{
	 int rateofinterest() {
		 return 6;
	 }
}
class abstract_eg{
	 public static void main (String args[]) { 
	 Bank2 bank;
	 bank=new PNB();
	 System.out.println(bank.rateofinterest());
   }
}