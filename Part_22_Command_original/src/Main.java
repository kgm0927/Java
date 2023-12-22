import command.*;
import drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame implements MouseMotionListener,WindowListener{

	// 그리고 이력
	private MacroCommand history=new MacroCommand();
	private DrawCanvas canvas=new DrawCanvas(400,400,history);
	private JButton clearButton=new JButton("clear");
	
	
	public Main(String title){
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(e->{
			history.clear();
			canvas.repaint();
		});
		
		Box buttonBox=new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		
		Box mainBox=new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		setVisible(true);
		
		
	}
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// 이 및에 있는 것은 MouseMotionListener에서 구현한 것이다.

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Command cmd=new DrawCommand(canvas,e.getPoint());
		history.append(cmd);
		cmd.execute();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args){
		new Main("Command Pattern Sample");
	}

}
