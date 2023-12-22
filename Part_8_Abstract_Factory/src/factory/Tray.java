package factory;


import java.util.*;

public abstract class Tray extends Item {

	
	protected List<Item> tray=new ArrayList<>();
	
	public Tray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}
	
	public void add(Item item){
		tray.add(item);
	}

}
