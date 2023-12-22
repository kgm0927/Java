package Main;



import framework.Product;

public class MessageBox implements Product{

	private char decochar;
	
	public MessageBox(char decocher){
		this.decochar=decocher;
	}

	public MessageBox(MessageBox prototype){
		this.decochar=prototype.decochar;
	}
	
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int decolen=1+s.length()+1;
		for(int i=0;i<decolen;i++){
			System.out.print(decochar);
		}
		
		System.out.println();
		
		System.out.println(decochar+s+decochar);
		
		for(int i=0;i<decolen;i++){
			System.out.print(decochar);
		}
		
		System.out.println();
	}

	@Override
	public Product creatCopy() {
		// TODO Auto-generated method stub
		Product p=null;
		try{
			p=(Product)clone();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}
	
	

}
