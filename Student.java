package Super;

public class Student {
	int stu_id;
    String name;
    Student (int stu_id, String name) { 
    this.stu_id=stu_id;
    this.name=name;
}}

	class Course extends Student{
       float cou_fees;
	Course(int stu_id, String name, float cou_fees){ 
		super (stu_id, name);
	}
    
	void show () {
    System.out.println(stu_id+" "+name+" "+ cou_fees );
	}
	public class Solapur_Batch {

	public static void main(String[] args){ 
		Course obj = new Course (1, "Vaibhav DTK", 2500f); 
		obj.show();
	}
	}
	}


