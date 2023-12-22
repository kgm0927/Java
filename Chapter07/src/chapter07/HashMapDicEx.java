package chapter07;

import java.util.*;


// 예제 7-5: HashMap을 이용하여 (영어,한글) 단어 쌍의 저장 검색
public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> dic=new HashMap<String,String>();// 해시맵 생성
				// var dic=new HashMap<String, String>(); 로 간략히 써도 된다.
		
		// 3개의 (key, value) 쌍을 dic에 저장
		dic.put("baby", "아기");	// "baby"는 key, "아기"은 value
		dic.put("love", "사랑");
		dic.put("apple","사과");
		
		// 사용자로부터 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
		Scanner scanner=new Scanner(System.in);
		
		while(true){
			System.out.println("찾고 싶은 단어는");
			String eng=scanner.next();
			if(eng.equals("exit")){
				System.out.println("종료합니다...");
				break;
		}
		
		// 해시맵에서 '키' eng의 '값' kor 검색
		String kor=dic.get(eng);
		if(kor==null)
			System.out.println(eng+"는 없는 단어입니다.");
		else
			System.out.println(kor);
	}
	}
}
