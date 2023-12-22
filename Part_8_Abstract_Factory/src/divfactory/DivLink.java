package divfactory;

import factory.Link;

public class DivLink extends Link {

	public DivLink(String caption, String url) {
		super(caption, url);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return "<div class=\"LINK\"><a href=\""+url+"\">"+caption+"</a></div>\n";
	}

}
