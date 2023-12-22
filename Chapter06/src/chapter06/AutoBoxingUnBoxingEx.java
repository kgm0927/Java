package chapter06;


// 예제 6-6: 박싱과 언박싱
public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=10;
			Integer intObject=n;
			System.out.println("intObject = "+intObject);
			
			int m=intObject+10;
			System.out.println("m = "+m);
	}

}
