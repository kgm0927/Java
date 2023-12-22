package teamProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicFrame extends Adapter_Omok{
	private static JPanel contentPane;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					BasicFrame frame = new BasicFrame(contentPane);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public BasicFrame(JPanel contentPane) {
	super(contentPane);
	}

}
