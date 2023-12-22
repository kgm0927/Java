
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display b1=new StringDisplay("Hello world");	// 업캐스팅
		Display b2=new SideBorder(b1,'#');				// 업캐스팅
		Display b3=new FullBorder(b2);					// 업캐스팅
		
		b1.show();
		b2.show();
		b3.show();
		
	Display b4=new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("Hello world.")),'*'))),'/');
	
	b4.show();
	}

}
