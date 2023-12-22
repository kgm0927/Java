


public abstract class Builder {// Builder
	// 복합체를 구축하기 위해 인터페이스(추상 클래스)를 선언함.
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
