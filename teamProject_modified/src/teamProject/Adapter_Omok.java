package teamProject;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Adapter_Omok extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final int STONE_SIZE = 26;
	
	
	public Adapter_Omok(JPanel contentPane){
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 480); // 15 by 15
		
	contentPane = new JPanel() {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.BLACK);
			for (int i = 10; i < 450; i = i + 30) { // 10,10 시작 30씩 증가,
				g.drawLine(10, i, 460 - 30, i);
				g.drawLine(i, 10, i, 460 - 30);
			}
			
			int X = 7 * 30 + 10 - STONE_SIZE / 2;
			int Y = 7 * 30 + 10 - STONE_SIZE / 2;
			g.fillOval(X, Y, STONE_SIZE, STONE_SIZE);
		}
	};
	contentPane.addMouseListener(new StoneDraw(contentPane));
	contentPane.setBackground(new Color(184, 134, 11));
	setContentPane(contentPane);
	}

}
