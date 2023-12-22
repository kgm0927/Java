package chapter4;

import java.util.Scanner;


// 예제 4-2: Rectangle 클래스 만들기 연습
class Rectangle{
	int width;
	int height;
	public int getArea(){
		return width*height;
	}
}

public class RectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();// 객체 생성
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> ");
		rect.width=scanner.nextInt();
		rect.height=scanner.nextInt();
		System.out.println("사각형의 면적은"+rect.getArea());
	}

}
