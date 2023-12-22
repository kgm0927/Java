package chapter06;


// 예제 6-1: Object 클래스로 객체의 속성 알아내기
public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a=new Point(2,3);
		Point b=new Point(2,3);
		Point c=new Point(2,3);
		
		if(a==b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equals to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
	}

}
