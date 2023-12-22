package idcard;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory{// ConcreteCreator


	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
	
		return new IDCard(owner); //IDCard 자체를 반환
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product+"을 등록했습니다.");
	}
	
}
