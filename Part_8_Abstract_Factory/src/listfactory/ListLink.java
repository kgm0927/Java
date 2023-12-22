package listfactory;

import factory.Link;


public class ListLink extends Link{

	
	public ListLink(String caption,String url){
		super(caption,url); // 왜 추상 클래스에서 상속받는 것은 super로 꼭 가져오는가?
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return "	<li><a href=\"" +url+"\">"+caption+"</a></li>\n";
	}

}
