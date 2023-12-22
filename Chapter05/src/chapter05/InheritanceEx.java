package chapter05;


// 예제 5-2: 상속 관계에 있는 클래스간 멤버 접근
class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight){
		this.weight=weight;
	}
	
	public int getWeight(){
		return weight;
	}
}


class Student extends Person{
	public void set(){
		age=30;				// 슈퍼 클래스의 디폴트 멤버 접근 가능
		name="홍길동";		// 슈퍼 클래스의 public 멤버 접근 가능
		height=175;			// 슈퍼 클래스의 protected 멤버 접근 가능
		// weight=99;		// 오류. 슈퍼 클래스의 private 멤버 접근 불가
		setWeight(99);		// private 멤버 weight은 setWeight()으로 간접 접근
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.set();
	}

}
