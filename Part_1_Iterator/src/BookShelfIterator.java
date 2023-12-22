
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book>{

	private BookShelf bookShelf;
	private int index;
	
	
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf=bookShelf;
		this.index=0;
	}
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<bookShelf.getLength()){
			return true;
		}else{
			
		
		
		return false;
	}
	}
	@Override
	public Book next() {
		// TODO Auto-generated method stub
		if(!hasNext()){
			throw new NoSuchElementException();
		}
		Book book=bookShelf.getBookAt(index);// 만약 BookShelf 클래스에서 getBookAt함수가 바뀌면 이 부분도 그에 맞게 수정해야 함.
		index++;
		return book;
	}

	/*
	 * 왜 Iterator가 유용한가?
	 * 
	 * 집합체의 구현 방법 즉 내부 구조를 변경하더라도 집합체의 원소를 검색하는 방법은 영향을 받지 않기 때문이다.
	 * 
	 * - 집합체의 원소를 검색하기 위해 Iterator를 사용하기 때문.
	 * 
	 * 
	 * */
}
