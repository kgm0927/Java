package drawer;

import command.MacroCommand;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrawCanvas extends Canvas implements Drawable{

	// 그리는 색
	private Color color;
	// 그리는 점의 반지름
	private int radius=6;
	// 이력
	


	private MacroCommand history;
	

	
	// 생성자
	public DrawCanvas(int width,int height,MacroCommand history){
		setSize(width,height);
		setBackground(Color.white);
		this.history=history;
		init();
	}
	
	
	// 이력 전체 다시 그리기
	public void paint(Graphics g){
		history.execute();
	}
	
	
	
	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		Graphics g;
		g=getGraphics();
		g.setColor(color);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}


	@Override
	public void init() {
		// TODO Auto-generated method stub
		color=Color.red;
		history.append(new color_command(this,color));
	}


	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub

		this.color=color;
	}

}
