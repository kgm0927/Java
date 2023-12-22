
public class Player {
	private String name;
	private Strategy strategy;// Strategy 객체를 가져옴
	private int wincount;
	private int losecount;
	private int gamecount;
	
	// 이름과 전략을 받아서 플레이어를 만든다.
	public Player(String name,Strategy strategy){
		this.name=name;
		this.strategy=strategy;
	}
	
	// 전략에 따라 다음 손을 결정한다.
	public Hand nextHand(){
		return strategy.NextHand();
	}
	
	// 승리
	public void win(){
		strategy.study(true);
		wincount++;
		gamecount++;
	}
	
	
	// 패배
	public void lose(){
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	
	// 무승부
	public void even(){
		gamecount++;
	}
	
	public String toString(){
		return "["+name+":"+gamecount+" games, "+wincount+" win, "+losecount+ " lose"+"]";
	}
}
