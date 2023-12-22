package chapter05;

// 예제 5-8: 인터페이스 구현
interface PhoneInterface{	// 인터페이스 선언
	final int TIMEOUT=10000;// 상수 필드 선언
	void sendcall();		// 추상 메서드
	void receiveCall();		// 추상 메서드
	default void printLogo(){	// default 메서드
		System.out.println("** Phone **");
		func();
	}
	private void func(){
		System.out.print("private");
	}
}


class SamsungPhone implements PhoneInterface{// 인터페이스 구현
	// PhoneInterface의 모든 추상 메서드

	@Override
	public void sendcall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리리링");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
		
	}
	// 메서드 추가 작성
	public void flash(){
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SamsungPhone phone=new SamsungPhone();
			phone.printLogo();
			phone.sendcall();
			phone.receiveCall();
			phone.flash();
	}

}
