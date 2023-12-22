
public class IncreaseDisplay extends CountDisplay{
// 구현 계층
	
	private int step;
	
	public IncreaseDisplay(DisplayImpl impl,int step) {
		super(impl);
		this.step=step;// 1의 배수, 2의 배수, 3의 배수 이 방식대로 늘어남.
		// TODO Auto-generated constructor stub
	}
	

	
	public void increaseDisplay(int level){
		int count=0;
		for(int i=0;i<level;i++){
			multiDisplay(count);
			count+=step;
		}
		
	}

	
}
