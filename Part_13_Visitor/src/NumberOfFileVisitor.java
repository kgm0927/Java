
public class NumberOfFileVisitor extends Visitor 
{

	private int file_cnt;
	
	public int file_count(){
		return file_cnt;
	}

	public NumberOfFileVisitor(){
		this.file_cnt=0;
	}
	
	
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		file_cnt++;
	}

	@Override
	public void visit(Directory directory) {
		// TODO Auto-generated method stub
		
		for(Entry entry: directory){
			entry.accept(this);
		}
		
		
		
		
	}

	
	
	
	
	
	

}
