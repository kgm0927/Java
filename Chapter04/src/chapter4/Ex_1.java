package chapter4;
// page 227
class StaticSample_1{
	public int n;
	public void g(){
		m=20;
	}
	public void h(){
		m=30;
	}
	public static int m;
	
	public static void f(){
		m=5;
	}
}


public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSample.m=10;
		
		StaticSample s1;
		s1=new StaticSample();
		System.out.println(s1.m);
		s1.f();
		StaticSample.f();
	}

}
