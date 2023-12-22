package Part_3_4_test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay d1=new CharDisplay('H');
		
		AbstractDisplay d2=new StringDisplay("Hello, world.");
		
		d1.display();
		d2.display();
	}

}
/*
 * 
 * Template Method 패턴이란 무엇인가?
 * 
 * 이 장에서 학습할 Template Method 패턴은 탬플릿 기능을 가진 패턴이다.
 * 상위 클래스 쪽에 템플릿이 될 메소드가 정의되어 있고, 그 메소드 정의에 추상 메소드가
 * 사용된다. 따라서 상위 클래스의 코드만 봐서는 최종적으로 어떻게 처리되는지 알 수 없다.
 * 
 * 
 * 
 * */

