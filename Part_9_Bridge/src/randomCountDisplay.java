


import java.util.Random;

public class randomCountDisplay extends CountDisplay{// 기능 계층

	public randomCountDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public void randomDisplay(int times){
		
		Random ran=new Random();
		
		int num=ran.nextInt(0, times);
		
		multiDisplay(num);
		
		
	}

}
