
public class Display {// abstraction

	private DisplayImpl impl;// 추상 클래스
	
	public Display(DisplayImpl impl){
		this.impl=impl;
	}
	
	

	


	public void open(){
		impl.rawOpen();
	}
	public void print(){
		impl.rawPrint();
	}
	
	public void close(){
		impl.rawClose();
	}
	
	public final void display(){
		open();
		print();
		close();
	}
	
}