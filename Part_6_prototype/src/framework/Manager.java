package framework;


import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map<String,Product> showcase=new HashMap();// 업캐스팅
	
	
	public void register(String name,Product prototype){
		showcase.put(name, prototype);
	}
	
	public Product create(String prototypeName){
		Product p=showcase.get(prototypeName);
		return p.creatCopy();// 해시맵에서 Product 반환
	}
	
}
