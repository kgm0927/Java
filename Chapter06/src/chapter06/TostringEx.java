package chapter06;

// 개발자는 클래스를 리턴할 때, Object의 toString()을 오버라이딩하여 자신만의 문자열을 리턴할 수 있다.1
// 예제 6-2: Point 클래스에 toString() 작성
public class TostringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Point p=new Point(2,3);
			System.out.println(p.toString());
			System.out.println(p);		// p는 p.toString()으로 자동 변환
			System.out.println(p+"입니다.");		// p.toString()+"입니다"로 자동 변환
	}

}
