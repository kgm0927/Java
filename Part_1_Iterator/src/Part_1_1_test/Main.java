package Part_1_1_test;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BookShelf bookShelf=new BookShelf(4);
		
		bookShelf.appendBook(new Book("Around the World in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		
		
		// 명시적으로 Iterator를 사용하는 법
		Iterator<Book> it=bookShelf.iterator();// 업캐스팅을 통하여 Iterator 인터페이스로 사용함.
		
	for(Book book:bookShelf){
		System.out.println(book.getName());
	}
	System.out.println();
	
	}

}
