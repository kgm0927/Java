
public class SideBorder extends Border{
	private char borderChar;

	protected SideBorder(Display display,char ch) {
		super(display);
		// TODO Auto-generated constructor stub
		this.borderChar=ch;
	}

	
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		// 문자의 수는 내용물의 양쪽에 장식 문자만큼 더한 것
		return 1+display.getColumns()+1;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		// 행수는 내용물을 행 수와 같다.
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		// 지정 행의 내용은 내용물의 지정 행 양쪽에 장식 문자를 붙인 것.
		return borderChar+display.getRowText(row)+borderChar;
	}

	
}
