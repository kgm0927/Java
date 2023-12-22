package Part_5_2_test;

import java.util.*;
public class Triple {
	private static Map<String,Triple> map=new HashMap<>();

	static{

		String[] names={
				"ALPHA","BETA","GAMMA"
		};
		Arrays.stream(names).forEach(s->map.put(s, new Triple(s)));
		
	}
	
	private String name;

	
	private Triple(String name){
		System.out.println("The instance "+name+" is created");
		this.name=name;
	}
	
	public static Triple getInstance(String name){
		return map.get(name);
	}
	
	public String toString(){
		return name;
	}
	
}
