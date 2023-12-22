 package Part_3_4_test;


public interface AbstractDisplay {
// AbstractClass(추상 클래스) 역
	
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	// display는 AbstractDisplay에서 구현하는 메소드
	
	 default void display(){
		open();
		for(int i=0;i<5;i++){
			print();
		}
		close();
	}
	
}
