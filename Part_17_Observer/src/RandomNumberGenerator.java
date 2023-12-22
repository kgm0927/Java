import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{

	private Random random=new Random();		// 난수 생성기
	private int number;						// 현재 수
	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return number;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++){
			number=random.nextInt(50);
			notifyObservers();
		}
	}
}
