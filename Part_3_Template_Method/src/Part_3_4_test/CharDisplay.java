package Part_3_4_test;


public class CharDisplay implements AbstractDisplay{
// ConcreteClass(구현 클래스)
	private char ch;
	
	// 생성자
	public CharDisplay(char ch){
		this.ch=ch;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.print("<<");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(ch);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.print(">>");
	}
	
}
