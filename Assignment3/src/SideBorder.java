
public class SideBorder extends Border{
	


	private char borderChar;
	
	protected SideBorder(Display display,char ch) {
		super(display);
		this.borderChar=ch;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return 1+display.getColumns()+1;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		return borderChar+display.getRowText(row)+borderChar;
	}

}
