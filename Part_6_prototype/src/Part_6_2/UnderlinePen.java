package Part_6_2;



import framework.Product;

public class UnderlinePen implements Product {

	
	private char ulchar;
	
	public UnderlinePen(char ulchar){
		this.ulchar=ulchar;
	}
	
	public UnderlinePen(UnderlinePen pen){
		this.ulchar=pen.ulchar;
	}
	
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int ulen=s.length();
		
		System.out.println(s);
		
		for(int i=0;i<ulen;i++){
			System.out.print(ulchar);
			
		}
		System.out.println();
	}

	@Override
	public Product creatCopy() {
		// TODO Auto-generated method stub
		return new UnderlinePen(this);
	}
	
	
	


}
