
/**
 *  9.4 컨테이너(Container)와 배치(Layout)
 *  
 *  
 *  
 *  	컨테이너와 배치 개념
 *  
 *  
 *  컨테이너에 부착되는 컴포넌트들의 위치와 크기는 컨테이너 내부의 배치관리자(Layout Manager)에 의해 결정된다.
 *  
 *  
 *  배치와 관련하여 AWT나 스윙의 컨테이너는 다음과 같은 특징을 가진다.
 *  
 *  1. 컨테이너마다 배치관리자가 있다.(하지만, 배치관리자를 삭제할 수도 있다.)
 *  2. 배치관리자는 '컨테이너에 컴포넌트가 부착되는 시점'에 컴포넌트의 위치와 크기를 결정한다.
 *  3. 컨테이너의 크기가 변경되면 배치관리자는 컨테이너 내부의 모든 컴포넌트의 위치와 크기를 조정한다.
 *  
 *  
 *  
 *  
 *  
 *  	배치관리자의 종류
 *  
 *  자바는 여러 종류의 배치관리자를 보여준다. 아래에 있는 내용은 4가지 배치관리자가 컴포넌트를 배치하는 형태를 보여준다.
 *  배치관리자는 java.awt 패키지에 존재하는 클래스들이며, 이들을 이용하기 위해서는 다음 import문이 필요하다.
 *  
 *  
 *  		import java.awt.*;
 *  
 *  
 *  * FlowLayout
 *  
 *  컨테이너에 부탁되는 순서대로 '왼쪽에서 오른쪽으로' 컴포넌트를 배치하며, 오른쪽에 더 이상 배치할 공간이 없으면 아래로
 *  내려와서 다시 왼쪽에서 오른쪽으로 배치한다. 컴포넌트의 크기는 화면에 출력될 수 있는 적당한 크기로 설정한다.
 *  
 *  
 *  * BorderLayout
 *  
 *  컨테이너 공간을 동(EAST), 서(WEST), 남(SOUTH), 북(NORTH), 중앙(CENTER)의 5개의 영역으로 나누고 응용프로그램에서
 *  지정한 영역에 컴포넌트를 배치한다. 응용프로그램에서는 5개의 영역 중 하나를 반드시 지정하여야 한다. 영역을 지정하지 않으면 중앙
 *  에 배치된다. 컴포넌트의 크기는 영역의 크기에 맞추어 설정된다.
 *  
 *  
 *  * GridLayout 
 *  
 *  컨테이너의 공간을 응용프로그램에서 설정한 동일한 크기의 2차원 격자로 나누고, 컴포넌트가 삽입되는 순서대로 좌에서 우로, 다시 위에서
 *  아래로 배치한. 컴포넌트의 크기는 셀의 크기와 동일하게 설정한다.
 *  
 *  * CardLayout
 *  
 *  컨테이너의 공간에 카드를 쌓아 놓은 듯이 컴포넌트를 포개어 배치한다. 컴포넌트의 크기는 컨테이너의 크기와 동일하게 설정한다.
 *  
 *  
 *  
 *  
 *  
 *  		컨테이너의 디폴트 배치관리자
 *  
 *  컨테이너가 생성될 때 자동으로 디폴트 배치관리자가 생성되며 이들은 <표 9-1>과 같다.
 *  
 *  
 *  --------------------------------------------------------------------------------------------------------
 *  	AWT와 스윙 컨테이너		|									디폴트 배치관리자
 *  --------------------------------------------------------------------------------------------------------
 *  	Window, JWindow		|								BorderLayout
 *  --------------------------------------------------------------------------------------------------------
 *  	Frame, JFrame		|								BorderLayout
 *  --------------------------------------------------------------------------------------------------------
 *  	Dialog, JDialog		| 								BorderLayout
 *  --------------------------------------------------------------------------------------------------------
 *  	Panel, JPanel		|								FlowLayout
 *  --------------------------------------------------------------------------------------------------------
 *  	Applet, JApplet		|								FlowLayout
 *  --------------------------------------------------------------------------------------------------------
 *  
 *  
 *  
 *  		컨테이너에 새로운 배치관리자 설정, setLayout() 메소드
 *  
 *  컨테이너에는 새로운 배치관리자를 마음대로 설정할 수 있다. 이를 위해 다음과 같이 Container 클래스의 setLaout() 메소드를 호출한다.
 *  
 *  
 *  		Container.setLayout(LayoutManager lm);	// lm을 새로운 배치관리자로 설정한다.
 *  
 *  
 *  
 *  
 *  예를 들어, JPanel에 BorderLayout 배치관리자를 설정하려면 다음과 같다.
 *  
 *  	JPanel p=new JPanel();		// 패널 생성
 *  	p.setLayout(new BorderLayout()); // 패널에 BorderLayout() 메소드를 호출한다.
 *  
 *  
 *  또한 컨텐트팬의 배치관리자를 FlowLayout으로 변경하려면 다음과 같이 한다.
 *  
 *  	Container ContentPane=frame.getContentPane();// 프레임의 컨텐트팬
 *  	contentPane.setLayout(new FlowLayout());// FlowLayout 배치관리자 설정
 *  
 *  
 *  
 *  9.5 FlowLayout 배치관리자
 *  
 *  
 *  		배치 방법
 *  
 *  FlowLayout 배치관리자를 가닌 컨테이너에 컴포넌트를 부착하는 방법은 다음과 같이 간단히 add() 메소드를 이용하면 된다.
 *  
 *  container.setLayout(new FlowLayout());
 *  container.add(new JButton("add"));
 *  container.add(new JButton("sub"));
 *  container.add(new JButton("mul"));
 *  container.add(new JButton("div"));
 *  container.add(new JButton("Calculate"));
 *  
 *  
 *  FlowLayout 배치관리자는 컴포넌트를 왼쪽에서 오른쪽으로 배치하고, 더 이상 오른쪽 공간이 없으면 다시 아래로 내려와서 왼쪽에서
 *  오른쪽으로 배치한다.
 *  5개의 버튼 컴포넌트가 순서대로 부착된 모습을 보여준다. 컨테이너의 크기가 변하면, FlowLayout 배치관리자에 의해 컨테이너 크기에
 *  맞도록 컴포넌트가 재배치된다.
 *  
 *  
 *  
 *  
 *  FlowLayout의 생성자 속성
 *  
 *  FlowLayout 배치관리자의 생성자는 다음과 같이 여러 개 있으며, 생성자에 컴포넌트 사이의 간격과 정렬 방식을 지정할 수 있으며
 *  예제 9-3 FlowLayout 배치관리자의 align, hGap, vGap 속성을 각각 보여준다.
 *  
 *   FlowLayout()
 *   FlowLayout()
 *   FlowLayout(int align,int hGap, int vGap)
 *   	align: 컴포넌트의 정렬방법, 왼쪽 정렬(FlowLayout.LEFT), 오른쪽 정렬(FlowLayout.RIGHT), 중앙정렬(FlowLayout.CENTER(디폴트))
 *   	hGap: 좌우 컴포넌트 사이의 수평 간격, 픽셀단위, 디폴트는 5
 *   	vGap: 상하 컴포넌트 사이의 수평 간격, 픽셀단위, 다폴트는 5
 *   
 *  
 *  
 *  
 *  
 */
import javax.swing.*;
import java.awt.*;



public class FlowLayout extends JFrame{

	
	public FlowLayout(){
		setTitle("FlowLayout Sample");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
