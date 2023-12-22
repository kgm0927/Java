
public class ListVisitor extends Visitor {

	// 현재 주목하는 디렉터리 이름
	
	private String currentdir="";
	
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println(currentdir+"/"+file);
	}

	@Override
	public void visit(Directory directory) {
		// TODO Auto-generated method stub
		System.out.println(currentdir+"/"+directory);	// Entry의 toString을 사용함.
		String savedir=currentdir;
		currentdir=currentdir+"/"+directory.getName();
		for(Entry entry: directory){
			entry.accept(this);
		}
		currentdir=savedir;
		
	}

}
