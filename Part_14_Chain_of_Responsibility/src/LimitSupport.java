
public class LimitSupport extends Support{
// LimitSupport 클래스는 limit로 지정한 번호 미만의 문제를 해결하는 클래스이다.
	
	private int limit;		// 이 번호 미만이면 해결할 수 있다.
	
	public LimitSupport(String name,int limit){
		super(name);
		this.limit=limit;
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
	
		if(trouble.getNumber()<limit){
			return true;
		}
		else{
			return false;
		}
	}

	
	
}
