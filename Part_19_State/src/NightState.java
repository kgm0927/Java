
public class NightState implements State{

	
	private static NightState singleton =new NightState();
	
	private NightState(){
		
	}
	public static State getInstance(){
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		
		if(12<=hour && hour<13){
			context.changeState(NoonState.getInstance());
		}
	else if(9<=hour && hour<17){
			context.changeState(DayState.getInstance());
		}
		
	}

	@Override
	public void douse(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("비상:야간 금고 사용");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("비상벨(야간)");
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("야간 통화 녹음");
		
	}
	
	public String toString()
	{
		return "[야간]";
	}
}
