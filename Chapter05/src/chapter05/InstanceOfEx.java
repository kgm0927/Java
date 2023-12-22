package chapter05;



// 예제 5-4: instanceof 연산자 활용
class Person_3{
	
}
class Student_3 extends Person_3{
	
}
class Researcher extends Person_3{
	
}

class Professor extends Researcher{
	
}

public class InstanceOfEx {
	
	static void print(Person_3 p){
		if(p instanceof Person_3)
			System.out.print("Person ");
		if(p instanceof Student_3)
			System.out.print("Studnet ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("new Student() ->\t"); print(new Student_3());
		System.out.print("new Student() ->\t");	print(new Researcher());
		System.out.print("new Student() ->\t");	print(new Professor());
		
	}

	
}
