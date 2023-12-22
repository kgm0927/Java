package chapter07;

import java.util.*;


// 예제 7-6: HashMap을 이용하여 자바 과목의 이름과 점수 관리
public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이름과 점수를 저장할 HashMap 컬렉션을 생성
		HashMap<String,Integer> scoreMap=new HashMap<String,Integer>();
			// var scoreMap=new HashMap<String,Integer>();로 간략히 써도 됨.
		
		
		// 5개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		
		System.out.println("HashMap의 요소 개수 : "+scoreMap.size());
		
		// 모든 사람의 점수 출력. scoreMap에 들어 있는 모든 (key,value)쌍 출력
		Set<String> keys=scoreMap.keySet(); // 모든 key를 가진 Set 컬렉션 리턴
		Iterator<String> it=keys.iterator(); // Set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴
		
		while(it.hasNext()){
			String name=it.next();
			int score=scoreMap.get(name);
			System.out.println(name+" : "+score);
		}
		

	}

}
