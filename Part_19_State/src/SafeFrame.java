import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SafeFrame extends Frame implements ActionListener, Context {

	private TextField textClock=new TextField(60);
	private TextArea textScreen=new TextArea(10,60);
	private Button buttonUse=new Button("금고 사용");
	private Button buttonAlarm=new Button("비상벨");
	private Button buttonPhone=new Button("일반 통화");
	private Button buttonExit=new Button("종료");
	
	
	private State state=DayState.getInstance();
	
	public SafeFrame(String title){
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		
		// textClock 배치
		add(textClock,BorderLayout.NORTH);
		textClock.setEditable(false);
		
		// textScreen 배치
		add(textScreen,BorderLayout.CENTER);
		textScreen.setEditable(false);
		
		// 패널에 버튼 저장
		Panel panel=new Panel();
		
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		
		// 그 패널을 배치
		add(panel,BorderLayout.SOUTH);
		
		// 표시
		pack();
		setVisible(true);
		
		// 리스너 설정
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		
		if(e.getSource()==buttonUse){
			state.douse(this);
		}else if(e.getSource()==buttonAlarm){
			state.doAlarm(this);
		}else if(e.getSource()==buttonPhone){
			state.doPhone(this);
		}else if(e.getSource()==buttonExit){
			System.exit(0);
		}else{
			System.out.println("?");
		}
	}

	@Override
	public void setClock(int hour) {
		// TODO Auto-generated method stub
		String clockString=String.format("현재 시간은 %02d:00", hour);
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this,hour);
	}

	@Override
	public void changeState(State state) {
		// TODO Auto-generated method stub
		System.out.println(this.state+"에서"+state+"으로 상태가 변했습니다.");
		this.state=state;
	}

	// 경비 센터 경비원 호출
	@Override
	public void callSecurityCenter(String msg) {
		// TODO Auto-generated method stub
		textScreen.append("call!"+msg+"\n");
	}

	@Override
	public void recordLog(String msg) {
		// TODO Auto-generated method stub
		textScreen.append("record ..."+msg+"\n");
	}


}

