


import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new IDCardFactory();
		Product card1=factory.create("Youngjin Kim");
		Product card2=factory.create("HeungMin son");
		Product card3=factory.create("Kane");
		
		card1.use();
		card2.use();
		card3.use();
		
	}

}
