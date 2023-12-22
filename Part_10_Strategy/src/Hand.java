
public enum Hand {

	
	ROCK("바위",0),
	SCISSORS("가위",1),
	PAPER("보",2);
	
	
	// enum이 가진 필드
	
	private String name;
	private int handvalue;
	
	private static Hand[]hands={
			ROCK,SCISSORS,PAPER
	};
	
	private Hand(String name,int handvalue){
		this.name=name;
		this.handvalue=handvalue;
	}
	
	public static Hand getHand(int handvalue){
		return hands[handvalue];
	}
	
	// this가 h보다 강할 때
	public boolean isStrongerThan(Hand h){
		return fight(h)==1;
	}
	
	
	public boolean isWeakerThan(Hand h){
		return fight(h)==-1;
	}
	
	private int fight(Hand h){
		if(this==h){ // 무승부
			
			return 0;
			
		}else if((this.handvalue+1)%3==h.handvalue){// (바위+1 VS 가위 ), (가위+1 VS 보), (보+1 VS 바위)// 승리
			
			return 1;
			
		}else{// 패배
			
			return -1;
			
		}
	}
	
	// 가위 바위 보 문자열 표현
	
	public String toString(){
		
		return name;
		
	}
}
