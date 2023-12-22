/**
 * 			프레임에 컴포넌트 붙이기
 * 
 * 프레임은 응용프로그램을 구성하는 바탕 틀이다. 지금부터 프레임 안에 스윙 컴포넌트를 부착해본다.
 * 
 * * 타이틀 달기
 * 
 * 프레임에 타이틀을 달기 위해서는 다음과 같이 super()를 이용하여 JFrame의 생성자를 호출하거나, 
 * JFrame 클래스의 setTitle() 메소드를 사용한다.
 * 
 * 
 * 
 * public MyFrame(){
 * 
 * 		super("타이틀문자열");		//	JFrame("타이틀문자열") 생성자를 호출하여 타이틀 달기
 * 		setTitle("타이틀문자열");	//  메소드를 호출하여 타이틀 달기
 * }
 * 
 * 
 * 
 * 
 * 타이틀은 스윙 응용프로그램의 타이틀 바에 출력된다.
 * 
 * 
 * 
 * 
 * * 메뉴 붙이기
 * 
 * 메뉴를 작성하기 위해서는 메뉴바를 만들고, 메뉴를 붙이고, 메뉴에는 여러 개의 메뉴 아이템을 붙인다. 메뉴바를
 * JFrame의 메뉴바 영역에 붙이면 화면에 메뉴가 출력된다. 이는 14장에 나온다.
 * 
 * 
 * 
 * * 컨텐트팬에 컴포넌트 달기
 * 
 * 스윙에서는 컨텐트팬(contentpane)에만 컴포넌트를 부착할 수 있다. JFrame 객체가 생길 때 컨텐트팬이 자동으로 생성된다.
 * 그러므로 현재 프레임에 붙어있는 컨텐트팬을 알아내기 위해서는, 다음과 같이 JFrame 클래스의 getContentPane() 메소드를 호출한다.
 * 컨텐트팬은 Container 타입이다.
 * 
 * 
 * public class MyFrame extends JFrame{
 * 
 * public MyFrame(){
 * 
 * 	Container contentPane=getContentPane();// 프레임에 부착된 컨텐트팬을 알아낸다.
 * 
 * 
 * }
 * }
 * 
 * 컨텐트팬에 컴포넌틀르 붙이는 것은 비교적 간단하다. 컨텐트펜은 컨테이너이기 때문에 다음과 같이 add()를 이용하여
 * 간단히 컴포넌트를 부탁한다.
 * 
 * 		JButton button=new JButton("Click");
 * 		contentPane.add(button);
 * 
 * 컨텐트팬에 부착된 컴포넌트들은 프레임이 출력될 때 함께 화면에 출력된다.
 * 
 * 
 * 
 * * 컨텐트팬의 변경
 * 
 * JFrame 클래스의 setContentPane() 메소드를 사용하면 프레임에 부착된 컨텐트팬을 제거하고 새로운 컨텐트팬을 붙일 수 있다.
 * 컨텐트팬은 Container 타입이므로 Container를 상속받은 어떤 컨테이너도 컨텐트팬이 될 수 있다. 다음 코드는 JPanel을 상속받는
 * MyPanel 객체를 생성하여 컨탠트팬으로 붙이는 예이다.
 * 
 * 
 * 
 * class MyPanel extends JPanel{
 * 
 * 		// JPanel을 상속받은 패널을 작성한다.
 * }
 * 
 * frame.setContentPane(new MyPanel()); // 프레임의 컨텐트팬을 MyPanel 객체로 변경
 * 
 * 
 */

import javax.swing.*;
import java.awt.*;



public class ContentPaneEx extends JFrame {

	public ContentPaneEx(){
		setTitle("ContentPane과 JFrame");				// 프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		
		
		Container contentPane=getContentPane(); // 컨텐트 팬을 알아낸다.
		contentPane.setBackground(Color.ORANGE);// 컨텐트팬의 색을 오렌지색으로 
		contentPane.setLayout(new FlowLayout());	// 컨텐트팬에 FlowLayout 배치관리자 달기
		
		contentPane.add(new JButton("OK")); // OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기
		
		setSize(300,150);
		setVisible(true);
	}
	
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ContentPaneEx();
	}

}

/**
 * 
 * 		스윙 응용프로그램의 종료
 * 
 * 자바에서 프로그램을 종료하려면 어떤 상황에서나 다음 코드를 사용하면 된다.
 * 
 * 		System.exit(0); // 자바 프로그램을 종료한다.
 * 
 * 한편 프레임 윈도우의 오른쪽 상단에 있는 '프레임 종료 버튼'은 프레임 윈도우를 닫는 버튼이지 프로그램을 종료시키는 버튼은 아니다.
 * 사용자가 스윙 프로그램을 종료하기 위해 '프레임 종료 버튼(x)'을 클릭하면 프레임이 화면에 사라지지만 프로그램은 종료되지 않고 
 * 살아있다. 프레임 윈도우가 닫힐 때 스윙 프로그램도 함께 종료시키고자 한다면 다음 코드를 삽입하여야 한다.
 * 
 * 
 * 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * 
 * 
 * 
 * 
 * 
 * 
 * 		main() 메소드가 종료한 뒤에도 프레임이 살아있는 이유는 무엇인가?
 * 
 * 
 * 8장까지 다룬 콘솔 응용프로그램에서는 main() 메소드가 종료하면 자바 응용프로그램이 종료되었다. 그러나 스윙 응용프로그램에선
 * main() 메소드가 종료되어도 프레임 윈도우가 살아서 작성한다. 그 이유는 무엇인가?
 * 
 * 자바 응용프로그램이 시작되면 자바 가상 기계(JVM)은 'main 스레드'를 만들고 main()을 실행시킨다. 응용프로그램이 스레드를
 * 만들지 않는 경우, main() 종료되면 main 스레드도 종료되며, 더 이상 살아있지 않는 스레드가 없기 때문에 이 응용프로그램은 종료한다.
 * 
 * 
 * 그러나 스윙에서 JFrame 객체가 생성되면 main스레드 외에 입력되는 키와 마우스의 움직임을 컴포넌트에게 이벤트로 전달하는 이벤트 처리 스레드
 * (Event Dispatch Thread)가 자동으로 추가 생성된다. 그러므로 main 스레드가 종료하더라도 이벤트 처리 스레드가 살아있기 때문에, 자바
 * 응용프로그램은 종료되지 않고 사용자로부터 키와 마우스 입력을 계속 처리하게 되는 것이다.
 * 
 * 
 * 
 * 
 * 
 */
