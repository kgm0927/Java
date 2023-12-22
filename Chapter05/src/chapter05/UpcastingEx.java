package chapter05;

// page 270
class Person_2{
	String name;
	String id;
	public Person_2(String name){
		this.name=name;
	}
}

class Student_2 extends Person_2{
	 String grade;
	String department;
	
	
	public Student_2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person_2 p;
			Student_2 s=new Student_2("이재문");
			
			p=s;
			
			System.out.println(p.name);
	}

}
