
public abstract class Display {

	
	public abstract int getColumns();				// 가로 문자 수를 읽는다.
	public abstract int getRows();					// 세로 행수를 읽는다.
	public abstract String getRowText(int row);		// row행째 문자열을 읽는다.
	
	
	public void show(){
		for(int i=0;i<getRows();i++){
			System.out.println(getRowText(i));
		}
	}
}
