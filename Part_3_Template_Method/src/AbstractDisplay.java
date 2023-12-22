

public abstract class AbstractDisplay {
// AbstractClass(추상 클래스) 역
	
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();
	
	// display는 AbstractDisplay에서 구현하는 메소드
	
	public final void display(){
		open();
		for(int i=0;i<5;i++){
			print();
		}
		close();
	}
	
}
