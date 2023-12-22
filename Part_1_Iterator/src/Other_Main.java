import java.util.Iterator;

public class Other_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BookShelf bookShelf=new BookShelf(4);
		
		bookShelf.appendBook(new Book("Around the World in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		
		
		// 명시적으로 Iterator를 사용하는 법
		Iterator it=bookShelf.iterator();// 업캐스팅을 통하여 Iterator 인터페이스로 사용함. 만약 제네릭을 사용하지 않을 경우
		
		while(it.hasNext()){
			
			Book book=(Book)it.next();// 명시적으로 변환 값을 설정해 줘야 함.
			System.out.println(book.getName());
		}
		System.out.println();
		
		for(Book book:bookShelf){
			System.out.println(book.getName());
		}
		System.out.println();
	
	}
}
