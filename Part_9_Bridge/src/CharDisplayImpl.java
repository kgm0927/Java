
public class CharDisplayImpl extends DisplayImpl {
// 구현 계층
	private char head;
	private char body;
	private char foot;
	
	
	public CharDisplayImpl(char head,char body,char foot){
		this.body=body;
		this.head=head;
		this.foot=foot;
	}
	
	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		System.out.print(head);
	}

	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		System.out.print(body);
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		System.out.println(foot);
	}

	
}
