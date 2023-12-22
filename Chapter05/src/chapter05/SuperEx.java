package chapter05;

// 예제 5-3: super()를 활용한 ColorPoint 작성
class Point_2 {
	private int x,y;
	public Point_2(){
		this.x=this.y=0;
		
	}
	
	public Point_2(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void showPoint(){// 점의 좌표 출력
		System.out.println("("+x+","+y+")");
		
	}
}


class ColorPoint_2 extends Point_2{
	private String color;
	public ColorPoint_2(int x, int y, String color){
		super(x,y);
		this.color=color;
	}
	
	public void showColorPoint(){
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ColorPoint_2 cp=new ColorPoint_2(5,6,"blue");
			cp.showColorPoint();
	}

}
