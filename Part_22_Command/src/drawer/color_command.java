package drawer;

import java.awt.Color;

import command.Command;

public class color_command implements Command {

	protected Drawable drawable;
	
	private Color color;
	
	public color_command(Drawable drawable, Color color){
		this.drawable=drawable;
		this.color=color;
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		drawable.setColor(color);
	}
	
	
}
