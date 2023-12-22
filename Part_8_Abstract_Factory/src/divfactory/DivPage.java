package divfactory;

import factory.Page;
import factory.Item;

public class DivPage extends Page{

	public DivPage(String title,String author){
		super(title,author);
		
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("<!DOCTYPE html>\n");
		sb.append("<html><head><title>");
		sb.append(title);
		sb.append("</title><style>\n");
		sb.append("div.TRAY{padding:0.5em; margin-left:5em; border:1px solid black; }\n");
		sb.append("div.LINK{padding:0.5em; background-color: lightgray; }\n");
		sb.append("</style></head><body>\n");
		sb.append("<h1>");
		sb.append(title);
		sb.append("</h1>\n");
		
		for(Item item: content){
			sb.append(item.makeHTML());
		}
		return sb.toString();
		
	}
}
