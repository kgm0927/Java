package chapter4;
import java.util.Scanner;

// 예제 4-7: 객체 배열 만들기 연습

class Book_1{
	String title, author;
	public Book_1(String title, String author){
		this.title=title;
		this.author=author;
		
	}
}

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book []book_1=new Book[2];
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<book_1.length;i++){
			System.out.println("제목>>");
			String title=scanner.nextLine();	// Scanner의 nextLine()으로 한 줄(빈칸 포함)의 하나의 문자열로 읽음.
			System.out.println("저자>>");
			String author=scanner.nextLine();
			book_1[i]=new Book(title,author);
		}
		
		
		for(int i=0;i<book_1.length;i++)
			System.out.print("("+book_1[i].title+", "+book_1[i].author+")");
		
		
		scanner.close();
		
	}

}
