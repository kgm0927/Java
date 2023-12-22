package test4;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	
    public static void main(String[] args) {
        // 프레임 생성
    	Panel panel=new Panel();
        JFrame frame = new JFrame("UTF-8 버튼 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // UTF-8로 인코딩된 문자열을 포함하는 버튼 텍스트
        String utf8Text = "안녕하세요"; // UTF-8로 인코딩된 문자열을 직접 넣어도 됩니다.

        // 버튼 생성 및 UTF-8 문자열 설정
        JButton button = new JButton(utf8Text);

        // 프레임에 버튼 추가
        frame.add(panel);
        panel.add(button);

        // 프레임 표시
        frame.setVisible(true);
    }}


