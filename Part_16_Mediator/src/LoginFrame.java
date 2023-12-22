import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {

	
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;
	
	public LoginFrame(String title){
		super(title);
		
		// 배경색을 설정한다.
		setBackground(Color.lightGray);
		
		// 레이아웃 매니저를 사용해 4*2 그리드를 만든다
		setLayout(new GridLayout(4,2));
		
		// Colleague를 생성한다
		createColleagues();
		
		
		// 배치
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		
		add(new Label("Password:"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		// 활성 / 비활성 초기 설정을 한다
		colleagueChanged();
		
		// 표시한다.
		pack();
		setVisible(true);
		
	}
	
	@Override
	public void createColleagues() {
		// TODO Auto-generated method stub
		//CheckBox
		CheckboxGroup g=new CheckboxGroup();
		checkGuest=new ColleagueCheckbox("Guest",g,true);
		checkLogin=new ColleagueCheckbox("Login",g,false);
		
		// TextField
		textUser=new ColleagueTextField("",10);
		textPass=new ColleagueTextField("",10);
		textPass.setEchoChar('*');
		
		// Button
		buttonOk=new ColleagueButton("OK");
		buttonCancel=new ColleagueButton("Cancel");
		
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		// Listener 설정
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void colleagueChanged() {
		// TODO Auto-generated method stub
		
		if(checkGuest.getState()){
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		}else{
			// 사용자 로그인
			textUser.setColleagueEnabled(true);
			userpassChanged();
		}
		
	}

	private void userpassChanged() {
		// TODO Auto-generated method stub
		if(textUser.getText().length()>0){
			textPass.setColleagueEnabled(true);
			
			if(textPass.getText().length()>0){
				buttonOk.setColleagueEnabled(false);
			}else{
				buttonOk.setColleagueEnabled(false);
			}
			
			
		}else{
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);
	}

	
}

