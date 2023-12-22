
import java.util.Iterator;

public class BookShelf implements Iterable<Book>{

	private Book[] books;	// 위임
	private int last=0;
	
	public BookShelf(int maxsize){
		this.books=new Book[maxsize];// 객체 배열 생성
	}
	
	
	@Override
	public Iterator<Book> iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}
	
	public Book getBookAt(int index){
		return books[index];
	}
	
	public int getLength(){
		return last;
	}
	
	public void appendBook(Book book){
		this.books[last]=book;
		last++;
	}


	
}
