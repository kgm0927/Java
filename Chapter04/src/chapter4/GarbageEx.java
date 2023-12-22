package chapter4;


// 예제 4-9: 가비지의 발생
public class GarbageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a=new String("Good");
		String b=new String("Bad");
		String c=new String("Normal");
		
		String d,e;
		a=null;
		d=c;
		c=null;
		
	}

}
