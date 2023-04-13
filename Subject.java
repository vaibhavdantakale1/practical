package Assignment;

public class Subject {
	
	    int marks;
	}

	class Maths extends Subject {
	    Maths(int marks) {
	        this.marks = marks;
	    }
	}

	class Science extends Subject {
	    Science(int marks) {
	        this.marks = marks;
	    }
	}

	class Computer extends Subject {
	    Computer(int marks) {
	        this.marks = marks;
	    }
	}

	class English extends Subject {
	    English(int marks) {
	        this.marks = marks;
	    }
	}

	  class Main {
	    public static void main(String[] args) {
	        Subject[] subjects = new Subject[5];
	        subjects[0] = new Maths(90);
	        subjects[1] = new Science(85);
	        subjects[2] = new Computer(95);
	        subjects[3] = new English(80);
	        subjects[4] = new Science(90);
	        
	        // Upcasting to call Computer and English marks
	        for (Subject subject : subjects) {
	            if (subject instanceof Computer) {
	                System.out.println("Computer marks: " + subject.marks);
	            }
	            if (subject instanceof English) {
	                System.out.println("English marks: " + subject.marks);
	            }
	        }
	    }
	}


