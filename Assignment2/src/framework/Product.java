package framework;

public abstract class  Product implements Cloneable {
	
	Product p=null;
	
	


	public abstract void use(String s);
	
	public  Product creatCopy(){
	
		try{
			p= (Product) clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
			
			return p;
		
		
	}
}
