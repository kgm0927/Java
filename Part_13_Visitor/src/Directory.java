import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Directory extends Entry implements Iterable<Entry>{

	
	private String name;
	private List<Entry> directory=new ArrayList<>();
	
	
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
		for(Entry entry:directory){
			size+=entry.getSize();
		}
		return size;
	}

	
	public Entry add(Entry entry){
		directory.add(entry);
		return this;
	}
	
	
	@Override
	public Iterator<Entry> iterator() {
		// TODO Auto-generated method stub
		return directory.iterator();
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	

}
