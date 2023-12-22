
public class DigitObserver implements Observer{

	private int i=0;
	@Override
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
	
		i++;
		System.out.print(i+":");
		System.out.println("DigitObserver:"+generator.getNumber());
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}
	}

}
