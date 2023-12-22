package chapter05;

class Shape_2{
	protected String name;
	public void paint(){
		draw();
	}
	public void draw(){
		System.out.println(name);
	}
}


public class Circle5_p_287 extends Shape_2{

	protected String name;
	
	@Override
	public void draw(){
		name="Circle";
		super.name="Shape";
		super.draw();
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape_2 b=new Circle5_p_287();
		b.paint();
	}

}
