package idcard;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory{

	private int num=0;
	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		int insert=++num;
		return new IDCard(owner,num);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+"을 등록했습니다.");
	}
	
}
