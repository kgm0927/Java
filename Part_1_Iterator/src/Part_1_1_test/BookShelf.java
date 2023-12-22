package Part_1_1_test;

import java.util.Iterator;
import java.util.ArrayList;

public class BookShelf implements Iterable<Book>{

	private ArrayList<Book> books;	// 위임

	
	public BookShelf(int maxsize){
		this.books=new ArrayList<Book>(maxsize);// 객체 배열 생성
	}
	
	
	@Override
	public Iterator<Book> iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}
	
	public Book getBookAt(int index){
		return books.get(index);
	}
	
	public int getLength(){
		return books.size();
	}
	
	public void appendBook(Book book){
		books.add(book);
	
	}


	
}
