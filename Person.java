package ProbleS1;

public class Person {
	String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

publi class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("I am studying in grade " + grade + ".");
    }
}

   public class Main {
    public static void main(String[] args) {
        Student myStudent = new Student("John", 16, 10);
        myStudent.speak();
        myStudent.study();
    }
}

