
public abstract class Entry {// Component// 
	// Leaf와 Composite의 상위 클래스로서 이들을 동일시 하는 공통 인터페이스이다.

	private Entry parent;
	
	// 이름을 얻는다.
	public abstract String getName();
	
	
	// 크기를 얻는다.
	public abstract int getSize();
	
	public void printList(){
		printList("");
	}
	
	
	protected void setParent(Entry parent){
		this.parent=parent;
	}
	
	// prefix를 앞에 붙여서 목록을 표시한다.
	protected abstract void printList(String prefix);
	
	public String toString(){
		return getName()+" ("+getSize()+")";
	}
	
	
	public String getFullName(){
		StringBuilder fullname=new StringBuilder();
		
		Entry entry=this;
		do{
			fullname.insert(0, entry.getName());
			fullname.insert(0,"/");
			entry=entry.parent;
			
		}while(entry!=null);
		
		return fullname.toString();
	}
	
	
{
		}
}
