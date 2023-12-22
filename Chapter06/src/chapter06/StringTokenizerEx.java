package chapter06;
import java.util.StringTokenizer;

// 예제 6-8: StringBuffer 클래스 메소드 활용

public class StringTokenizerEx {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
