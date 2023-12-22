package framework;

public interface Product extends Cloneable {

	public abstract void use(String s);
	public abstract Product creatCopy();// 추상 메소드로서, 객체를 복사, 반환한다.
}
