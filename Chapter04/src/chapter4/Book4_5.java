package chapter4;



// 예제 4-5: 예제 4-5에서 Book 클래스의 생성자를 this()를 이용해 수정하라.
public class Book4_5 {
	
	String title;
	String author;
	
	void show(){
		System.out.println(title+" "+author);
	}
	
	public Book4_5(){
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book4_5(String title){
		this(title,"작가미상");
	}
	

	public Book4_5(String title, String author) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.author=author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book4_5 littlePrince=new Book4_5("어린왕자","생택쥐페리");
		Book4_5 loveStory=new Book4_5("춘향전");
		Book4_5 emptyBook=new Book4_5();
		
		loveStory.show();
	}

}
