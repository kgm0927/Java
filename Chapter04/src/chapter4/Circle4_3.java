package chapter4;


// 예제 4-3: 두 개의 생성자를 가진 Circle 클래스
public class Circle4_3 {
	int radius;
	String name;
	
	
	public Circle4_3(){
		radius=1;
		name="";
	}
	
	public Circle4_3(int r,String n){
		radius=r;
		name=n;
	}
	
	public double getArea(){
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle4_3 pizza=new Circle4_3(10,"자바피자");
		
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		Circle4_3 donut=new Circle4_3();
		donut.name="도넛피자";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
	}

}
