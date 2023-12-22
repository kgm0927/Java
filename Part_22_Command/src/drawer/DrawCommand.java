package drawer;

import command.Command;

import java.awt.Color;
import java.awt.Point;

public class DrawCommand implements Command{

	// 그리는 대상
	protected Drawable drawable;
	protected Color color;
	// 그리는 위치
	private Point position;
	
	
	public DrawCommand(Drawable drawable,Point position) {
		// TODO Auto-generated method stub
		this.drawable=drawable;
		this.position=position;
		
	}

	// 실행
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		drawable.draw(position.x,position.y);
	}
	
	

}
