
public class GraphObserver implements Observer{

	
	@Override
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
	System.out.print("GraphObserver:");
	
	int count=generator.getNumber();
	
	for(int i=0;i<count;i++){
		System.out.print('*');
	}
	System.out.println("");
	
	try{
		Thread.sleep(1000);
				
	}catch(InterruptedException e){
		
	}
	
	}

}