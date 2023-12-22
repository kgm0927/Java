import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague{

	
	private Mediator mediator;
	
	public ColleagueTextField(String text,int columns){
		super(text, columns);
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator=mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
		// 활성 ,비활성에 맞게 배경색을 변경한다.
		setBackground(enabled? Color.white:Color.lightGray);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		// 문자열이 바뀌면 Mediator에게 알린다.
		mediator.colleagueChanged();
		
	}

	
}
