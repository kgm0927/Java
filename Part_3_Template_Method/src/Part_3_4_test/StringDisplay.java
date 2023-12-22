package Part_3_4_test;


public class StringDisplay implements AbstractDisplay{
	
	private String string;
	private int width;

	
	public StringDisplay(String string){
		this.string=string;
		this.width=string.length();
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("|"+string+"|");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		printLine();
	}
	
	
	// open과 close에서 호출되어 "+----+" 문자열을 표시하는 메소드
	private void printLine(){
		System.out.println("+");
		for(int i=0;i<width;i++){
			System.out.print("-");
		}
		System.out.println("+");
	}

}
