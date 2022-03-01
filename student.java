package main;

public class Student1 {
	private String name;
	private int age;
	private long rollno;
	private char sex;
	
	public Student1(String name, int age, long rollno, char sex) {		
		this.name = name;
		this.age=age;
		this.rollno=rollno;
		this.sex=sex;
		
	}//parameterised constructor
	
	public Student1() {
		System.out.println("object created");
	}//default constructor
	
	void display()
	{
		System.out.println(name+"\t"+age+"\t"+rollno+"\t"+sex);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1("Jon",18,1212,'M');
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}
