import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{// Composite


	
	
	private String name;
	private List<Entry> directory=new ArrayList<>();// children 속성
	
	
	public Directory(String name){
		this.name=name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size=0;
		for(Entry entry: directory){
			size+=entry.getSize();
		}
		return size;
	}
	@Override
	protected void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix+"/"+this);
		for(Entry entry:directory){
			entry.printList(prefix+"/"+name);// 업캐스팅 된 클래스로 Directory가 될 수 있고 File이 될 수 있다.
		}
	}
	
	// 디렉터리 엔트리를 디렉터리에 추가한다.
	
	public Entry add(Entry entry){
		directory.add(entry);
		entry.setParent(this);
		return this;		// 현재 이 객체를 리턴함.
	}
	
	public Entry remove(){
		
		directory.remove(getSize()-1);
		
		return this;
	}
}
