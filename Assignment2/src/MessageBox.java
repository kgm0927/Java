



import framework.Product;

public class MessageBox extends Product{

	private char decochar;
	
	public MessageBox(char decocher){
		
		this.decochar=decocher;
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



}
