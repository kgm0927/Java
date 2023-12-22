package idcard;

import framework.Product;


public class IDCard extends Product{// ConcreteProduct

	private String owner;

	
	IDCard(String owner){
		System.out.println(owner+"의 카드를 만듭니다.");
		this.owner=owner;

	}

	
	public String toString(){
		return "[IDCard:"+owner+"]";
	}
	
	public String getOwner(){
		return owner;
	}


	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(this+"을 사용합니다.");
	}
	
	

}
