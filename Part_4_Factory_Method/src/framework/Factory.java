package framework;

public abstract class Factory {// Create

	protected abstract Product createProduct(String owner); // Factory Method
	// 추상 메소드로서 Product 타입의 객체를 생성하여 반환하는 role method
	
	protected abstract void registerProduct(Product product);

	public final Product create(String owner){
		Product p= createProduct(owner);// IDCard에 작성된 것을 가져옴.// IDCard에 return new IDCard(); 형태로 되어 있음 
		registerProduct(p);
		return p;
	}
}
