package idcard;

import framework.Product;


public class IDCard extends Product{

	private String owner;
	private int num;
	
	IDCard(String owner,int num){
		System.out.println(owner+"의 "+num+"번 카드를 만듭니다.");
		this.owner=owner;
		this.num=num;
	}

	
	public String toString(){
		return "[IDCard:"+owner+"("+num+") ]";
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
