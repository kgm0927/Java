package drawer;

import command.Command;
import java.awt.Point;


public class DrawCommand implements Command{
	// 그리는 대상
	protected Drawable drawable;	// 그리기를 실행할 대상을 저장한다.
	
	
	// 그리는 위치
	private Point position;
	
	// 생성자
	public DrawCommand(Drawable drawable,Point position){
		this.drawable=drawable;
		this.position=position;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		drawable.draw(position.x, position.y);
	}
	
	
}
