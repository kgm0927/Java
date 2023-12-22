
public class NoSupport extends Support {
// 항상 resolve 메서드는 false를 반환한다. 즉 아무것도 해결하지 않는 클래스이다.
	public NoSupport(String name){
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return false;
	}

}
