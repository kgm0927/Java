package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command{

	private Deque<Command> commands=new ArrayDeque<>();

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
		if(!commands.isEmpty()){
			commands.pop();
		}
	}
	
	
	// 전부 삭제
	public void clear(){
		commands.pop();
	}
	
}
