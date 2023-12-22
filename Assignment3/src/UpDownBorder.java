
public class UpDownBorder extends Border
{

	private char decochar;
	
	protected UpDownBorder(Display display,char decochar) {
		super(display);
		this.decochar=decochar;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns();
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1+display.getRows()+1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		
		
		if(row==0) {
			for(int i=0; i<getColumns();i++)
			sb.append(decochar);
			
			return sb.toString();
		}
		else if(row==(display.getRows()+1)){
			for(int i=0; i<getColumns();i++)
				sb.append(decochar);
				
				return sb.toString();
		}else {
			return display.getRowText(row-1);
		}
	}

}
