package Main;


import framework.Product;
import framework.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager=new Manager();
		UnderlinePen upen=new UnderlinePen('-');
		MessageBox mbox=new MessageBox('*');
		MessageBox sbox=new MessageBox('/');
		
		// 등록
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		
		// 생성과 사용1
		Product p1=manager.create("strong message");// manager 함수의 create 함수를 사용함.
		p1.use("Hello world.");
		
		Product p2=manager.create("warning box");	
		p2.use("Hello, world.");
		
		
		Product p3=manager.create("slash box");
		p3.use("Hello, world");
		
		
	}

}
