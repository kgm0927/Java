package command;


import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command{

	// 명령의 배열
	private Deque<Command> commands=new ArrayDeque();
	
	
	



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(Command cmd: commands){
			cmd.execute();
		}
	}
	
	
	public void append(Command cmd){
		if(cmd==this){
			throw new IllegalArgumentException("infinite loop caused by append");
		}
		commands.push(cmd);
	}
	
	
	// 마지막 명령을 삭제
	public void undo(){
		if(!commands.isEmpty()){	// 만약 배열에서 비어있지 않다면
			commands.pop();
		}
	}
	
	public void clear(){
		commands.clear();
	}
	
}
