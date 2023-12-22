package divfactory;

import factory.*;


public class DivFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		// TODO Auto-generated method stub
		 return new DivLink(caption,url);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return new DivTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new DivPage(title,author);
	}

}
