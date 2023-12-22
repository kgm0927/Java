package chapter05;


// page 271
public class DowncastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_2 p=new Student_2("이재문");		// 이렇게 바로 업캐스팅이 가능하다.
		
		Student_2 s;
		
		s=(Student_2)p;	// 다운캐스팅 명시적으로 타입 변환을 지정해야 한다. 
		
		System.out.println(s.name);	// 오류 없음
		s.grade="A";// 오류 결정
		
	}

}
