


import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new IDCardFactory(); // 업캐스팅
		Product card1=factory.create("Youngjin Kim");// IDCard에서 Product로 업캐스팅 밑에 것도 동일
		Product card2=factory.create("HeungMin son");
		Product card3=factory.create("Kane");
		
		card1.use();
		card2.use();
		card3.use();
		
	}

}
