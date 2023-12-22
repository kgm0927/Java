
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreaseDisplay d1=new IncreaseDisplay(new CharDisplayImpl('<','*','>'),1);
		IncreaseDisplay d2=new IncreaseDisplay(new CharDisplayImpl('|','#','-'),2);
		d1.increaseDisplay(4);
		d2.increaseDisplay(6);
	}

}
