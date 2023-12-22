package chapter4;

// 예제 4-1: Circle 클래스의 객체 생성 및 활용
public class Circle4_1 {

	int radius;
	String name;
	
	public Circle4_1(){}
	
	public double getArea(){
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle4_1 pizza;								// 레퍼런스 변수 pizza 선언
	pizza=new Circle4_1();
	pizza.radius=10;
	pizza.name="자바피자";
	double area=pizza.getArea();
	System.out.println(pizza.name+"의 면적은"+area);
	
	
	Circle4_1 donut=new Circle4_1();
	donut.radius=2;
	donut.name="자바도넛";
	area=donut.getArea();
	System.out.println(donut.name+"의 면적은"+area);
	
	}

}
